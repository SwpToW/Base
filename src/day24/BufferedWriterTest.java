package day24;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 字符输出流的缓冲流
 * java.io.bufferedWriter  继承了Writer  
 * 有一个特有的方法 void newline() 写换行
 * 这个方法具有平台无关性  ；
 * windows里面换行是\r\n ，LINUX里面是\n
 * write() 可以写单个字符，字符数组，和字符串
 * 构造方法：
 *   BufferedWriter(Writer w) 传递任意字符输 出流(FileWriter OutputStreamWriter)
 */
public class BufferedWriterTest {
   public static void main(String[] args) throws IOException {
	/*FileReader fw=new FileReader("c:\\gbk.txt");
	BufferedReader br=new BufferedReader(fw);
	char[] arr=new char[1024];
	int len=0;
	while((len=br.read(arr))!=-1){
		System.out.println(new String(arr,0,len));
	}
	br.close();*/
	   FileWriter fw=new FileWriter("D:\\gbk.txt",true);
	   BufferedWriter bw= new BufferedWriter(fw);
	   bw.newLine();
	   bw.write("你好呀二狗子");
	   bw.newLine();
	   bw.write("我喜欢你啊");
	   bw.close();
	   
}
}
