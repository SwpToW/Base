package day21;

import java.util.NoSuchElementException;

/*
 * ���catchд��һ��
 * �����и�˳�����
 * 
 *  ƽ���쳣���쳣֮��û�м̳й�ϵ,�Ǿ�û��˳��ע�⣺
 *  ���¼���ϵ�쳣������Null...Exception �� Exception 
 *  Exception  ������ߣ�д�ڴ����ĵײ�
 *  ������Ϊ�ж�̬���ԣ�  Exception ����ץס����������͵��쳣�ࡣ
 *  ��������͵�catch�Ͳ������У����²���׼ȷ�����쳣������Ӧ�Ĵ������
 */
public class ManyCatchTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
      /* try{
    	   
       }catch(Exception e){  //�������ߵ��쳣(�м̳й�ϵ�ͻ��ж�̬�����Դ���)д�����棬�����׳��ĵͼ��쳣�ᱻ�䲶�񣬵��µͼ����쳣���񲻵�
    	   
       }*/
		function(1);
	}
	public static void function(int a) throws Exception{
		if(a==0){
			throw new Exception();
		}
		if(a==1){
			throw new RuntimeException();
		}
	}

}
