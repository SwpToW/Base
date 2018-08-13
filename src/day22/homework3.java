package day22;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 将文件夹里的所有内容，搬到另外一个盘符
 * 
 */
public class homework3 {
  public static void main(String[] args) {
	File file=new File("C:\\新建文件夹");
	File goal=new File("D:");
	//System.out.println(file.getName());
	try {
		Move(file,goal);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
  public static void Move(File file,File goal) throws IOException{
	File[] filelist=file.listFiles();
	FileInputStream fin=null;
	FileOutputStream fos=null;
	for(File f:filelist){
		if(f.isDirectory()){
			String s=file.getName();
			File goalfiles=new File(goal,s);
			goalfiles.mkdir();
			Move(goalfiles,goal);
		}else{
			try{
			String s=file.getName();
			 fin=new FileInputStream(f);
			int size=fin.available();
			byte[] arr=new byte[size];
			fin.read(arr);
			File goalfile=new File(goal,s);
			goalfile.createNewFile();
		    fos=new FileOutputStream(goalfile);
			fos.write(arr);
			}catch(FileNotFoundException e){
				e.printStackTrace();
			}catch(IOException e){
				e.printStackTrace();
			}finally{
				fin.close();
				fos.close();
			}
			
		}
	}
  }
}
