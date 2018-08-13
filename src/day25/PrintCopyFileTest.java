package day25;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * ��ӡ��ʵ���ı�����
 *   ��ȡ����ԴBufferedReader +FileReader ��ȡ�ı���
 *   д������Ŀ��printWriter +println �Զ�ˢ��
 */
public class PrintCopyFileTest {
   public static void main(String[] args) throws IOException {
	  BufferedReader br=new BufferedReader(new FileReader("c:\\test.txt"));
	  PrintWriter pw=new PrintWriter(new FileWriter("D:\\test.txt"),true);
	  String line=null;
	  while((line=br.readLine())!=null){
		  pw.println(line);
	  }
	  pw.close();
	  br.close();
}
}
