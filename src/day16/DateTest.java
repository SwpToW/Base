package day16;

import java.util.Date;

/*
 *   Date 类 毫秒 ms  1000ms=1S
 *   时间原点： 公元1970年1月1日，午夜00：00：00  对应的毫秒值就是0
 */
public class DateTest {
    public static void main(String[] args) {
		//long time =System.currentTimeMillis();  //获取当前时间毫秒值
		//System.out.println(time);
    	function();
    	function1();
	}
    //Date类的无参构造方法获取到当前操作系统中的时间和日期
    public static void function(){
    	Date date=new Date();
    	System.out.println(date);
    }
    //Date类的有参构造,传递一个long型数据代表毫秒值。
    public static void function1(){
    	Date date=new Date(0);
    	System.out.println(date);
    }
}
