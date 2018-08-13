package day24;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/*
 * 转换流
 * java.io.InputstreamReader
 * 字符的输入流，可以读取文本文件
 * 字节流通向字符的桥梁
 *  读取的方法
 *  read() 读取一个字符，或者是字符数组
 * 
 */
public class InputStreamReaderTest {
   public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("C:\\gbk.txt");
	InputStreamReader isr=new InputStreamReader(fis,"utf-8");
	char[] ch=new char[1024];
	int len=0;
	while((len=isr.read(ch))!=-1){
		System.out.println(new String(ch,0,len));
	}
}
}
