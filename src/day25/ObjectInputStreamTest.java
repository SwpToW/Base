package day25;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * ���л��ͷ����л�
 * �����л������ļ��У���������ʽ���������ȡ����
 * ObjectInputStream (InputStream in)
 * ������������ֽ�����������������װ�ļ����ұ��������л����ļ�
 * �����Գ�����Ϊ������
 */
public class ObjectInputStreamTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {//�׳������쳣
		FileInputStream fis=new FileInputStream("C:\\person.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object obj=ois.readObject();
		System.out.println(obj.toString());
		ois.close();
	}
}
