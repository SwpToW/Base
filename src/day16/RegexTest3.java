package day16;
//邮箱验证未完成
import java.util.Scanner;

public class RegexTest3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
     String email=sc.next();    
     if(email.matches("\\w+@\\w+(\\.[a-z]+)+")!=true){// +号代表一次到多次 \\w+表示前面表示字母数字下划线不限个数
    	 System.out.println("邮箱错误");
     }else{
    	 System.out.println("格式正确");
     }
     
	}
     
}
