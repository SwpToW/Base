package day24;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * �ļ����Ʒ�ʽ���ֽ��������ַ�ʽ ��Ч�ʱȽ�
 * �ֽ�����д�����ֽ�  ����
 * �ֽ�����ȡ�ֽ�����  ���   �����OK
 * �ֽ����Ļ�������д�����ֽ�   ���� 
 * �ֽ����Ļ�������ȡ�ֽ�����  ��ǿ  ���ҲOK
 */
public class FileCopyInFourTest {
    public static void main(String[] args) throws IOException {
		long s=System.currentTimeMillis();
		function1(new File("C:\\201520180301��ΰ��.docx"),new File("D:\\201520180301��ΰ��.docx"));
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
