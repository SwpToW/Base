package day15;

public class Test01 {	
	public static void main(String[] args) {
		//demo1();
		demo2();
	    //demo3();
		//demo4();
		//demo5();
	}
	private static void demo5() {
		String s1 = "ab";
		String s2 = "abc";
		String s3 = s1 + "c";
		System.out.println(s3);
		System.out.println(s3 == s2);//  s2��abc��s3�ڴ�����ʱ���������Ѿ���abc����������ָ�����ͬһabc��ַ
		System.out.println(s3.equals(s2)); 		//true String���Ѿ���дequals�����Ƚϵ�������
	}
	private static void demo4() {
		//byte b = 3 + 4;						//�ڱ���ʱ�ͱ��7,��7��ֵ��b,�����Ż�����
		String s1 = "a" + "b" + "c";//java���г����Ż�����,�ڱ���ʱ�ھ���ȷ��s2��ֵΪ"abc",���Ա���ʱ��,�ڳ������д���"abc"
		String s2 = "abc";//ִ�е�����ʱ���������Ѿ�����"abc",���ԾͲ��ٴ���,����s1��s2ָ����ǳ�������ͬһ���ַ�������"abc"
		System.out.println(s1 == s2); 			//true,java���г����Ż�����	
		System.out.println(s1.equals(s2)); 		//true
	}
	private static void demo3() {//==�Ƚϵ��ǵ�ֵַ
		String s1 = new String("abc");			//¼���Ƕ��ڴ����ĵ�ֵַ		
		String s2 = "abc";						//��¼���ǳ������еĵ�ֵַ
		System.out.println(s1 == s2); 			//false
		System.out.println(s1.equals(s2)); 		//true
	}
	private static void demo2() {
		//������������
		//������������,һ���ڳ�������,һ���ڶ��ڴ���
		String s1 = new String("abc");		
		System.out.println(s1);
	}
	private static void demo1() {				//��������û������ַ�������,�ʹ���һ��,�����ֱ���ü���
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1 == s2); 			//==�űȽϵ��ǵ�ֵַ,true	
		System.out.println(s1.equals(s2)); 		//�Ƚϵ����ַ���������:true
	}
}
