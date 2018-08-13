package day27;

public class Produce implements Runnable{
	public product r;
	
    public Produce(product r) {
		super();
		this.r = r;
	}

	public  void run(){
		
    	if(r.pronum>=r.MAX_PRODUCT){
			try {
				wait();
				System.out.println("产品已满，请稍后生产");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return;
    	}
    	r.pronum++;
    	System.out.println("生产者生成第"+r.pronum+"个产品");
    	notifyAll();
	
    }
}
