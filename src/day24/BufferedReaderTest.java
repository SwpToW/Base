package day24;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * 字符输入流的缓冲流
 * java.io.BufferedReader 继承自Reader
 * 读取功能read() 单个字符，字符数组
 *  构造方法同BufferedWriter
 *  
 *  他有一个自己的功能
 *  String readline() 读取文本行 \r\n
 *  读取到流的末尾时返回null
 
 */
public class BufferedReaderTest {
    public static void main(String[] args) throws IOException {
    	int lineNumber=0;
		BufferedReader br=new BufferedReader(new FileReader("C:\\gbk.txt"));
	    /*String line=br.readLine();  //返回值是String类型
	    System.out.println(line);  //按行读     
	    br.close();*/
		String line=null;
		while((line=br.readLine())!=null){
			lineNumber++;
			System.out.println(lineNumber+" "+line);
		}
		br.close();
	}
}
