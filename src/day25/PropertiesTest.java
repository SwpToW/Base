package day25;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
 * * A: Properties���ϵ��ص�
		* a: Properties�����
			* Properties ���ʾ��һ���־õ����Լ���Properties �ɱ��������л�����м��ء������б���ÿ���������Ӧֵ����һ���ַ���
		* b: �ص�
			* Hashtable�����࣬map�����еķ����������á� //�̳�HashTable ʵ��Map�ӿ�
			* �ü���û�з��͡���ֵ�����ַ�����
			* ����һ�����Գ־û������Լ�����ֵ���Դ洢�������У�Ҳ���Դ洢���־û����豸(Ӳ�̡�U�̡�����)�ϡ���ֵ����ԴҲ�����ǳ־û����豸��
			* �к����������ϵķ�����
 */
public class PropertiesTest {
    public static void main(String[] args) throws IOException {
		function2();
	}
    /*
     * .
     * 
     * 
     * ʹ��properties�洢��ֵ��    setProperty()��ͬ��map�ӿ��е�put
     * ͨ������ȡֵ ��getProperty(String key) 
     * �����м�ֵ�洢��set������ stringPropertyName();
     */
    public static void function(){
    	Properties pro=new Properties();
    	pro.setProperty("Swp", "Wjq");//���������ڴ���
    	pro.setProperty("Wjq", "Swp");//���������ڴ���
    	
    	System.out.println(pro);
    	String value=pro.getProperty("Swp");
    	System.out.println(value);
    	Set<String> set=pro.stringPropertyNames();
    	for(String key:set){
    		System.out.println(key+"   "+pro.getProperty(key));
    	}
    }
    /*
     * properties�������з��� 
     * load(InputStream in)
     * load(Reader r)
     * ������������ֽڻ����ַ�������
     * ������������ļ�ֵ�Դ洢�������� 
     * 
     */
    public static void function1() throws IOException{
    	Properties pro=new Properties();
    	FileReader fr=new FileReader("C:\\pro.porperties");
    	pro.load(fr);
    	fr.close();
    	System.out.println(pro);
    }
    /*
     * store(OutputStream out)
     * store(Writer w)
     * �������еļ�ֵ��д���ļ��б���
     */
    public static void function2() throws IOException{
    	Properties pro=new Properties();
    	pro.setProperty("Swp", "Wjq");
    	pro.setProperty("�ܾúܾ�", "��ʵ����");
    	FileOutputStream fos=new FileOutputStream("C:\\pro.porperties");
    	pro.store(fos, "i need you");
    	fos.close();
    	
    }
}
