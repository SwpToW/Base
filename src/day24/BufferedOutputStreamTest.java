package day24;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 字节输出流的缓冲流
 * java.io.BufferedOutputStream  作用:提高原有输出流的写入效率
 * BufferedOutputStream继承OutputStream
 * 方法： write() 写入字节和字节数组
 * 构造方法：
 *   bufferedOutputStream (OutputStream out)  参数是任意的字节输出流
 */
public class BufferedOutputStreamTest {   
  public static void main(String[] args) throws IOException {
	//FileOutputStream fos=new FileOutputStream("D:\\gbk.txt");//字节输出流  
	//BufferedOutputStream bos=new BufferedOutputStream(fos);
	//bos.write("helloshabi".getBytes());
	BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("D:\\gbk.txt")); //精简写法
	FileInputStream fis=new FileInputStream("C:\\gbk.txt");
	BufferedInputStream bis=new BufferedInputStream(fis);
	byte[] arr=new byte[1024];
	
	
	int len=0;
	while((len=bis.read(arr))!=-1){
		bos.write(arr,0,len);
	}
	bos.close(); //记住要关闭或者刷新
	bis.close();
	
}
}
