package day22;

import java.io.File;

/*
 * Ŀ¼��ȫ����
 */
public class AllFileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        File file=new File("D:\\eclipse");
        getAllDir(file);
	}
	public static void getAllDir(File dir){
		File[] filelist=dir.listFiles();
		for(File f:filelist){
			if(f.isDirectory()){
				getAllDir(f);
			}
			System.out.println(f);
		}
	}

}
