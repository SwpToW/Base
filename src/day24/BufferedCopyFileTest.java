package day24;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 使用缓冲区流对象，复制文本文件
 * 数据源BufferedReader+FileReader 读取
 * 数据目的BufferedWriter+FileWriter
 * 读一行写一行
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
