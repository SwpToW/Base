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
//���ӳ���ǵ�ʵ��DataSource�ӿ�
public class SelfDefineConnGroupTest implements DataSource{
	//1.����һ������LinkedList���洢����
	private static LinkedList<Connection> pool=new LinkedList<Connection>();
	static{
	for(int i=0;i<5;i++){
		Connection con=JDBCUtils.getCon();
		pool.add(con);
	 }
	}
	public Connection getConnection() throws SQLException {
		Connection con=null;
		if(pool.size()==0){//���ж����ӳ����Ƿ������� ��û�еĻ��ȴ�������
			for(int i=0;i<5;i++){
				con=JDBCUtilsBundle.getCon();
				pool.add(con);
			 }
		} 	
		Connection conn=pool.remove(0);//�õ�����
		return conn;
	}
	public void BackPool(Connection con){
		pool.add(con);//��ʹ�ù�������ӽ��������ӳ�
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
