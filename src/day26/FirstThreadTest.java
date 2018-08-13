package day26;
/*
 * 继承Thread类
 * 重写父类方法run()
 */
public class FirstThreadTest extends Thread{
     public void run(){
    	 for(int i=0;i<10;i++){
    		 System.out.println("run...."+i);
    	 }
     }
}
