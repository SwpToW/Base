package day17;

import java.util.Arrays;

/*
 * ����һ������������һ�����飬������ʮ���˵ĳɼ������ؿ��Է�����͵ĵ������˷���
 */
public class ArraysTest2 {
   public static int[] search(int[] ten){
	   Arrays.sort(ten);
	   int[] result=new int[3];
	   System.arraycopy(ten, 0, result, 0, 3);
	   // 	arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
       //��ָ��Դ�����и���һ�����飬���ƴ�ָ����λ�ÿ�ʼ����Ŀ�������ָ��λ�ý�����
	   return result;
   }
   public static void main(String[] args) {
	int[] ten={122,34,5,45,767,9,92,5,24,643};
	for (int i = 0; i < ArraysTest2.search(ten).length; i++) {
		System.out.println(ArraysTest2.search(ten)[i]);
	}
}
}
