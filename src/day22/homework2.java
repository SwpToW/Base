package day22;

import java.io.File;

/*
 * aaa���ļ���,������bbb.txt,ccc.txt,ddd.txt��Щ�ļ�,��eee�������ļ���,eee����fff.txt��ggg.txt,��ӡ���㼶��
	aaa
		bbb.txt
		ccc.txt
		ddd.txt	
		eee
			fff.txt
			ggg.txt
 */
public class homework2 {
  public static void main(String[] args) {
	File file=new File("C:\\�½��ļ���");

	function(file);
	
}
  public static void function(File file){
	  String s="    ";
	  File[] filelist=file.listFiles();
	  for(File f:filelist){
		  if(f.isDirectory()){
			 // System.out.println("�����������ͬһ���ļ���");
			  
			  System.out.println(f);
			  
			  function(f);
			  
		  }else{
			  System.out.println(s+f);
			
		  }
	  }
  }
}
