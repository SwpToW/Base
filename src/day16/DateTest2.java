package day16;

import java.util.Date;

public class DateTest2 {
    public static void main(String[] args) {
		function();
		function1();
	}
    //Date��getTime()��������longֵ����,������ת�ɺ���ֵ
    public static  void function(){
    	Date date=new Date();
    	long time=date.getTime();
    	System.out.println(time);
    }
    //Date��setTime(lone)���ݺ���ֵ�����ƶ�����ֵת��������
    public static void function1(){
    	Date date=new Date();
    	date.setTime(0);
    	System.out.println(date);
    }
}
