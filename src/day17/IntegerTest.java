package day17;

public class IntegerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str=String.valueOf(34);
         System.out.println(str);
         String s=Integer.toString(159); //int ת��String
         System.out.println(s);
		Integer i=new Integer("564");// i==j false  ��Ϊ==�Ƚ��ڴ��ַ  
		Integer j=new Integer("564");// i.eauals(j)  true   ��д��equals����
         //i.intValue();   //
         i=i+100;
         System.out.println(i);
      
         String in=j+"";   //int��һ���մ�ֱ�ӱ��String
	}

}
