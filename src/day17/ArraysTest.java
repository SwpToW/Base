package day17;

import java.util.Arrays;

/*
 * Arraysһ�����ڲ�������Ĺ�����
 * sort()���ſ�������
 * int binarySearch(�������飬��Ҫ���ҵ�����) ����������  ������ݲ����ڣ��ͷ��أ�-�����-1��  �������ָ�����ݲ��������а�������Ӧ�÷��ڵ�λ��
 * String toString(������һ������)  ��������д ����ʱ���������ĸ�ʽ[1,2,3,45,]
 */
public class ArraysTest {
     public static void main(String[] args) {
		int[] a={1,5,97,6,1,46,1};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		int index=Arrays.binarySearch(a, 3);//���ݲ����ڣ��������3  ����-3-1����-4
		System.out.println(index);
	}
}
