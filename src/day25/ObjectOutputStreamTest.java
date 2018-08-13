package day25;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


/*
 * ���л������л���ע�⡣�Ƕ���������뷴���л�
 *   ���л��������������д�뵽�ļ��б��档��ͽ�д������Ҳ�����л�
 *   ObjectOutputStream  
 *   
 *   java.io.NotSerializableException ���쳣��ʾ���ݵĶ���û��ʵ�����л�����û��ʵ��Serializable�ӿ�
 *   ��̬�������л�����Ϊ��̬�����࣬�����ڶ���
 */
public class ObjectOutputStreamTest{
    public static void main(String[] args) throws IOException {
		function();
	}
    /*
     * IO������ʵ�ֶ���Person�����л� 
     * ObjectOutputStream( OutputStream our)
     * ������������ֽ������
     * void writeObject(Object obj) д������
     */
    public static void function() throws IOException{
    	FileOutputStream fos=new FileOutputStream("C:\\person.txt");
    	ObjectOutputStream os=new ObjectOutputStream(fos);
    	Person Swp=new Person(1,"Swp");
    	os.writeObject(Swp);
    	os.close();
    	
    }
}
