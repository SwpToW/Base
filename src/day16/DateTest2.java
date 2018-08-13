package day16;

import java.util.Date;

public class DateTest2 {
    public static void main(String[] args) {
		function();
		function1();
	}
    //Date类getTime()方法返回long值毫秒,将日期转成毫秒值
    public static  void function(){
    	Date date=new Date();
    	long time=date.getTime();
    	System.out.println(time);
    }
    //Date类setTime(lone)传递毫秒值，将制定毫秒值转换成日期
    public static void function1(){
    	Date date=new Date();
    	date.setTime(0);
    	System.out.println(date);
    }
}
