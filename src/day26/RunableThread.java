package day26;
//ʵ��Runnale�ӿ���дRun����
public class RunableThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++){
			System.out.println("run...." + i);
		}
	}

}
