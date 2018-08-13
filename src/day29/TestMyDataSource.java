package day29;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.junit.Test;

public class TestMyDataSource {
   @Test
   public void TestAdd(){
	   Connection con=null;
	   PreparedStatement pst=null;
	   SelfDefineConnGroupTest datasource=new SelfDefineConnGroupTest();
	   
	   try{
		 con=datasource.getConnection();
		 String sql="insert into product values('P013','大奔G','5000','C001')";
		 pst=con.prepareStatement(sql);
		 int rows=pst.executeUpdate();
		 if(rows>0){
			 System.out.println("添加成功");
		 }else{
			 System.out.println("添加失败");
		 }
		
	   }catch(Exception e){
		   e.printStackTrace();
	   }finally{
		    datasource.BackPool(con);
	   }
	   
   }
}
