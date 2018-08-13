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
    * String[] list() 获取到File构造方法中路径中的文件文件夹名（遍历一个目录）
    * File[] listFiles()  遍历目录 返回的是file类型的数组
    * File[] listRoots()  获取系统所有根目录 即盘符
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

