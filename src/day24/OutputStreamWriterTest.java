package day24;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * ת���� 
 * java3
 * �����ַ����飬�ַ���
 * 
 * �ַ���װ���ֽ���������
 * 
 * �ַ�����ת������ת����ȥ��ѯ������ַ�ת���ֽ�
 * ʹ�÷�����
 * �����������OutputStream  OutputStreamWriter(OutputStream out)  �������е��ֽ������
 * 
���췽��ժҪ
OutputStreamWriter(OutputStream out) 
          ����ʹ��Ĭ���ַ������ OutputStreamWriter��
OutputStreamWriter(OutputStream out, Charset cs) 
          ����ʹ�ø����ַ����� OutputStreamWriter��
OutputStreamWriter(OutputStream out, CharsetEncoder enc) 
          ����ʹ�ø����ַ����������� OutputStreamWriter��
OutputStreamWriter(OutputStream out, String charsetName)   ����ĵڶ��������Ǳ�������� GBK UTF-8
          ����ʹ��ָ���ַ����� OutputStreamWriter��
 */
public class OutputStreamWriterTest {
  public static void main(String[] args) throws IOException {
	function();
}
  /*
   * ת����д�ı�
   * ����GBK�����
   */
  public static void function() throws IOException{
	  FileOutputStream fos=new FileOutputStream("C:\\gbk.txt");
	  OutputStreamWriter osw=new OutputStreamWriter(fos,"utf-8");
	  osw.write("���ѽ������");
	  osw.close();
	  
  }
}
