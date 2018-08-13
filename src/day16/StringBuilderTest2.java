package day16;
/*
 * StringBuffer（线程安全，更慢）与StringBuilder（不安全，更快）里的方法完全一致
 *  StringBuilder 的实例用于多个线程是不安全的。如果需要这样的同步，则建议使用 StringBuffer
 *  把一个int[] arr={34，12，89，68}转成字符串格式[34,12,89,68]
 *  
 */
public class StringBuilderTest2 {
	public static void main(String[] args) {
		Swp swp = new Swp();
		System.out.println(swp.hashCode());
		swp.setAge(50);
		swp.setName("sifeizhai");
		System.out.println(swp.hashCode());
		swp.setAge(30);
		System.out.println(swp.hashCode());
	}
}

class Swp{
	int age;
	String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}