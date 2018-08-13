package day24;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 文件复制方式，字节流，四种方式 的效率比较
 * 字节流读写单个字节  第四
 * 字节流读取字节数组  其次   用这个OK
 * 字节流的缓冲流读写单个字节   第三 
 * 字节流的缓冲流读取字节数组  最强  这个也OK
 */
public class FileCopyInFourTest {
    public static void main(String[] args) throws IOException {
		long s=System.currentTimeMillis();
		function1(new File("C:\\201520180301孙伟鹏.docx"),new File("D:\\201520180301孙伟鹏.docx"));
		long x=System.currentTimeMillis();
		System.out.println(x-s);
		
		
	}
    public static void function1(File src,File desc) throws IOException{
    	FileInputStream fis=new FileInputStream(src);
    	FileOutputStream fos=new FileOutputStream(desc);
    	int len=0;
    	while((len=fis.read())!=-1){
    		fos.write(len);
    	}
    	fis.close();
    	fos.close();
    }
}
