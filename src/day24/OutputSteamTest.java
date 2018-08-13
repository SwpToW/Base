package day24;


import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 字节输出流
 *  OutputStream 所有字节输出流的超类
 *  作用：从Java程序，写出文件
 *  每次流每次只操作文件中的一个字节
 *   void	write(byte[] b)  将 b.length 个字节从指定的 byte 数组写入此输出流。
         
 void	write(byte[] b, int off, int len) 将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此输出流。
 //注意这里的off len不是开始结束 
          
 void	write(int b)     将指定的字节写入此输出流。
 close()方法，关闭流对象，释放与之相关的资源 //因为流对象操作文件的时候自己不做，都依赖于OS自己的功能， 
 
      
 */
public class OutputSteamTest {
     public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("C:\\a.txt",true); //文件实现续写而不覆盖方法是设置参数true；
		String str="我去你大爷";
		byte[] arr=str.getBytes();
	    fos.write(arr);
	    fos.write("\r\n这是一个简便写法".getBytes()); //换行符\r\n 可以写在上一行结尾，也可以写在本行开头
	    fos.close();
		
	}
}
