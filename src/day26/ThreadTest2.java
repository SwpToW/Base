package day26;
/*
 * 匿名内部类，实现多线程程序
 * 要求;要有继承或接口实现
 */
public class ThreadTest2 {
    public static void main(String[] args) {
    	//子类
		new  Thread(){
			public void run(){
				System.out.println("!!!");
			}
		}.start();
		//接口
		Runnable r=new Runnable(){
			public void run(){
				
			}
		};
		new Thread(r).start();
	}
}
