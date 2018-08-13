package day24;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

/*
 * 读取文件  打印屏幕标注行号
 */
public class homework4 {
    public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("C:\\gbk.txt");
		BufferedReader br=new BufferedReader(fr);
		int num=0;
		String line;
        while((line=br.readLine())!=null){//根本没心思敲代码。！！！！！
        	num++;
        	System.out.println(num+" "+line);
        }
				
	}
}
