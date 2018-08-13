package day23;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * IO�����쳣���� try cathch finally
 * 
 * cathch{} ���洦���쳣
 * ������쳣��Ϣ����ֹͣ����(�����׳�һ������ʱ�쳣)
 * 
 * �����������ʧ�ܣ��Ǿ�û��Ҫ����close�������ͷ���Դ  
 * �������ͷ���Դ��ʱ��Ҫ��һ���ж����Ƿ�Ϊ�յĲ���
 */
public class IOExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos=null;  //ע��try����޶�fos��������������Զ���fos������������
		try{
        fos=new FileOutputStream("C:\\a.txt");
        fos.write(100);
		}
        catch(IOException e){
        		e.printStackTrace();  //�ȴ�ӡ������Ϣ
        		throw new RuntimeException("ɲ���������ļ�д��ʧ��");   //����Ҫͣ���� ���׳�һ�������쳣
        }	
        finally{
        try {
        	if(fos!=null){  //�ж��������Ƿ�Ϊ��
			fos.close();
        	}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//����Ҳ������һ������ʱ�쳣
		}
        }
	}

}
