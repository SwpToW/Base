package day22;

import java.io.File;
import java.io.IOException;

/*
 * �ļ���Ĵ�����ɾ��
 * �ļ�������Ŀ¼
 */
public class FiletTest2 {
   public static void main(String[] args) throws IOException {
	function2();
}
   /*
    * boolean createNewfile() �����ļ�
    * �������ļ�·�����ļ�������File���췽���и���
    * ����ļ��Ѿ����ڣ����ٴ���
    * 
    * boolean mkdir() �����ļ���
    * ������·��Ҳ��File�������и���
    * 
    * boolean mkdirs() ����Դ�������ļ���    �Ƽ�ʹ��mkdirs����Ϊmkdir�о�����
    */
   public static void function() throws IOException{
	   File file=new File("C:\\�½��ļ���\\�½��ļ���");
	   //boolean b=file.createNewFile();
	   boolean a=file.mkdir();
	   System.out.println(a);
   }
   /*
    * boolean delete() ɾ�����ļ��������ļ���·����File�����췽���и���
    * ����ļ����ڴ�״̬��ɾ��ʧ��
    * ɾ���˳���·������ʾ���ļ���Ŀ¼�������·������ʾһ��Ŀ¼�����Ŀ¼����Ϊ�ղ���ɾ����
    */
   public static void function2(){
	   File file=new File("C:\\�½��ļ���\\�½��ļ���");//ע�⣺Ŀ¼Ϊ��ʱ����ɾ��
	   System.out.println(file.delete());  //ɾ���������߻���վֱ����ʧ
   }
   
}
