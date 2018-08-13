package day22;

import java.io.File;
import java.util.HashMap;

/*
 * ����¼��һ���ļ���·��,ͳ�Ƹ��ļ���(�������ļ���)��ÿ�����͵��ļ�������,ע��:���ļ�����(��׺��,������.(��),�磺"java","txt")��Ϊkey,
	�ø�����Ϊvalue,���뵽map������,�������ַ�ʽ����map����
	���磺
	doc �����͵��ļ���  3 ��
	java �����͵��ļ���  5 ��
	txt �����͵��ļ���  7 ��
	 //δ���
 */
public class HomeWork {
  public static void main(String[] args) {
	File file=new File("C:\\�½��ļ���");
	System.out.println(file);
	//function(file);
}
  public static void getHashMap(File file){
	  HashMap<String, Integer> map=new HashMap<String,Integer>();
	  int num=0;
	  String name=file.getName();
	  if(name.endsWith("txt")){
		  num=num+1;
	  }
	  map.put("txt", num);
	  System.out.println(map);
  }
  public static void function(File file){
	  File[] filelist=file.listFiles();
	  for(File f:filelist){
		  if(f.isDirectory()){
			  function(f);
		  }else{ 
			 getHashMap(f);
		  }
		  
	  } 
	  
  }
}
