package day22;

import java.io.File;

import java.io.FileFilter;

public class myfilter implements FileFilter{

	@Override
	public boolean accept(File pathname) {
		//String name=pathname.getName().toLowerCase();
		/*if(name.endsWith(".java")){
			return true;
		}else{
		return false;
		}*/
		if(pathname.isDirectory())    //给出的路径是目录时加入到文件数组中，以待下次遍历
			return true;
		return pathname.getName().endsWith(".java"); //绝对精简的写法，
	}


	

}
