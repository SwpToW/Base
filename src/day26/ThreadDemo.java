package day26;
/*
 * �߳���ʾ 
 * ����Thread����Ķ��� ����������satrt����
 *    ���̳߳���ִ�У�JVM����run()����
 *    
 *    �߳�ִ�е������ ����CPU���������У�����Ա���ɿ��� 
 *    
 *    �߳�Ĭ������Thread -0 1 2 3....
 *    
 *    static Thread.currentThread() ��̬���� ��������ִ�е��̶߳���
 *    
 *    �����߳����� setName()����
 *    
 *    �߳�����Thread.sleep(����ֵ)  ���߳�����ָ��ʱ��
 */
public class ThreadDemo {
  public static void main(String[] args) throws InterruptedException {
	FirstThreadTest FT=new FirstThreadTest(); //����һ���µ��߳� 
	FT.setName("线程1");
	FT.start();  
	
	System.out.println(FT.getName());
	System.out.println(Thread.currentThread().getName());
	 for(int i=0;i<10;i++){
		 Thread.sleep(1000);
		 System.out.println("main...."+i);
	 }
	 FT.stop();
	 
}
}
