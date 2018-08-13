package day23;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * ���ַ���ʵ���ı��ļ��ĸ���
 */
public class CopyFile2Test {

	public static void main(String[] args) {
		FileReader fr=null;
		FileWriter fw=null;
		try{
		    fr=new FileReader("C:\\a.txt");
		    fw=new FileWriter("D:\\a.txt");
		    char[] ch=new char[1024]; //charռ�����ֽڣ�1024����2042���ֽھ���2KB
		    int len=0; //len��ʾÿ�ζ�������Ч�ֽ���
		    while((len=fr.read(ch))!=-1){
		    	fw.write(ch, 0, len);
		    	fw.flush();
		    }
		}catch(IOException e){
			e.printStackTrace();
			throw new RuntimeException("ɲ������ȥ����̥");
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
