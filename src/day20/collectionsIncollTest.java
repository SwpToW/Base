package day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * ���������Ƕ�ף���������ż���
 * ����ʹ��Map�����Map
 * Ҫ�󣺴��ǲ���
 *       JAVA������  �����࿴��һ��Map����
 *       001 ����    ѧ�ź����ֿ���һ����ֵ��
 *       002 ����
 *       
 *       JAVA��ҵ��
 *       001 ����
 *       002 ����
 * ���������ݽ��ж���Ĵ洢
 */
public class collectionsIncollTest {
	public static void main(String[] args) {
		function();
	}
    public static void function(){
    	HashMap<Integer, String> JC=new HashMap<Integer,String>();
    	JC.put(1, "����");
    	JC.put(2, "����");
    	HashMap<Integer, String> JY=new HashMap<Integer,String>();
    	JY.put(1, "����");
    	JY.put(2, "����");
    	HashMap<Integer, HashMap<Integer, String>> CB=new HashMap<Integer,HashMap<Integer,String>>();
    	CB.put(1, JC);
    	CB.put(2, JY);
    	collectionsIncollTest.keySet(CB);
    	collectionsIncollTest.EntrySet(CB);
    }
    public static void EntrySet(HashMap<Integer,HashMap<Integer, String>> czbk){ // Map.entry�ӿ����������ϵ�Ƕ��
    	Set<Map.Entry<Integer, HashMap<Integer, String>>> s=czbk.entrySet();//�Ѵ�Map��ӳ���ϵ�ŵ�s����
        Iterator<Map.Entry<Integer, HashMap<Integer, String>>> it=s.iterator();//����������s
        while(it.hasNext()){
        	 int id=it.next().getKey();//�õ�ӳ���ϵ�ļ�ֵ
        	 HashMap<Integer, String> classmap=czbk.get(id);//��ӳ���ϵ����õ���ֵ(HashMap)�ŵ�classmap��������
        	 Set<Map.Entry<Integer, String>> student=classmap.entrySet();//�ٵõ�classmap���������ӳ���ϵ(�ü��ϴ洢)
        	 Iterator<Map.Entry<Integer, String>> it1=student.iterator();//���������Ǹ�entry����
        	 while(it1.hasNext()){
        		 Map.Entry<Integer, String> m=it1.next();//�õ�ÿһ�Լ�ֵ��ӳ���ϵ
        		 System.out.println(m.getKey()+"   "+m.getValue());//��getkey��getvalue������ȡֵ
        	 }
        	 
        	 
        }
    }
    public static void keySet(HashMap<Integer,HashMap<Integer,String>> czbk){
    	Set<Integer> set=czbk.keySet();  //�ȰѴ�Map�ļ�ȡ������set����
    	Iterator<Integer> it=set.iterator(); //����������set��ֵ
    	while(it.hasNext()){
    		Integer id=it.next();   //�����map��ļ�
    		HashMap<Integer, String> calssmap=czbk.get(id);   //�Ӵ�map�����ֵȡ��Сmap�ŵ�classmap����
    		Set<Integer> classinfo=calssmap.keySet(); //�ظ��������� 38-39
    		Iterator<Integer> its=classinfo.iterator();
    		while(its.hasNext()){
    			int ids=its.next();
    			String name=calssmap.get(ids);
    			System.out.println(ids+"   "+name);
    			}
    	}
    }
}
