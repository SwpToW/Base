package day16;

import java.util.Calendar;

/*
 * ������Calendar��һ�������࣬��Ҫ���������ȥʵ�־���
 * ����Ҫnew�������ֱ�Ӿ�̬����ֱ�ӻ�ȡ
 * get()���� ����int����int 

 * set(int filed,int value)
 * ���趨�����ֶ��趨�ƶ�ֵ
 * 
 * add���� add(int filed,int amount)��������������ƶ��ֶ���ӻ��ȥָ������������Ҳ��ƫ��
 * 
 * getTime()����  ����������ת�������ڶ���
 */
public class CalendarTest {
     public static void main(String[] args) {
		Calendar c=Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR));    //��̬�ֶ�ֱ��ͨ������������
		System.out.println(c.get(Calendar.MONTH)+1);  //�·ݼǵü�1
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		c.set(Calendar.YEAR, 1997);
		System.out.println(c);
		
	}
}
