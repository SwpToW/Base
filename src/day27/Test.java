package day27;
/*
 *   多个线程卖票
 */
public class Test {
    public static void main(String[] args) {
		Ticket ticket=new Ticket();
	     new Thread(ticket,"窗口1").start();
	     new Thread(ticket,"窗口2").start();
	     new Thread(ticket,"窗口3").start();
	}
}
