package day16;

public class RegexTest {
       public static void main(String[] args) {
		String qq="978934842";
		String regex="[1-9][0-9]{4,13}";
		System.out.println(qq.matches(regex));
		String phone="13647017631";
		String regex2="[1][3-8][0-9]{9}";
		System.out.println(phone.matches(regex2));
		String str="jfie*feoihf*feoih*iefh";
		String regex3="\\w";//   \w代表字母或字母或者下划线，相当于[z-zA-Z_0-9],\d代表数字0-9
		//String[] s=str.split(regex3);//split方法返回的是String[]数组
		System.out.println(str.replaceAll(regex3, "*"));// replacef方法替换
	}
}
