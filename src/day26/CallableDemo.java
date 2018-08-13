package day26;

import java.util.concurrent.Callable;

public class CallableDemo implements Callable<String>{

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+"进程提交");
		return "abc";
	}
     
}
