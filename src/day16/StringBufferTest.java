package day16;

public class StringBufferTest {
     public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
	    sb.append("abcde").append("fgh");//append方法返回的是StringBuffer类 
	    
	    sb.delete(0, 3);  //包含头不包含尾，所以删除0 1 2
	    System.out.println(sb);
	    System.out.println(sb.insert(0, "abc"));//指定位置插入任何字段，字段插入到制定索引位置，原位置索引字段自动靠后
	    System.out.println(sb.replace(0, 4, "fuck"));//指定区间替换制定字符串
	    System.out.println(sb.reverse());//翻转字符串
	    String str=sb.toString(); //将缓冲区里的字符变成String类的字符串，从可变字符串缓冲区对象变成不可变的String类型对象
	}
     
}
