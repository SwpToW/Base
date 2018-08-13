package day22;

import java.io.File;

/*
 * �ļ���� java.io.File 
 * ������ϵͳ�е��ļ���Ŀ¼��·����װ��File����
 * Ŀ¼��directory
 * ·����path
 */
public class FileTest {
  public static void main(String[] args) {
	//File ��̬��Ա����
	  String s=File.pathSeparator;
	  System.out.println(s); //��һ���ֺţ�����·���ָ���
	  String s1=File.separator;
	  System.out.println(s1); //�����һ�����ҵ�б��(LINUXϵͳ����)��Ŀ¼���Ʒָ��;
	 function();
}
  //File��Ĺ��췽�� 3��������ʽ
	  /*
	   * File (String pathname) path:·����������д��һ���ļ��У�Ҳ����д��һ���ļ�
	   * File(String parent,String child) �ַ�����·�����ַ�����·���������Ĺ��������и������ı���
	   * File(File parent,String file)  File���͵ĸ�·�����ַ������͵���·��,�ô�:��·�����Ե���File��ķ���
	   *
	   */
  public static void function(){
	  File file=new File("D:\\JAVA\\web");
	  File file1=new File("D:","JAVA");        //·���ֿ����и����ı���
	  File file2=new File(file1,"web");
	  System.out.println(file1);
	  System.out.println(file2);
	  System.out.println(file.toString());
	  System.out.println(file.canExecute());  //canExecute()�����жϸ����Ķ����Ƿ��ܲ���
	  System.out.println(file.exists()); //exist()�����жϸ����Ķ����Ƿ����
  }
}
