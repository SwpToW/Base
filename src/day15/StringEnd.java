package day15;

import java.util.Scanner;

public class StringEnd {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int count=0;
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(ch[i]>='A'&&ch[i]<='Z'){
				ch[i]+=32;
				count++;
			}else if(ch[i]>='a'&&ch[i]<='z'){
				ch[i]-=32;
				count++;
			}else{
				ch[i]='*';
			}
		}
		String sr=new String(ch);
		System.out.println(sr);
		System.out.println("¹²ÓÐ"+count+"¸ö×ÖÄ¸");
	}
}
