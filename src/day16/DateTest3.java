package day16;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * DateFormat类  日期格式类，是一个抽象类,用他的子类SimpleDateFormat
 */
public class DateTest3 {
      public static void main(String[] args) {
	       System.out.println(formatTest());
	} 
      //对日期格式化的步骤，创建SimpleDateFormat对象，在类构造方法中写入字符串日期格式，调用format方法格式化
      //format（）方法返回的是String
      //格式:yyyy 年份 MM月份  dd月中的天数   HH 0-23小时  mm 小时中的分钟 ss秒
      public static String formatTest(){
    	  SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日HH点mm分钟ss秒");
    	  Date date=new Date();
    	  return sdf.format(date);
    	  
      }
}
