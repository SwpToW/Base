package day24;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

import java.io.IOException;

/*
 * �ֽ��������Ļ�����
 * java.io.BufferedInputStream   �̳���InputSteam
 * ��ȡ����read() ��ȡ�����ֽڣ��ֽ�����
 * ���췽��ͬ������Ļ�����BufferedOutputStream
 * 
 */
public class BUfferedInputStreamTest {
    public static void main(String[] args) throws IOException {
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("D:\\gbk.txt"));
		byte[] arr=new byte[10];
		int len=0;
		while((len=bis.read(arr))!=-1){
			System.out.print(new String(arr,0,len));
		}
		bis.close();
		
	}
}
