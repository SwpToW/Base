package day24;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * ʹ�û����������󣬸����ı��ļ�
 * ����ԴBufferedReader+FileReader ��ȡ
 * ����Ŀ��BufferedWriter+FileWriter
 * ��һ��дһ��
 */
public class BufferedCopyFileTest {
    public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("C:\\gbk.txt"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("F:\\gbk.txt"));
		String line=null;
		while((line=br.readLine())!=null){
			bw.write(line);
			bw.newLine();
		}
		br.close();
	    bw.close();
	}
}
