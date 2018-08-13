package day25;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * 打印流实现文本复制
 *   读取数据源BufferedReader +FileReader 读取文本行
 *   写入数据目的printWriter +println 自动刷新
 */
public class PrintCopyFileTest {
   public static void main(String[] args) throws IOException {
	  BufferedReader br=new BufferedReader(new FileReader("c:\\test.txt"));
	  PrintWriter pw=new PrintWriter(new FileWriter("D:\\test.txt"),true);
	  String line=null;
	  while((line=br.readLine())!=null){
		  pw.println(line);
	  }
	  pw.close();
	  br.close();
}
}
