package day16;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * DateFormat��  ���ڸ�ʽ�࣬��һ��������,����������SimpleDateFormat
 */
public class DateTest3 {
      public static void main(String[] args) {
	       System.out.println(formatTest());
	} 
      //�����ڸ�ʽ���Ĳ��裬����SimpleDateFormat�������๹�췽����д���ַ������ڸ�ʽ������format������ʽ��
      //format�����������ص���String
      //��ʽ:yyyy ��� MM�·�  dd���е�����   HH 0-23Сʱ  mm Сʱ�еķ��� ss��
      public static String formatTest(){
    	  SimpleDateFormat sdf=new SimpleDateFormat("yyyy��MM��dd��HH��mm����ss��");
    	  Date date=new Date();
    	  return sdf.format(date);
    	  
      }
}
