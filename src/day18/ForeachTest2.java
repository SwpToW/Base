package day18;

import java.util.ArrayList;

/*
 * ��ǿforѭ������������
 */
public class ForeachTest2 {
       public static void main(String[] args) {
		  ArrayList<Person> Ap=new ArrayList<Person>();
		  Ap.add(new Person("a",20));
		  Ap.add(new Person("b",20));
		  for(Person p:Ap){
			  System.out.println(p.toString());
		  }
	}
}
