package day26;
/*
 * ʵ��Runable�ӿ���ʵ���߳�
 * ����Thread����������Ĺ��췽���д���Runnable�ӿڵ�ʵ����Ķ���
 * �ٵ���Thread��ķ���
 * 
 * ʵ��Runnable�ӿڵĺô��� ���ӷ������������ص�
 * 
 */
public class RunableThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         RunableThread r=new RunableThread();  //r����ʵ����Runnbale�ӿڵ���Ķ���
         Thread th=new Thread(r); //����Thread����������Ĺ��췽���д���Runnable�ӿڵ�ʵ����Ķ���
         th.start();
         for(int i=0;i<10;i++){
        	 System.out.println("main...." + i);
         }
	}

}
