package day22;

import java.io.File;

/*
 * 第一个就是文件的过滤器
 * list获得目录下所有文件的抽象路径名
 * 使用过滤器过滤
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
