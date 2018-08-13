package day23;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * IO流的异常处理 try cathch finally
 * 
 * cathch{} 里面处理异常
 * 先输出异常信息，再停止程序(就是抛出一个运行时异常)
 * 
 * 如果流对象建立失败，那就没必要运行close方法来释放资源  
 * 所以在释放资源的时候要有一个判断流是否为空的操作
 */
public class IOExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos=null;  //注意try块会限定fos的作用域，这里可以定义fos以提升作用域
		try{
        fos=new FileOutputStream("C:\\a.txt");
        fos.write(100);
		}
        catch(IOException e){
        		e.printStackTrace();  //先打印错误信息
        		throw new RuntimeException("刹车！！！文件写入失败");   //程序要停下来 ，抛出一个运行异常
        }	
        finally{
        try {
        	if(fos!=null){  //判断流对象是否为空
			fos.close();
        	}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//这里也可以抛一个运行时异常
		}
        }
	}

}
