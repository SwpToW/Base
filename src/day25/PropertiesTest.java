package day25;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
 * * A: Properties集合的特点
		* a: Properties类介绍
			* Properties 类表示了一个持久的属性集。Properties 可保存在流中或从流中加载。属性列表中每个键及其对应值都是一个字符串
		* b: 特点
			* Hashtable的子类，map集合中的方法都可以用。 //继承HashTable 实现Map接口
			* 该集合没有泛型。键值都是字符串。
			* 它是一个可以持久化的属性集。键值可以存储到集合中，也可以存储到持久化的设备(硬盘、U盘、光盘)上。键值的来源也可以是持久化的设备。
			* 有和流技术相结合的方法。
 */
public class PropertiesTest {
    public static void main(String[] args) throws IOException {
		function2();
	}
    /*
     * .
     * 
     * 
     * 使用properties存储键值对    setProperty()等同于map接口中的put
     * 通过键获取值 ，getProperty(String key) 
     * 将所有键值存储到set集合中 stringPropertyName();
     */
    public static void function(){
    	Properties pro=new Properties();
    	pro.setProperty("Swp", "Wjq");//这是我所期待的
    	pro.setProperty("Wjq", "Swp");//这是我所期待的
    	
    	System.out.println(pro);
    	String value=pro.getProperty("Swp");
    	System.out.println(value);
    	Set<String> set=pro.stringPropertyNames();
    	for(String key:set){
    		System.out.println(key+"   "+pro.getProperty(key));
    	}
    }
    /*
     * properties集合特有方法 
     * load(InputStream in)
     * load(Reader r)
     * 参数是任意的字节或者字符输入流
     * 将流对象里面的键值对存储到集合中 
     * 
     */
    public static void function1() throws IOException{
    	Properties pro=new Properties();
    	FileReader fr=new FileReader("C:\\pro.porperties");
    	pro.load(fr);
    	fr.close();
    	System.out.println(pro);
    }
    /*
     * store(OutputStream out)
     * store(Writer w)
     * 将集合中的键值对写回文件中保存
     */
    public static void function2() throws IOException{
    	Properties pro=new Properties();
    	pro.setProperty("Swp", "Wjq");
    	pro.setProperty("很久很久", "真实存在");
    	FileOutputStream fos=new FileOutputStream("C:\\pro.porperties");
    	pro.store(fos, "i need you");
    	fos.close();
    	
    }
}
