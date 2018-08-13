package day23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* �ֽ�������
 *  InputStream �������ֽ��������ĳ���
 *  ����:��ȡ�ļ���ÿ��ֻ��һ���ֽ�
 *  ��ȡ������������
 *  int read()  ��ȡһ���ֽ� read�����ص� ��ֻҪִ��һ�Σ��ͻ��Զ���ȡ��һ���ֽڣ�����ֵ���Ƕ�ȡ�����ֽ�
 *  ����ȡ���ļ��Ľ�βʱ����-1��
 *  
 *  int read(byte[] b) ��ȡһ�����ֽڣ���ŵ������� �������ֵ�����ȡ���˶��ٸ���Ч���ֽ���
 * 
 */
public class InputStreamTest {
   public static void main(String[] args) {
	   FileInputStream fis=null;
	   try{
	 fis=new FileInputStream("C:\\a.txt");
	 /*
	  * ѭ����ȡ�ֽڵķ�ʽ
	  * int len=0;
	  * while((len=fis.read())!=-1){
	  * system.out.println((char)len);
	  * }
	  * 
	  * ѭ����ȡ�ֽ�����ķ�ʽ
	  * byte[] arr=new byte[1024] //��Сȡ���ʵ�1024
	  * int len=0;//����read()�����ķ���ֵ
	  * while((len=fis.read())!=-1){
	  *   system.out.println(new String(arr,0,len)); //��arr�ж�ȡ��0��len�������ֽ�ת���ַ��������
	  * }
	  */
	int size=fis.available();
	byte[] arr=new byte[size];
	System.out.println(fis.read(arr)); //��ȡ���ķ���arr������
	String s=new String(arr);
	System.out.println(s);
	   }catch(FileNotFoundException e){
		   e.printStackTrace();
	   }catch(IOException e){
		   e.printStackTrace();
	   }finally{
		   if(fis!=null){
			   try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   }
	   }
	
}
}
