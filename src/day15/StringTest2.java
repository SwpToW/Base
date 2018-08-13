package day15;
/*
 * 
题目三：查询大字符串中，出现指定小字符串的次数。如“hellojava,nihaojava,javazhenbang”中查询出现“java”的次数�?
�?�路�?1.在大串中，查找小串出现的位置，出现了就次�?+1
        2.在上次小串出现位置的后面继续查找，需要更改大串的内容为上次未查询到的字符串�??
        3.回到第一步，继续查找小串出现的位置，直到大串中查询不到小串为�?
 */
public class StringTest2 {

	public static void main(String[] args) {
		String str="hellojava,nihaojava,javazhenbang";
		
		String s="java";
	     int num=new StringTest2().selectnum(str, s);
	     System.out.println(num);
	}
	public static int selectnum(String big,String small){
		int count=0;
		int index=-1;
		while((index=big.indexOf(small))!=-1){
			count++;
			big=big.substring(index+1);
		}
		return count;
	}

}
