package day26;
/*
 * �̳�Thread��
 * ��д���෽��run()
 */
public class FirstThreadTest extends Thread{
     public void run(){
    	 for(int i=0;i<10;i++){
    		 System.out.println("run...."+i);
    	 }
     }
}
