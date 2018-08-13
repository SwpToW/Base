package day26;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * Callable使用方法和Runnable接口一样
 * 不一样在于Callable可以有返回值并且可以抛出异常
 */
public class CallableTest {
   public static void main(String[] args) {
	ExecutorService ex=Executors.newFixedThreadPool(5);
	ex.submit(new CallableDemo());
}
}
