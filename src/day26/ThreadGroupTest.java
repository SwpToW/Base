package day26;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * 线程池  Executors类  线程池的工厂类
 * static ExcutorService(这是一个接口) newFixedThreadPool(int num) 返回线程池对象 
 */
public class ThreadGroupTest {
    public static void main(String[] args) {
		ExecutorService ex=Executors.newFixedThreadPool(5);//创建一个固定线程数的线程池对象
		//ExcutorServise中的submit方法 提交线程任务
		ex.submit(new ThreadPoolRunnableTest());
		ex.submit(new ThreadPoolRunnableTest());
		ex.submit(new ThreadPoolRunnableTest());
		//ex.shutdown(); 击毁线程池 ，不建议使用
		
	}
}
