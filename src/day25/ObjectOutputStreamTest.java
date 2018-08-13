package day25;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


/*
 * 序列化反序列化，注意。是对象的序列与反序列化
 *   序列化：将对象从流中写入到文件中保存。这就叫写出对象也叫序列化
 *   ObjectOutputStream  
 *   
 *   java.io.NotSerializableException 此异常表示传递的对象没有实现序列化，即没有实现Serializable接口
 *   静态不能序列化，因为静态属于类，不属于对象
 */
public class ObjectOutputStreamTest{
    public static void main(String[] args) throws IOException {
		function();
	}
    /*
     * IO流对象，实现对象Person的序列化 
     * ObjectOutputStream( OutputStream our)
     * 参数是任意的字节输出流
     * void writeObject(Object obj) 写出对象
     */
    public static void function() throws IOException{
    	FileOutputStream fos=new FileOutputStream("C:\\person.txt");
    	ObjectOutputStream os=new ObjectOutputStream(fos);
    	Person Swp=new Person(1,"Swp");
    	os.writeObject(Swp);
    	os.close();
    	
    }
}
