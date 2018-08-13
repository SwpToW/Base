package day24;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * 转换流 
 * java3
 * 符，字符数组，字符串
 * 
 * 字符流装成字节流的桥梁
 * 
 * 字符给到转换流，转换流去查询编码表将字符转成字节
 * 使用方法：
 * 构造器里面放OutputStream  OutputStreamWriter(OutputStream out)  接受所有的字节输出流
 * 
构造方法摘要
OutputStreamWriter(OutputStream out) 
          创建使用默认字符编码的 OutputStreamWriter。
OutputStreamWriter(OutputStream out, Charset cs) 
          创建使用给定字符集的 OutputStreamWriter。
OutputStreamWriter(OutputStream out, CharsetEncoder enc) 
          创建使用给定字符集编码器的 OutputStreamWriter。
OutputStreamWriter(OutputStream out, String charsetName)   这里的第二个参数是编码表名字 GBK UTF-8
          创建使用指定字符集的 OutputStreamWriter。
 */
public class OutputStreamWriterTest {
  public static void main(String[] args) throws IOException {
	function();
}
  /*
   * 转换流写文本
   * 采用GBK编码表
   */
  public static void function() throws IOException{
	  FileOutputStream fos=new FileOutputStream("C:\\gbk.txt");
	  OutputStreamWriter osw=new OutputStreamWriter(fos,"utf-8");
	  osw.write("你好呀二狗子");
	  osw.close();
	  
  }
}
