package day25;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * 序列化和反序列化
 * 反序列化：在文件中，以流的形式，将对象读取出来
 * ObjectInputStream (InputStream in)
 * 参数是任意的字节输入流，输入流封装文件，且必须是序列化的文件
 * 还是以程序本身为参照物
 */
public class ObjectInputStreamTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {//抛出两个异常
		FileInputStream fis=new FileInputStream("C:\\person.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object obj=ois.readObject();
		System.out.println(obj.toString());
		ois.close();
	}
}
