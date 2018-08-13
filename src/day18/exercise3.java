package day18;

import java.util.ArrayList;
import java.util.Iterator;

public class exercise3 {
    public static void main(String[] args) {
		/*ArrayList<String> arr=new ArrayList<String>();´íÎóÊ¾·¶
		arr.add("1");
		arr.add("2");
		arr.add("3");
		arr.add("4");
		arr.add("5");
		ArrayList<String> str=new ArrayList<String>();
		str.add("1");
		str.add("2");
		ArrayList<String> result=new ArrayList<>();
		Iterator I=arr.iterator();
		
		while(I.hasNext()){
		   if(I.next().equals(str.get(0))&&I.next().equals(str.get(1))){
			   result.add((String) I.next());
		   }
		}
		System.out.println(result.get(2));
	}*/
    	String[] str={"1","2","3","4","5","1","2"};
    	String[] s={"1"}; 	
    	ArrayList<String> result=new ArrayList<String>();
    	for(int i=0;i<str.length;i++){
    	   boolean flag=false;
    	   for(int j=0;j<s.length;j++){
    		   if(str[i]==s[j]){
    			   flag=true;
    		   }if(flag){
    			   result.add(str[i]);
    			   flag=false;
    		   }
    	   }
    	}
    	Iterator<String> I=result.iterator();
    	while(I.hasNext()){
    		System.out.println(I.next());
    	}
   }
}