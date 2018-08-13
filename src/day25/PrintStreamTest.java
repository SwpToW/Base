package day25;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * ��ӡ��
 * PrintStream  �ֽ�(����File���ͣ������ַ����ļ����������ֽ������OutputStream)
 * PrintWriter   �ַ�(����File���ͣ������ַ����ļ����������ֽ������OUTputStream�������ַ������writer)
 *   ����������ӡ���ķ�����ȫһ��
 *   �������ڹ�������
 *   ���췽���Ĳ������Ǵ�ӡ�������Ŀ��
 * ��ӡ�����ص㣺
 * 1.������������Դ��ֻ��������Ŀ��
 * 2.Ϊ�����������ӹ���
 * 3.��Զ�����׳�IO�쳣
 *   �������׳�����쳣
 *   
 *   ��ӡ�������Զ�ˢ�¹��� (��ӡ�����췽���ڶ�����������Ϊtrue)
 *   ��������������1.�������Ŀ�ı�����������
 *             2.�������println,printf,format���������е�����һ��
 */
public class PrintStreamTest {
   public static void main(String[] args) throws IOException {
	function2();
}
   /*
    * ��ӡ������File���������Ŀ��д������
    * 
    */
   public static void function() throws FileNotFoundException{
	   File file=new File("c:\\test.txt");
	   PrintWriter pw=new PrintWriter(file);
	   pw.print("hello");//print����ԭ�����
	   //pw.write("100");write()����������� ��������������ʱ
	   pw.write("���ſ�");
	   pw.close();
	   
   }
   /*
    * ��ӡ�������Ŀ����������
    * 
    */
   public static void function1() throws IOException{
	   FileOutputStream fos=new FileOutputStream("c:\\test.txt",true);
	   PrintWriter pw=new PrintWriter(fos);
	   pw.println("��ӡ��");
	   pw.close();
   }
   /*
    * �Զ�ˢ��
    */
   public static void function2() throws FileNotFoundException{
	   FileOutputStream fos=new FileOutputStream("c:\\test.txt",true);
	   PrintWriter pw=new PrintWriter(fos,true);//�ڶ�����������Ϊtrue=�����Զ�ˢ��
	   pw.write("i");
	   pw.write("love");
	   pw.write("you");
	   pw.close();
   }
}
