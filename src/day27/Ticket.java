package day27;
/*
 *  来演示一下单个线程卖票的操作
 */
public class Ticket implements Runnable{

	int ticket=100;//一共一百张票
	Object lock=new Object();//锁对象
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			//同步代码块
			synchronized (lock) {
					if(ticket>0){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"正在卖票："+ticket--);
			}else{
				System.out.println("票卖完了，快点滚蛋");
			}
			}
		
		}
	}

}
