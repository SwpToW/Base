package day27;
//消费者线程
public class Consume implements Runnable{

	public product r;
	public  void run() {
		// TODO Auto-generated method stub

		if(r.pronum<=0){
			try {
				wait();
				System.out.println("没货了，快滚");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return;
		}
		System.out.println("消费者取走了第"+r.pronum+"个产品");
		r.pronum--;
		notifyAll();

	}
	public Consume(product r) {
		super();
		this.r = r;
	}
	
     
}
