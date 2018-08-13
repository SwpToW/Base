package day18;

import java.util.ArrayList;

/*
 * 集合本身不接受基本类型，只接受引用类型
 */
public class ArraylistTest {
   public static void main(String[] args) {
	  /*ArrayList<Integer> AI=new ArrayList<Integer>();
	  AI.add(1);
	  AI.add(2);
	  AI.add(3);
	  AI.add(4);
	  for(int i=0;i<AI.size();i++){
		  System.out.println(AI.get(i));
	  }*/
	   ArrayList<Person>  Ap=new ArrayList<Person>();
	   Ap.add(new Person("a",20));
	   Ap.add(new Person("b",20));
	   Ap.add(new Person("c",20));
	   for(int i=0;i<Ap.size();i++){
		   System.out.println(Ap.get(i));
	   }
}
}
