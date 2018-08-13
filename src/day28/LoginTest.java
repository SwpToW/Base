package day28;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

/*
 * SQL注入
 */
public class LoginTest {
   @Test
   public void loginTest(){
	   try {
		login("Swp","978934842@qq.com");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
   public void login (String name,String password) throws ClassNotFoundException, SQLException{
	   Connection con=JDBC.getCon();
	   Statement stmt=con.createStatement();
	
	   String sql=" select * from users where "+" username='"+name+"' and emailadress='"+password+"'";
	   ResultSet rs=stmt.executeQuery(sql);
	   if(rs.next()){
		   System.out.println(name+"登陆成功");
		  
	   }else{
		   System.out.println("登陆失败");
	   }
	   if(rs!=null){
		   rs.close();
	   }
	   if(stmt!=null){
		   stmt.close();
	   }
	   if(con!=null){
		   con.close();
	   }
   }
   
}
