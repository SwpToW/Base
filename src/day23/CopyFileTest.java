package day23;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;

/*
 * �ļ��ĸ���
 */
public class CopyFileTest {
  public static void main(String[] args) {
	  long x=System.currentTimeMillis();
	
	FileInputStream fis=null;
	FileOutputStream fos=null;
	try{
		fis=new FileInputStream("D:\\201520180301��ΰ��.docx");
		fos=new FileOutputStream("C:\\201520180301��ΰ��.docx");
		/*int len=0;
		while((len=fis.read())!=-1){  //���ֽ�һ��һ�����ƵĻ��������ֽ�������ļ�ѭ��������Ч�ʵ�
			fos.write(len);
		}*/
		//Ϊ������Ч�ʣ�ʹ���ֽ�����������
		byte[] arr=new byte[1024];
		int len=0;
		while((len=fis.read(arr))!=-1){
			fos.write(arr,0,len);
		}
	}catch(IOException e){
		e.printStackTrace();
	}finally{
		if(fos!=null){
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{  //finally��������п����ͷ���Դ
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
	long a=System.currentTimeMillis();
	System.out.println(a-x);
}
}
