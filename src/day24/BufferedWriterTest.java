package day24;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * �ַ�������Ļ�����
 * java.io.bufferedWriter  �̳���Writer  
 * ��һ�����еķ��� void newline() д����
 * �����������ƽ̨�޹���  ��
 * windows���滻����\r\n ��LINUX������\n
 * write() ����д�����ַ����ַ����飬���ַ���
 * ���췽����
 *   BufferedWriter(Writer w) ���������ַ��� ����(FileWriter OutputStreamWriter)
 */
public class BufferedWriterTest {
   public static void main(String[] args) throws IOException {
	/*FileReader fw=new FileReader("c:\\gbk.txt");
	BufferedReader br=new BufferedReader(fw);
	char[] arr=new char[1024];
	int len=0;
	while((len=br.read(arr))!=-1){
		System.out.println(new String(arr,0,len));
	}
	br.close();*/
	   FileWriter fw=new FileWriter("D:\\gbk.txt",true);
	   BufferedWriter bw= new BufferedWriter(fw);
	   bw.newLine();
	   bw.write("���ѽ������");
	   bw.newLine();
	   bw.write("��ϲ���㰡");
	   bw.close();
	   
}
}
