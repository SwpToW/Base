package day30;

import org.junit.Test;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapListHandler;

import com.mchange.v2.c3p0.ComboPooledDataSource;



public class DBUtils {
	@Test
	public void SelectUser(){//��ѯ
		QueryRunner qr=new QueryRunner(new ComboPooledDataSource());//������CP30���̳߳ض���
		try {
			//
			
			List<Map<String,Object>> list=qr.query("select * from users", new MapListHandler());
			for(Map<String,Object> map:list){
				System.out.println(map);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
   
    public void AddUser(){  //DBUtils��ɾ�Ĳ���Ҫ���ؽ�����ŵ�һ��
    	QueryRunner qr=new QueryRunner(new ComboPooledDataSource());
    	
    	try {
			int rows=qr.update("insert into users values(null,?,?)","WWW","4546@qq.com");
			if(rows>0){
				System.out.println("���³ɹ�");
			}else{
				System.out.println("����ʧ��");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
}
