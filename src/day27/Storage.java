package day27;
/*
 * 生产消费的仓库
 */

import java.util.LinkedList;
import java.util.List;

public class Storage {
	private final int MAX=100;
    private LinkedList<Object>  list=new LinkedList<Object>();
    //生产
    public void produce(){
    	synchronized (list) {
		   while(list.size()==MAX){
			   System.out.println("仓库已满");
			   try {
				list.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   }
		   list.add(new Object());
		   System.out.println("生产者生产了一个，现总量为"+list.size());
		   list.notifyAll();
		}
    }
    //消费
    public void consume(){
    	synchronized (list) {
		   while(list.size()==0){
			   System.out.println("仓库已空");
			   try {
				list.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   }
		   list.remove();
		   System.out.println("消费者取走了一个，现在还有"+list.size());
		   list.notifyAll();
		}
    }
}
