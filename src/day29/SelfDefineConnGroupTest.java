package day29;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.LinkedList;
import java.util.logging.Logger;

import javax.sql.DataSource;

import day28.JDBCUtils;
import day28.JDBCUtilsBundle;
//连接池类记得实现DataSource接口
public class SelfDefineConnGroupTest implements DataSource{
	//1.创建一个容器LinkedList来存储连接
	private static LinkedList<Connection> pool=new LinkedList<Connection>();
	static{
	for(int i=0;i<5;i++){
		Connection con=JDBCUtils.getCon();
		pool.add(con);
	 }
	}
	public Connection getConnection() throws SQLException {
		Connection con=null;
		if(pool.size()==0){//先判断连接池里是否有连接 ，没有的话先创建几个
			for(int i=0;i<5;i++){
				con=JDBCUtilsBundle.getCon();
				pool.add(con);
			 }
		} 	
		Connection conn=pool.remove(0);//得到连接
		return conn;
	}
	public void BackPool(Connection con){
		pool.add(con);//将使用过后的连接交还给连接池
	}


	@Override
	public PrintWriter getLogWriter() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLogWriter(PrintWriter out) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setLoginTimeout(int seconds) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getLoginTimeout() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}


	

	@Override
	public Connection getConnection(String username, String password) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
