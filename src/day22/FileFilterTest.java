package day22;

import java.io.File;

/*
 * ��һ�������ļ��Ĺ�����
 * list���Ŀ¼�������ļ��ĳ���·����
 * ʹ�ù���������
 */
public class FileFilterTest {
  public static void main(String[] args) {
	  File file=new File("D:\\eclipse");
	  File[] filelist=file.listFiles(new myfilter());
	  for(File f:filelist){
		  System.out.println(f);
	  }
 }
}
