package day16;

import java.util.Date;

/*
 *   Date �� ���� ms  1000ms=1S
 *   ʱ��ԭ�㣺 ��Ԫ1970��1��1�գ���ҹ00��00��00  ��Ӧ�ĺ���ֵ����0
 */
public class DateTest {
    public static void main(String[] args) {
		//long time =System.currentTimeMillis();  //��ȡ��ǰʱ�����ֵ
		//System.out.println(time);
    	function();
    	function1();
	}
    //Date����޲ι��췽����ȡ����ǰ����ϵͳ�е�ʱ�������
    public static void function(){
    	Date date=new Date();
    	System.out.println(date);
    }
    //Date����вι���,����һ��long�����ݴ������ֵ��
    public static void function1(){
    	Date date=new Date(0);
    	System.out.println(date);
    }
}
