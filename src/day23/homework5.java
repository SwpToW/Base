package day23;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class homework5 {
    public static void main(String[] args) {
		File file=new File("C:\\homework");
		move(file);
	}
    public static void move(File file) {
    	FileInputStream fis=null;
    	FileOutputStream fos=null;
    	File[] filelist=file.listFiles(new myfilter()); //  �����ļ�
    	for(File f:filelist) {
    		if(f.isDirectory()) {
    			move(f);  //�����Ŀ¼���ظ������ж��ƶ�
    		}else {
    			//System.out.println(f);
    			try {
    			fis=new FileInputStream(f);       
    			//File s=new File("D:\\","java");
    			String s="D:\\java\\"+f.getName();  //д��Ŀ���ļ��ĵ�ַ
    			System.out.println(s); 
    			fos=new FileOutputStream(s);  //����Ŀ���ļ������
    			int size=fis.available();
    			byte[] arr=new byte[size];
    			fis.read(arr);
    			fos.write(arr);
    			}catch(IOException e) {
    				e.printStackTrace();
    				throw new RuntimeException("��Ǹ���ļ�д��ʧ��Ŷ");
    			}finally {
    				if(fis!=null) {
    					try {
							fis.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							throw new RuntimeException("��Ǹ���ļ����ر�ʧ��");
						}finally {
							if(fos!=null) {
								try {
									fos.close();
								} catch (IOException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
									throw new RuntimeException("��Ǹ���ļ����ر�ʧ��");
								}
							}
						}
    				}
    			}
    			
    			
    		}
    	}
    }
}
