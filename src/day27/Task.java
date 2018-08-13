package day27;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;

/*
 * 线程任务类，规定线程要执行的任务
 */
public class Task implements Runnable {
    int x=new Random().nextInt(1);
	@Override
	public void run() {
		while(true){
			if(x%2==0){
				//情况1
				synchronized (MyLock.lockA) {
					System.out.println("if-lockA");
					synchronized (MyLock.lockB) {
						System.out.println("if-lockB");
						System.out.println("if大口吃肉");
					}
				}
			}else{
				//情况2
				synchronized (MyLock.lockB) {
					System.out.println("if-lockB");
					synchronized (MyLock.lockA) {
						System.out.println("if-lockA");
						System.out.println("else大口吃肉");
					}
				}
			}
			x++;
		}
		
	}

	
}
