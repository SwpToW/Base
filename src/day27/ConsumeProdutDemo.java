package day27;

import java.util.HashMap;
import java.util.Hashtable;

//生产者消费者的测试
public class ConsumeProdutDemo {
   public static void main(String[] args) {
	 product p=new product(0,10);
	 Produce p1=new Produce(p);
	 Consume c=new Consume(p);
	 new Thread(p1).start();
	 new Thread(c).start();
	   /*HashMap<String, Integer> h=new HashMap<String,Integer>();
	   h.put("老弟", 1);
	   h.put("二弟", 2);
	   h.put(null, 3);
	   Hashtable<String , Integer> b=new Hashtable<String,Integer>();
	   b.put("三弟", 4);
	   */
	    

}
}
