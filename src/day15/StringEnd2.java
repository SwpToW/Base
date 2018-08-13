package day15;

public class StringEnd2 {
    public static Object[] deleteSubString(String str1,String str2){
    	int count=0;
    	while((count=str1.indexOf(str2))!=0){
    		count++;
    	}
    	String s=str1.replace("java", "");
    	Object[] O={count,s};
    	return O;
    	
    	
    }
	public static void main(String[] args) {
		String str1="jfwjavaghjavageekfepjava";
		String str2="java";
		System.out.println(str1.hashCode());
		
	  
	}

}
