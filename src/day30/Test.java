package day30;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test {
    @org.junit.Test
    public void updateC3P0(){
    	Connection con=null;
    	PreparedStatement pst=null;
    	con=C3P0Utils.getCon();
    
    	try {
    		String sql="update  product set price=? where pname=?";
			pst=con.prepareStatement(sql);
			pst.setString(1, "5000");
			pst.setString(2, "���ζ�");
			
			int rows=pst.executeUpdate();
			if(rows>0){
				System.out.println("���³ɹ�");
			}else{
				System.out.println("����ʧ��");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			C3P0Utils.close(con, pst, null);
		}
    	
    }
}
