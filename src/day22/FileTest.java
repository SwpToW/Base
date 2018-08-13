package day22;

import java.io.File;

/*
 * 文件类的 java.io.File 
 * 将操作系统中的文件，目录，路径封装成File对象
 * 目录：directory
 * 路径：path
 */
public class FileTest {
  public static void main(String[] args) {
	//File 静态成员变量
	  String s=File.pathSeparator;
	  System.out.println(s); //是一个分号，叫做路径分隔符
	  String s1=File.separator;
	  System.out.println(s1); //结果是一个向右的斜线(LINUX系统向左)，目录名称分割符;
	 function();
}
  //File类的构造方法 3种重载形式
	  /*
	   * File (String pathname) path:路径名，可以写到一个文件夹，也可以写到一个文件
	   * File(String parent,String child) 字符串父路径，字符串子路径，这样的构造器会有更加灵活的表现
	   * File(File parent,String file)  File类型的父路径，字符串类型的子路径,好处:父路径可以调用File类的方法
	   *
	   */
  public static void function(){
	  File file=new File("D:\\JAVA\\web");
	  File file1=new File("D:","JAVA");        //路径分开会有更灵活的表现
	  File file2=new File(file1,"web");
	  System.out.println(file1);
	  System.out.println(file2);
	  System.out.println(file.toString());
	  System.out.println(file.canExecute());  //canExecute()方法判断给出的对象是否能操作
	  System.out.println(file.exists()); //exist()方法判断给出的对象是否存在
  }
}
