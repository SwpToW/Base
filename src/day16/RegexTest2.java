package day16;

public class RegexTest2 {
    public static void main(String[] args) {
		String ip="192.168.1.100";
		String regex="\\.";
		String[] ipadr=ip.split(regex);//split��������ƥ��������и��ַ�������������
		for(int i=0;i<ipadr.length;i++){
			System.out.print(ipadr[i]+" ");
		}
	}
}
