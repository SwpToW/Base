package day26;

public class ThreadPoolRunnableTest implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+"提交任务");
	}
       
}
