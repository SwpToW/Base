package day24;


import java.io.FileOutputStream;
import java.io.IOException;

/*
 * �ֽ������
 *  OutputStream �����ֽ�������ĳ���
 *  ���ã���Java����д���ļ�
 *  ÿ����ÿ��ֻ�����ļ��е�һ���ֽ�
 *   void	write(byte[] b)  �� b.length ���ֽڴ�ָ���� byte ����д����������
         
 void	write(byte[] b, int off, int len) ��ָ�� byte �����д�ƫ���� off ��ʼ�� len ���ֽ�д����������
 //ע�������off len���ǿ�ʼ���� 
          
 void	write(int b)     ��ָ�����ֽ�д����������
 close()�������ر��������ͷ���֮��ص���Դ //��Ϊ����������ļ���ʱ���Լ���������������OS�Լ��Ĺ��ܣ� 
 
      
 */
public class OutputSteamTest {
     public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("C:\\a.txt",true); //�ļ�ʵ����д�������Ƿ��������ò���true��
		String str="��ȥ���ү";
		byte[] arr=str.getBytes();
	    fos.write(arr);
	    fos.write("\r\n����һ�����д��".getBytes()); //���з�\r\n ����д����һ�н�β��Ҳ����д�ڱ��п�ͷ
	    fos.close();
		
	}
}
