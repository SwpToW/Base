package day16;

public class RegexTest2 {
    public static void main(String[] args) {
		String ip="192.168.1.100";
		String regex="\\.";
		String[] ipadr=ip.split(regex);//split方法按照匹配的正则切割字符串并返回数组
		for(int i=0;i<ipadr.length;i++){
			System.out.print(ipadr[i]+" ");
		}
	}
}
