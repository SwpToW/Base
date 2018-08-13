package day22;

public class DiGuiTest {
   public static void main(String[] args) {
	System.out.println(getSum(100));
}
   public static int getSum(int n){
	   if(n==1){
		   return 1;
	   }
	   return n+getSum(n-1);
   }
}
