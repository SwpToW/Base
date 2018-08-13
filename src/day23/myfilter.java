package day23;
import java.io.File;
import java.io.FileFilter;



public class myfilter implements FileFilter{

	@Override
	public boolean accept(File pathname) {
		/*
		String s=pathname.getName().toLowerCase();
		if(s.endsWith(".java")) {
			return true;
		}else {
			return false;
		}*/
		//绝对精简的写法
		if(pathname.isDirectory())
			return true;
		return pathname.getName().toLowerCase().endsWith(".txt");
	}




}
