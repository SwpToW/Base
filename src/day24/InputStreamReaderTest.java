package day24;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/*
 * ת����
 * java.io.InputstreamReader
 * �ַ��������������Զ�ȡ�ı��ļ�
 * �ֽ���ͨ���ַ�������
 *  ��ȡ�ķ���
 *  read() ��ȡһ���ַ����������ַ�����
 * 
 */
public class InputStreamReaderTest {
   public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("C:\\gbk.txt");
	InputStreamReader isr=new InputStreamReader(fis,"utf-8");
	char[] ch=new char[1024];
	int len=0;
	while((len=isr.read(ch))!=-1){
		System.out.println(new String(ch,0,len));
	}
}
}
