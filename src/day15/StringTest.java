package day15;

import java.util.Locale;

/*
 * 题目二：将字符串中，第�?个字母转换成大写，其他字母转换成小写，并打印改变后的字符串�??
�?�路�?1.把字符串分为两个部分，第�?部分为字符串中第�?个字母，第二部分为剩下的字符串�??
        2.把第�?部分字符串转换成大写字母，把第二部分字符串转换成小写字母
        3.把两部分字符串连接在�?起，得到�?个完整的字符�?
        
        �?些方法的实际测试
 */
public class StringTest {
	  public static String get(String property){
		 String g="Get";
		 return g.concat(property);
	  }
      public static void main(String[] args) {
		String str="    abcfD    ";
	    String s=str.replace("fD", "fuck");
	    s.trim();
	    System.out.println(s);
	    String n="name";
	    System.out.println(StringTest.get("name"));
		/*String s1=str.substring(0, 1);
		String s2=str.substring(1);
		s1.toUpperCase(Locale.CHINA);
		s2.toLowerCase(Locale.CHINA);
		
		String s3=s1.concat(s2);
		System.out.println(s3);*/
		
	} 
      
}
