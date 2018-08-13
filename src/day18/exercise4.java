package day18;

import java.util.ArrayList;
import java.util.Iterator;

public class exercise4 {
       public static void main(String[] args) {
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("1");
		arr.add("2");
		arr.add("3");
		arr.add("4");
		arr.add("5");
		String[] str={"1","2","1"};
		
		ArrayList<String> result=new ArrayList<String>();
		for(int i=0;i<arr.size();i++){
			boolean flag=false;
            if(arr.get(i)==str[0]){
            	System.out.println(arr.get(i)+"和"+str[0]+"相等");
            	flag=true;
            }if(arr.get(i)==str[1]){
            	System.out.println(arr.get(i)+"和"+str[1]+"相等");
            	flag=true;
            }if(!flag){
            	result.add(arr.get(i));
            	flag=false;
            }
           
		}
		Iterator<String> I=result.iterator();
    	while(I.hasNext()){
    		System.out.println(I.next());
    	}
}
}