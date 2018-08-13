package day26;
/*
 * 三种方式实现匿名内部类创建线程
 */
public class ThreeMethodTest {
     public static void main(String[] args) {
		//继承方式
    	 new Thread(){
    		 public void run(){
    			 for(int i=0;i<10;i++){
    			
    				 System.out.println(Thread.currentThread().getName()+"   "+i);
    			 }
    		 }
    	 }.start();
    	 
    	 
    	 //接口方式
    	 Runnable r=new Runnable() {
			public void run() {
				for(int i=0;i<10;i++){
		
					System.out.println(Thread.currentThread().getName()+"   "+i);
   			 }	
			}
		};
		new Thread(r).start();
		
		 //合并接口方式
		
		new Thread(new Runnable() {
			public void run() {
				for(int i=0;i<10;i++){
				
					System.out.println(Thread.currentThread().getName()+"   "+i);
   			 }
			}
		}).start();
	}
}
