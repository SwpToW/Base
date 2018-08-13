package day23;
/*
 * 字符输入流读取文本文件
 * java.io.Rader  抽象类
 * 子类FileRader
 * 
 * int read()  读一个字节
 * int read(char[] c)  读取字符数组
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRaderTest {
	public static void main(String[] args) throws IOException {
   FileReader fr=new FileReader("C:\\a.txt");
   int len=0;
   char[] ch=new char[1024];
   while((len=fr.read(ch))!=-1){
	   System.out.println(new String(ch,0,len));
   }
   /*while((len=fr.read())!=-1){
	   System.out.print((char)len);
   }*/
   fr.close();
	}
	
   
}
