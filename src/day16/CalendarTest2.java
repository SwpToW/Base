package day16;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest2 {
    /*
     * ������쵽2019��6��8�ջ��ж�����  Calender��getTime()��������һ��date��Ķ���
     *  date���getTime()��������һ������ֵ
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Calendar c=Calendar.getInstance();  //����һ�����������
        c.set(2019, 6, 8);  //����������������
        Date date=c.getTime(); //����һ��date��Ķ���
        long dl=date.getTime(); //��ȡ���date��Ķ���ĺ���ֵ
        
        Calendar now=Calendar.getInstance();//now �ǽ���  ������Ըĳɺ�����һ���� ��set���������þ�������
        Date n=now.getTime(); //����һ��date��Ķ���
        long dx=n.getTime();  //��ȡ�������ĺ���ֵ
        System.out.println((dl-dx)/1000/60/60/24);// ����֮�����ĺ���ֵ���Լ����
        
	}

}
