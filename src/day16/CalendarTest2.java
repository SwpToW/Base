package day16;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest2 {
    /*
     * 计算今天到2019年6月8日还有多少天  Calender的getTime()方法返回一个date类的对象
     *  date类的getTime()方法返回一个毫秒值
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Calendar c=Calendar.getInstance();  //建立一个日历类对象
        c.set(2019, 6, 8);  //设置这个对象的日期
        Date date=c.getTime(); //返回一个date类的对象
        long dl=date.getTime(); //获取这个date类的对象的毫秒值
        
        Calendar now=Calendar.getInstance();//now 是今天  这里可以改成和上面一样的 用set方法来设置具体日期
        Date n=now.getTime(); //返回一个date类的对象
        long dx=n.getTime();  //获取这个对象的毫秒值
        System.out.println((dl-dx)/1000/60/60/24);// 两者之间相差的毫秒值可以计算表
        
	}

}
