package day16;
//������֤δ���
import java.util.Scanner;

public class RegexTest3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
     String email=sc.next();    
     if(email.matches("\\w+@\\w+(\\.[a-z]+)+")!=true){// +�Ŵ���һ�ε���� \\w+��ʾǰ���ʾ��ĸ�����»��߲��޸���
    	 System.out.println("�������");
     }else{
    	 System.out.println("��ʽ��ȷ");
     }
     
	}
     
}
