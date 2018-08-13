package day29;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * 测试工具类
 */
import org.junit.Test;

import day28.JDBCUtils;
public class TestUtils {
	@Test
   public void TestInsert(){
	   Connection con=null;
	   PreparedStatement pst=null;
	   con=JDBCUtils.getCon();
	   String sql="insert into product values(?,?,?,?)";
	   try {
		 pst=con.prepareStatement(sql);
		 pst.setString(1, "p012");
		 pst.setString(2, "帕梅拉");
		 pst.setString(3, "1000");
		 pst.setString(4, "C001");
		int row=pst.executeUpdate();
		if(row>0){
			System.out.println("插入成功");
		}else{
			System.out.println("插入失败");
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally{
		JDBCUtils.release(con, pst, null);
	}
	   
	   
   }
   @Test
   public void TestFindById(){
	   Connection con=null;
	   PreparedStatement pst= null;
	   ResultSet rs=null;
	   try {
	    con=JDBCUtils.getCon();
	    String sql="select * from product where pid=?";
		 pst= con.prepareStatement(sql);
		pst.setString(1, "p008");
		 rs=pst.executeQuery();
		while(rs.next()){
			System.out.println(rs.getString("pid")+"   "+rs.getString("pname"));
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally{
		JDBCUtils.release(con, pst, rs);
	}
	   
   }
}
