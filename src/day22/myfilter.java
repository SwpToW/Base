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
		if(pathname.isDirectory())    //������·����Ŀ¼ʱ���뵽�ļ������У��Դ��´α���
			return true;
		return pathname.getName().endsWith(".java"); //���Ծ����д����
	}


	

}
