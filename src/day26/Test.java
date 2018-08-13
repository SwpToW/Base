package day26;
/*
 * 程序中的主线程
 */
public class Test {
   public static void main(String[] args) {
	 function();
	 System.out.println(Math.abs(-2));
}
   public static void function(){
	   for(int i=0;i<10000;i++){
		   System.out.println(i);
	   }
   }
}
