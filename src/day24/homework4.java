package day24;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

/*
 * ��ȡ�ļ�  ��ӡ��Ļ��ע�к�
 */
public class homework4 {
    public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("C:\\gbk.txt");
		BufferedReader br=new BufferedReader(fr);
		int num=0;
		String line;
        while((line=br.readLine())!=null){//����û��˼�ô��롣����������
        	num++;
        	System.out.println(num+" "+line);
        }
				
	}
}
