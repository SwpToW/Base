package day23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* 字节输入流
 *  InputStream 是所有字节输入流的超类
 *  作用:读取文件，每次只读一个字节
 *  读取方法两个重载
 *  int read()  读取一个字节 read方法特点 ：只要执行一次，就会自动读取下一个字节，返回值就是读取到的字节
 *  当读取到文件的结尾时返回-1。
 *  
 *  int read(byte[] b) 读取一定量字节，存放到数组中 这个返回值代表读取到了多少个有效的字节数
 * 
 */
public class InputStreamTest {
   public static void main(String[] args) {
	   FileInputStream fis=null;
	   try{
	 fis=new FileInputStream("C:\\a.txt");
	 /*
	  * 循环读取字节的方式
	  * int len=0;
	  * while((len=fis.read())!=-1){
	  * system.out.println((char)len);
	  * }
	  * 
	  * 循环读取字节数组的方式
	  * byte[] arr=new byte[1024] //大小取合适的1024
	  * int len=0;//这是read()方法的返回值
	  * while((len=fis.read())!=-1){
	  *   system.out.println(new String(arr,0,len)); //从arr中读取从0到len的所有字节转成字符串再输出
	  * }
	  */
	int size=fis.available();
	byte[] arr=new byte[size];
	System.out.println(fis.read(arr)); //读取到的放在arr数组中
	String s=new String(arr);
	System.out.println(s);
	   }catch(FileNotFoundException e){
		   e.printStackTrace();
	   }catch(IOException e){
		   e.printStackTrace();
	   }finally{
		   if(fis!=null){
			   try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   }
	   }
	
}
}
