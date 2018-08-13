package day23;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 用字符流实现文本文件的复制
 */
public class CopyFile2Test {

	public static void main(String[] args) {
		FileReader fr=null;
		FileWriter fw=null;
		try{
		    fr=new FileReader("C:\\a.txt");
		    fw=new FileWriter("D:\\a.txt");
		    char[] ch=new char[1024]; //char占两个字节，1024就是2042个字节就是2KB
		    int len=0; //len表示每次读到的有效字节数
		    while((len=fr.read(ch))!=-1){
		    	fw.write(ch, 0, len);
		    	fw.flush();
		    }
		}catch(IOException e){
			e.printStackTrace();
			throw new RuntimeException("刹车，回去修轮胎");
		}finally{
			if(fr!=null){
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					if(fw!=null){
						try {
							fw.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		}

	}

}
