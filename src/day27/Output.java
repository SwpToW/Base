package day27;

public class Output implements Runnable{

	private Resource r;
	public Output(Resource r){
		this.r=r;
	}
	public void run() {
		// TODO Auto-generated method stub
	   while(true){
		   r.out();
	   }
	}
	

}
