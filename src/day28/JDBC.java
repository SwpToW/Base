package day28;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/*
 * mysql JDBC�ĳ�̽
 */
public class JDBC{
	public static Connection getCon() throws ClassNotFoundException, SQLException{
		Connection con=null;
		Class.forName("com.mysql.jdbc.Driver");//注册驱动
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Sunset", "root", "970513");
		return con;
	}
		
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		try{
			System.out.println(getCon());
		}catch(ClassCastException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
      
}
