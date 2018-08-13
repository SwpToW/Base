package day24;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * �ֽ�������Ļ�����
 * java.io.BufferedOutputStream  ����:���ԭ���������д��Ч��
 * BufferedOutputStream�̳�OutputStream
 * ������ write() д���ֽں��ֽ�����
 * ���췽����
 *   bufferedOutputStream (OutputStream out)  ������������ֽ������
 */
public class BufferedOutputStreamTest {   
  public static void main(String[] args) throws IOException {
	//FileOutputStream fos=new FileOutputStream("D:\\gbk.txt");//�ֽ������  
	//BufferedOutputStream bos=new BufferedOutputStream(fos);
	//bos.write("helloshabi".getBytes());
	BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("D:\\gbk.txt")); //����д��
	FileInputStream fis=new FileInputStream("C:\\gbk.txt");
	BufferedInputStream bis=new BufferedInputStream(fis);
	byte[] arr=new byte[1024];
	
	
	int len=0;
	while((len=bis.read(arr))!=-1){
		bos.write(arr,0,len);
	}
	bos.close(); //��סҪ�رջ���ˢ��
	bis.close();
	
}
}
