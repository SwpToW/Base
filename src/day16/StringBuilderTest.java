package day16;
/*
 * StringBuffer���̰߳�ȫ����������StringBuilder������ȫ�����죩��ķ�����ȫһ��
 *  StringBuilder ��ʵ�����ڶ���߳��ǲ���ȫ�ġ������Ҫ������ͬ��������ʹ�� StringBuffer
 *  ��һ��int[] arr={34��12��89��68}ת���ַ�����ʽ[34,12,89,68]
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