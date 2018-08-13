package day26;
//实现Runnale接口重写Run方法
public class RunableThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++){
			System.out.println("run...." + i);
		}
	}

}
