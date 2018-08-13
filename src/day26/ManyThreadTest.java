package day26;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 * 多线程技术，求和
 * 一个线程计算1+。。。100 另一个线程计算1+。。。200
 */
public class ManyThreadTest {
    public static void main(String[] args) throws Exception, ExecutionException {
		ExecutorService ex= Executors.newFixedThreadPool(2);
		Future f1=ex.submit(new GetSumCallable(100));
		Future f2=ex.submit(new GetSumCallable(200));
		System.out.println(f1.get());
		System.out.println(f2.get());
		ex.shutdown();
	}
}
