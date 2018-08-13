package day17;

public class IntegerTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Integer i=50;
         Integer j=50;
         System.out.println(i==j); // TURE  
         Integer a=500;
         Integer b=50;
         System.out.println(a==b);  //false
           //为什么以上会不一样呢，因为在Byte范围内（128以下）。JVM不会去new出一个新的地址来存放对象，两者会指向同一内存。大于127就不同了
	}

}
