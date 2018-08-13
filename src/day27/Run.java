package day27;
//测试生产者消费者

public class Run {
	public static void main(String[] args) {
	  //2个生产者，2个消费者
	  Storage s=new Storage();
	  new Thread("生产者1"){
		 public void run(){
			 s.produce();		 
	  }
   }.start();
	  new Thread("生产者2"){
		 public void run(){
			 s.produce();		 
	  }
   }.start();
	  new Thread("消费者2"){
		 public void run(){
			 s.consume();		 
	  }
}.start();
new Thread("消费者1"){
	 public void run(){
		s.consume();	 
}
}.start();
 
	}
}
	
