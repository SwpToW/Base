package day21;

public class ArrayToolsTest {
  public static void main(String[] args) {
	int[] arr={1,2,3,4};
	int i=getArray(arr);  //异常抛到main方法,main方法找有没有处理异常的程序，如果没有找到就抛给JVM
	 //JVM 做两件事，把异常打印到控制台，并结束程序
	System.out.println(i);
}
  public static int getArray(int[] arr){
	  int i=arr[3];  //如果有数组越界异常，抑或是其他异常被抛出，后面的所有程序将不会被执行
	  return i+1; //接上，产生异常的话抛给调用者main
  }
}
