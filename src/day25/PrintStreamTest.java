package day25;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * 打印流
 * PrintStream  字节(接受File类型，接受字符串文件名，接受字节输出流OutputStream)
 * PrintWriter   字符(接受File类型，接受字符串文件名，接受字节输出流OUTputStream，接受字符输出流writer)
 *   以上两个打印流的方法完全一样
 *   区别在于构造器上
 *   构造方法的参数就是打印流的输出目的
 * 打印流的特点：
 * 1.流不负责数据源，只负责数据目的
 * 2.为其他输出流添加功能
 * 3.永远不会抛出IO异常
 *   但可能抛出别的异常
 *   
 *   打印流开启自动刷新功能 (打印流构造方法第二个参数设置为true)
 *   满足两个条件：1.输出数据目的必须是流对象
 *             2.必须调用println,printf,format三个方法中的其中一个
 */
public class PrintStreamTest {
   public static void main(String[] args) throws IOException {
	function2();
}
   /*
    * 打印流，向File对象的数据目的写入数据
    * 
    */
   public static void function() throws FileNotFoundException{
	   File file=new File("c:\\test.txt");
	   PrintWriter pw=new PrintWriter(file);
	   pw.print("hello");//print方法原样输出
	   //pw.write("100");write()方法会走码表 当给出的是整数时
	   pw.write("和嗯咯");
	   pw.close();
	   
   }
   /*
    * 打印流的输出目的是流对象
    * 
    */
   public static void function1() throws IOException{
	   FileOutputStream fos=new FileOutputStream("c:\\test.txt",true);
	   PrintWriter pw=new PrintWriter(fos);
	   pw.println("打印流");
	   pw.close();
   }
   /*
    * 自动刷新
    */
   public static void function2() throws FileNotFoundException{
	   FileOutputStream fos=new FileOutputStream("c:\\test.txt",true);
	   PrintWriter pw=new PrintWriter(fos,true);//第二个参数设置为true=设置自动刷新
	   pw.write("i");
	   pw.write("love");
	   pw.write("you");
	   pw.close();
   }
}
