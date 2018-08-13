package day23;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;

/*
 * 文件的复制
 */
public class CopyFileTest {
  public static void main(String[] args) {
	  long x=System.currentTimeMillis();
	
	FileInputStream fis=null;
	FileOutputStream fos=null;
	try{
		fis=new FileInputStream("D:\\201520180301孙伟鹏.docx");
		fos=new FileOutputStream("C:\\201520180301孙伟鹏.docx");
		/*int len=0;
		while((len=fis.read())!=-1){  //按字节一个一个复制的话，碰到字节数大的文件循环次数多效率低
			fos.write(len);
		}*/
		//为了提升效率，使用字节数组来缓冲
		byte[] arr=new byte[1024];
		int len=0;
		while((len=fis.read(arr))!=-1){
			fos.write(arr,0,len);
		}
	}catch(IOException e){
		e.printStackTrace();
	}finally{
		if(fos!=null){
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{  //finally块里接着判空来释放资源
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
	long a=System.currentTimeMillis();
	System.out.println(a-x);
}
}
