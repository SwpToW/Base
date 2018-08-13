package day28;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTest {
     public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con=JDBC.getCon();
		String sql="select * from Users";
		PreparedStatement pst=con.prepareStatement(sql);
		ResultSet rs=pst.executeQuery();
		/*while(rs.next()){
			System.out.println(rs.getInt("userid")+"  "+rs.getString("username")+"  "+rs.getString("emailadress"));
		}*/
		String sql1="delete  from Users where username='张三'";
		PreparedStatement pst1=con.prepareStatement(sql1);
		pst1.executeUpdate();
		/*String sql=" insert into Users values(?,?,?)";
		
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setString(1, null);
		pst.setString(2, "WWW");
		pst.setString(3, "16565456@qq.com");
		pst.executeUpdate();*/
		
		rs.close();//先得到的后关闭，后得到的后关闭
		pst.close();
		con.close();
	}
}
