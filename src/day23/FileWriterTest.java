package day23;

import java.io.FileWriter;
import java.io.IOException;

/*
 * �ַ������
 * java.io.Writer �����ַ�������ĳ���
 * д�ķ���write
 * write(int c) дһ���ַ�
 * write(char[] c) д�ַ�����
 * write(char[] c,int off,int len)
 * write(String s) д���ַ���
 */
public class FileWriterTest {
   public static void main(String[] args) throws IOException {
	FileWriter fw=new FileWriter("C:\\a.txt",true);
	fw.write("\r\n���������");
	fw.flush();   //�ַ������д���ݵ�ʱ�򣬱���Ҫˢ�����Ļ���
	fw.close();
}
}
