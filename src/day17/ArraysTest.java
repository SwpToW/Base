package day17;

import java.util.Arrays;

/*
 * Arrays一个便于操作数组的工具类
 * sort()调优快速排序
 * int binarySearch(有序数组，需要查找的数据) 二分搜索法  如果数据不存在，就返回（-插入点-1）  插入点是指将数据插入数组中按照排序应该放在的位置
 * String toString(参数是一个数组)  方法被重写 调用时返回这样的格式[1,2,3,45,]
 */
public class ArraysTest {
     public static void main(String[] args) {
		int[] a={1,5,97,6,1,46,1};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		int index=Arrays.binarySearch(a, 3);//数据不存在，插入点是3  返回-3-1等于-4
		System.out.println(index);
	}
}
