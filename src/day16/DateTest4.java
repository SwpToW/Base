package day16;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//Date�෽��parse�����������ַ������ַ�������Ϊһ�����ڶ���
   //�û�����String�õ�һ��Date
/*
 * ���裬�ȴ���SimpleDateFormat�Ķ��󣬹��췽�����ƶ�����ģʽ�� 
 * ����������parse��������String����Date
 */
public class DateTest4 {
	public static void main(String[] args) {
		changeToDate();
	}
   public static void changeToDate(){
	    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");//�ǵô�ģʽ
	    Date date=new Date();
		try {
			date = sdf.parse("1997-6-17");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    System.out.println(date);
   }
}
