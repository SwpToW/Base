package day26;
/*
 * �����ڲ��࣬ʵ�ֶ��̳߳���
 * Ҫ��;Ҫ�м̳л�ӿ�ʵ��
 */
public class ThreadTest2 {
    public static void main(String[] args) {
    	//����
		new  Thread(){
			public void run(){
				System.out.println("!!!");
			}
		}.start();
		//�ӿ�
		Runnable r=new Runnable(){
			public void run(){
				
			}
		};
		new Thread(r).start();
	}
}
