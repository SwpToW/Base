package day17;
/*
 * system ��ķ���ֱ�Ӿ�̬����
 * currentTimeMillis()����  ����ȡϵͳ��ǰ����ֵ�ķ��� ����long������
 * ����:���ԶԳ���ִ�е�ʱ����в���
 */
public class systemTest {
     public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
	}
     public static void function(){
    	 for(int i=0;i<10000;i++){
    		System.out.println(i); 
    	 }
     }
}
