package day17;

import java.util.Arrays;

/*
 * 定义一个方法，接收一个数组，里面有十个人的成绩，返回考试分数最低的的三个人分数
 */
public class ArraysTest2 {
   public static int[] search(int[] ten){
	   Arrays.sort(ten);
	   int[] result=new int[3];
	   System.arraycopy(ten, 0, result, 0, 3);
	   // 	arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
       //从指定源数组中复制一个数组，复制从指定的位置开始，到目标数组的指定位置结束。
	   return result;
   }
   public static void main(String[] args) {
	int[] ten={122,34,5,45,767,9,92,5,24,643};
	for (int i = 0; i < ArraysTest2.search(ten).length; i++) {
		System.out.println(ArraysTest2.search(ten)[i]);
	}
}
}
