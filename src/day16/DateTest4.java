package day16;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//Date类方法parse（）方法将字符串将字符串解析为一个日期对象
   //用户输入String得到一个Date
/*
 * 步骤，先创建SimpleDateFormat的对象，构造方法中制定日期模式， 
 * 子类对象调用parse方法传递String返回Date
 */
public class DateTest4 {
	public static void main(String[] args) {
		changeToDate();
	}
   public static void changeToDate(){
	    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");//记得传模式
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
