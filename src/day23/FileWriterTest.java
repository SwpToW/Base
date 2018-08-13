package day23;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 字符输出流
 * java.io.Writer 所有字符输出流的超类
 * 写的方法write
 * write(int c) 写一个字符
 * write(char[] c) 写字符数组
 * write(char[] c,int off,int len)
 * write(String s) 写入字符串
 */
public class FileWriterTest {
   public static void main(String[] args) throws IOException {
	FileWriter fw=new FileWriter("C:\\a.txt",true);
	fw.write("\r\n我在这儿呢");
	fw.flush();   //字符输出流写数据的时候，必须要刷新流的缓冲
	fw.close();
}
}
