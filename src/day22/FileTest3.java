package day22;

import java.io.File;

/*
 * File��Ļ�ȡ����
 */
public class FileTest3 {
   public static void main(String[] args) {
	function();
}
   /*
    * String getName()  ����·���б�ʾ���ļ������ļ�����,��ȡ��·����󲿷ֵ����֣����������eclipse
    * ����������������ļ��������Ƿ���ȷ��ֻ�Ƕ�String�������и�õ�·�����Ĳ���
    * String getPath()  �����ļ������toString
    * long length() ����·���б�ʾ���ļ����ֽ���
    * String getAbsolutePath() ��ȡ����·��,����String����
    * File getAbsoluteFile() Ҳ�ǻ�ȡ����·��������File����
    * ��eclipse�����У�д����һ�����·��������λ�þ��ǹ��̸�Ŀ¼��������JAVAbase
    */
   /*
    * File��Ļ�ȡ����
    * String getParent()    ���ظ�Ŀ¼��String����
    *
    * File getParentFile() ���ظ���·��File����
    */
   public static void function(){
	   File file=new File("D:\\eclipse\\ecplise.exe");
	   /*System.out.println(file.getName());
	   System.out.println(file.getPath());
	   long length=file.length();
	   System.out.println(length);
	   File FAB=file.getAbsoluteFile();
	   System.out.println(FAB);*/
	   File file2=file.getParentFile().getParentFile();//ע���̷��Ƕ����Ŀ¼
	   System.out.println(file2);
   }
}
