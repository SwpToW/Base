package day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * 集合里面的嵌套，集合里面放集合
 * 这里使用Map里面放Map
 * 要求：传智播客
 *       JAVA基础班  基础班看作一个Map集合
 *       001 张三    学号和名字看作一个键值对
 *       002 李四
 *       
 *       JAVA就业班
 *       001 王五
 *       002 赵六
 * 对以上数据进行对象的存储
 */
public class collectionsIncollTest {
	public static void main(String[] args) {
		function();
	}
    public static void function(){
    	HashMap<Integer, String> JC=new HashMap<Integer,String>();
    	JC.put(1, "张三");
    	JC.put(2, "李四");
    	HashMap<Integer, String> JY=new HashMap<Integer,String>();
    	JY.put(1, "王五");
    	JY.put(2, "赵六");
    	HashMap<Integer, HashMap<Integer, String>> CB=new HashMap<Integer,HashMap<Integer,String>>();
    	CB.put(1, JC);
    	CB.put(2, JY);
    	collectionsIncollTest.keySet(CB);
    	collectionsIncollTest.EntrySet(CB);
    }
    public static void EntrySet(HashMap<Integer,HashMap<Integer, String>> czbk){ // Map.entry接口来遍历集合的嵌套
    	Set<Map.Entry<Integer, HashMap<Integer, String>>> s=czbk.entrySet();//把大Map的映射关系放到s里面
        Iterator<Map.Entry<Integer, HashMap<Integer, String>>> it=s.iterator();//迭代器迭代s
        while(it.hasNext()){
        	 int id=it.next().getKey();//得到映射关系的键值
        	 HashMap<Integer, String> classmap=czbk.get(id);//把映射关系里面得到的值(HashMap)放到classmap集合里面
        	 Set<Map.Entry<Integer, String>> student=classmap.entrySet();//再得到classmap集合里面的映射关系(用集合存储)
        	 Iterator<Map.Entry<Integer, String>> it1=student.iterator();//迭代上面那个entry集合
        	 while(it1.hasNext()){
        		 Map.Entry<Integer, String> m=it1.next();//得到每一对键值的映射关系
        		 System.out.println(m.getKey()+"   "+m.getValue());//用getkey和getvalue方法来取值
        	 }
        	 
        	 
        }
    }
    public static void keySet(HashMap<Integer,HashMap<Integer,String>> czbk){
    	Set<Integer> set=czbk.keySet();  //先把大Map的键取到集合set里面
    	Iterator<Integer> it=set.iterator(); //迭代器迭代set的值
    	while(it.hasNext()){
    		Integer id=it.next();   //保存大map里的键
    		HashMap<Integer, String> calssmap=czbk.get(id);   //从大map里面的值取出小map放到classmap里面
    		Set<Integer> classinfo=calssmap.keySet(); //重复上述操作 38-39
    		Iterator<Integer> its=classinfo.iterator();
    		while(its.hasNext()){
    			int ids=its.next();
    			String name=calssmap.get(ids);
    			System.out.println(ids+"   "+name);
    			}
    	}
    }
}
