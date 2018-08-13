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

 	private static void sort(List<String> list) {//选择排序，每个元素和包括本身在内的元素都比较一次
 		for (int a = 0; a < list.size(); a++) {
 			for (int b = 0; b < list.size(); b++) {  
 				if (list.get(a).toCharArray()[0] < list.get(b).toCharArray()[0]) {//把集合的每个元素都转成数组，取数组的0索引拿出来比较
 					String temp = list.get(a);
 					list.set(a, list.get(b));//set方法用指定的元素替换制到制定位置
 					list.set(b, temp);
 				}
 			}
 		}
 	}
}
