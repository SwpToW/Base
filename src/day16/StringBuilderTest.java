package day16;
/*
 * StringBuffer（线程安全，更慢）与StringBuilder（不安全，更快）里的方法完全一致
 *  StringBuilder 的实例用于多个线程是不安全的。如果需要这样的同步，则建议使用 StringBuffer
 *  把一个int[] arr={34，12，89，68}转成字符串格式[34,12,89,68]
 *  
 */
public class StringBuilderTest {
	public static void main(String[] args) {
		int[] n={34,12,89,68};
		System.out.println(StringBuilderTest.change(n));
	}
     public static StringBuilder change(int[] num){
    	 
    	 String s="]";
    	 StringBuilder sb=new StringBuilder("[");
    	 for(int i=0;i<num.length;i++){
    		 sb.append(num[i]);
    		 if(i!=num.length-1){
    			 sb.append(",");
    		 }
    	
     }
    	 return sb.append(s);
}
}