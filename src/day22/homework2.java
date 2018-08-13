package day22;

import java.io.File;

/*
 * aaa是文件夹,里面有bbb.txt,ccc.txt,ddd.txt这些文件,有eee这样的文件夹,eee中有fff.txt和ggg.txt,打印出层级来
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
	File file=new File("C:\\新建文件夹");

	function(file);
	
}
  public static void function(File file){
	  String s="    ";
	  File[] filelist=file.listFiles();
	  for(File f:filelist){
		  if(f.isDirectory()){
			 // System.out.println("下面这个属于同一个文件夹");
			  
			  System.out.println(f);
			  
			  function(f);
			  
		  }else{
			  System.out.println(s+f);
			
		  }
	  }
  }
}
