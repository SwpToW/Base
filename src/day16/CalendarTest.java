package day16;

import java.util.Calendar;

/*
 * 日历类Calendar是一个抽象类，需要用子类对象去实现具体
 * 不需要new子类对象，直接静态调用直接获取
 * get()方法 参数int返回int 

 * set(int filed,int value)
 * 给设定日历字段设定制定值
 * 
 * add方法 add(int filed,int amount)根据日历规则给制定字段添加或减去指定数量（），也叫偏移
 * 
 * getTime()方法  将日历对象转换成日期对象
 */
public class CalendarTest {
     public static void main(String[] args) {
		Calendar c=Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR));    //静态字段直接通过类名。调用
		System.out.println(c.get(Calendar.MONTH)+1);  //月份记得加1
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		c.set(Calendar.YEAR, 1997);
		System.out.println(c);
		
	}
}
