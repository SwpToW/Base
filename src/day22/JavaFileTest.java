package day22;

import java.io.File;

/*
 * ����һ��Ŀ¼�����е�java�ļ�
 */
public class JavaFileTest {
   public static void main(String[] args) {
	File file=new File("D:\\JAVA");
	function(file);
}
   public static void function(File file){
	   File[] filelist=file.listFiles(new myfilter());
	   for(File f:filelist){
		   if(f.isDirectory()){
			   function(f);
		   }else{
		   System.out.println(f.toString());
		   }
	   }
	}
}
