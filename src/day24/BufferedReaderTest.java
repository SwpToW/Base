package day24;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * �ַ��������Ļ�����
 * java.io.BufferedReader �̳���Reader
 * ��ȡ����read() �����ַ����ַ�����
 *  ���췽��ͬBufferedWriter
 *  
 *  ����һ���Լ��Ĺ���
 *  String readline() ��ȡ�ı��� \r\n
 *  ��ȡ������ĩβʱ����null
 
 */
public class BufferedReaderTest {
    public static void main(String[] args) throws IOException {
    	int lineNumber=0;
		BufferedReader br=new BufferedReader(new FileReader("C:\\gbk.txt"));
	    /*String line=br.readLine();  //����ֵ��String����
	    System.out.println(line);  //���ж�     
	    br.close();*/
		String line=null;
		while((line=br.readLine())!=null){
			lineNumber++;
			System.out.println(lineNumber+" "+line);
		}
		br.close();
	}
}
