package day26;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * Callableʹ�÷�����Runnable�ӿ�һ��
 * ��һ������Callable�����з���ֵ���ҿ����׳��쳣
 */
public class CallableTest {
   public static void main(String[] args) {
	ExecutorService ex=Executors.newFixedThreadPool(5);
	ex.submit(new CallableDemo());
}
}
