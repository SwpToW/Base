package day22;

import java.io.File;

/*
 * list()
 * listfiles()
 */
public class FileListTest {
   public static void main(String[] args) {
	function();
}
   /*
    * String[] list() ��ȡ��File���췽����·���е��ļ��ļ�����������һ��Ŀ¼��
    * File[] listFiles()  ����Ŀ¼ ���ص���file���͵�����
    * File[] listRoots()  ��ȡϵͳ���и�Ŀ¼ ���̷�
    */
   public static void function(){
	   File file=new File("D:\\eclipse");
	   String[] str=file.list();
	   File[] filearr=file.listFiles();
	   for(File f:filearr){
		   System.out.println(f);
	   }
	   /*for(String s:str){
		   System.out.println(s.toString());
	   }*/
   }
}

