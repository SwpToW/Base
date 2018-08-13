package day17;

public class IntegerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str=String.valueOf(34);
         System.out.println(str);
         String s=Integer.toString(159); //int 转到String
         System.out.println(s);
		Integer i=new Integer("564");// i==j false  因为==比较内存地址  
		Integer j=new Integer("564");// i.eauals(j)  true   重写了equals方法
         //i.intValue();   //
         i=i+100;
         System.out.println(i);
      
         String in=j+"";   //int加一个空串直接变成String
	}

}
