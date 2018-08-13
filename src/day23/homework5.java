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
    	File[] filelist=file.listFiles(new myfilter()); //  过滤文件
    	for(File f:filelist) {
    		if(f.isDirectory()) {
    			move(f);  //如果是目录，重复进行判断移动
    		}else {
    			//System.out.println(f);
    			try {
    			fis=new FileInputStream(f);       
    			//File s=new File("D:\\","java");
    			String s="D:\\java\\"+f.getName();  //写出目的文件的地址
    			System.out.println(s); 
    			fos=new FileOutputStream(s);  //创建目的文件输出流
    			int size=fis.available();
    			byte[] arr=new byte[size];
    			fis.read(arr);
    			fos.write(arr);
    			}catch(IOException e) {
    				e.printStackTrace();
    				throw new RuntimeException("抱歉，文件写入失败哦");
    			}finally {
    				if(fis!=null) {
    					try {
							fis.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							throw new RuntimeException("抱歉，文件流关闭失败");
						}finally {
							if(fos!=null) {
								try {
									fos.close();
								} catch (IOException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
									throw new RuntimeException("抱歉，文件流关闭失败");
								}
							}
						}
    				}
    			}
    			
    			
    		}
    	}
    }
}
