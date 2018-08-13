package day28;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

/*
 * 提供获取连接和释放资源的方法
 */
public class JDBCUtilsBundle {
	/*
	 * 获取连接
	 */
	private static String driver;
	private static String url;
	private static String username;
	private static String password;
	
	static{
		ResourceBundle bundle=ResourceBundle.getBundle("db");
	    driver=bundle.getString("driver");
	    url=bundle.getString("url");
	    username=bundle.getString("username");
	    password=bundle.getString("password");
	}
  public static Connection getCon(){
	  Connection con=null;
	  try{
	  Class.forName(driver);
	  con=DriverManager.getConnection(url,username,password);
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
