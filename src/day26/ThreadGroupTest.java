package day26;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * �̳߳�  Executors��  �̳߳صĹ�����
 * static ExcutorService(����һ���ӿ�) newFixedThreadPool(int num) �����̳߳ض��� 
 */
public class ThreadGroupTest {
    public static void main(String[] args) {
		ExecutorService ex=Executors.newFixedThreadPool(5);//����һ���̶��߳������̳߳ض���
		//ExcutorServise�е�submit���� �ύ�߳�����
		ex.submit(new ThreadPoolRunnableTest());
		ex.submit(new ThreadPoolRunnableTest());
		ex.submit(new ThreadPoolRunnableTest());
		//ex.shutdown(); �����̳߳� ��������ʹ��
		
	}
}
