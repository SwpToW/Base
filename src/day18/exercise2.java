package day18;

import java.util.ArrayList;
import java.util.List;

public class exercise2 {
     public static void main(String[] args) {
    	 List<String> list = new ArrayList<>();
			list.add("b");
			list.add("f");
			list.add("e");
			list.add("c");
			list.add("a");
			list.add("d");
			sort(list);
			System.out.println(list);	// a, b, c, d, e, f
	}

 	private static void sort(List<String> list) {//ѡ������ÿ��Ԫ�غͰ����������ڵ�Ԫ�ض��Ƚ�һ��
 		for (int a = 0; a < list.size(); a++) {
 			for (int b = 0; b < list.size(); b++) {  
 				if (list.get(a).toCharArray()[0] < list.get(b).toCharArray()[0]) {//�Ѽ��ϵ�ÿ��Ԫ�ض�ת�����飬ȡ�����0�����ó����Ƚ�
 					String temp = list.get(a);
 					list.set(a, list.get(b));//set������ָ����Ԫ���滻�Ƶ��ƶ�λ��
 					list.set(b, temp);
 				}
 			}
 		}
 	}
}
