package day16;
/*
 * StringBuffer���̰߳�ȫ����������StringBuilder������ȫ�����죩��ķ�����ȫһ��
 *  StringBuilder ��ʵ�����ڶ���߳��ǲ���ȫ�ġ������Ҫ������ͬ��������ʹ�� StringBuffer
 *  ��һ��int[] arr={34��12��89��68}ת���ַ�����ʽ[34,12,89,68]
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