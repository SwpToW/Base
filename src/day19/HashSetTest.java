package day19;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * ��ϣ���̳���Set�ӿڵ��࣬���������ظ�Ԫ�أ�û����������һ�����򼯺�
 * HashSet���洢��ȡ�����ȽϿ죬�̲߳���ȫ��Ҳ����ζ�ſ졣
 * ����ı�д��ArrayList��ȫһ��
 * ���ݽṹ��ϣ��������������
 * ����Ĺ�ϣֵ:��ͨ��ʮ��������
 * Object ��public int hashCode()����  ������int����
 */
public class HashSetTest {
   public static void main(String[] args) {
	   HashSet<String> s=new HashSet<String>();
	   s.add("cn");
	   s.add("it");
	   s.add("cast");
	   s.add("heima");
	   Iterator<String> it=s.iterator();
	   while(it.hasNext()){
		   System.out.println(it.next());//������ʱ��Ҳ��������ı���
	   }
	   for(String a:s){
		   System.out.println(a);
	   }
	   
}
}
