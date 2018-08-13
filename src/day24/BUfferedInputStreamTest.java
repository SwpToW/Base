package day24;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

import java.io.IOException;

/*
 * 字节输入流的缓冲流
 * java.io.BufferedInputStream   继承自InputSteam
 * 读取方法read() 读取单个字节，字节数组
 * 构造方法同输出流的缓冲流BufferedOutputStream
 * 
 */
public class BUfferedInputStreamTest {
    public static void main(String[] args) throws IOException {
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("D:\\gbk.txt"));
		byte[] arr=new byte[10];
		int len=0;
		while((len=bis.read(arr))!=-1){
			System.out.print(new String(arr,0,len));
		}
		bis.close();
		
	}
}
