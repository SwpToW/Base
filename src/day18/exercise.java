package day18;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class exercise {

	public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("d");
		list.add("d");
		list.add("d");
		list.add("d");
		
		System.out.println(frequency(list, "a"));	// 3
		System.out.println(frequency(list, "b"));	// 2
		System.out.println(frequency(list, "c"));	// 1
		System.out.println(frequency(list, "d"));	// 5
		System.out.println(frequency(list, "xxx"));	// 0
	}

	public static int frequency(List<String> list, String str) {
		int count=0;
		Iterator it=list.iterator();
		while(it.hasNext()){
			if(it.next().equals(str)){
				count++;
			}
		}
		return count;
	}
    
}
