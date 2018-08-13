package day28;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * 提供获取连接和释放资源的方法
 */
public class JDBCUtils {
	/*
	 * 获取连接
	 */
  public static Connection getCon(){
	  Connection con=null;
	  try{
	  Class.forName("com.mysql.jdbc.Driver");
	  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/product","root","970513");
	  }catch(Exception e){
		  e.printStackTrace();
	  }
	  return con;
  }
  public static void release(Connection con,PreparedStatement pst,ResultSet rs){
	  if(rs!=null){
		  try {
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	  if(pst!=null){
		  try {
			pst.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	  if(con!=null){
		  try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
  }
}
