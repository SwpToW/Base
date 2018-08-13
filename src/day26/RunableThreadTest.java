package day26;
/*
 * 实现Runable接口来实现线程
 * 创建Thread类对象，在它的构造方法中传递Runnable接口的实现类的对象
 * 再调用Thread类的方法
 * 
 * 实现Runnable接口的好处： 更加符合面向对象的特点
 * 
 */
public class RunableThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         RunableThread r=new RunableThread();  //r就是实现了Runnbale接口的类的对象
         Thread th=new Thread(r); //创建Thread类对象，在它的构造方法中传递Runnable接口的实现类的对象
         th.start();
         for(int i=0;i<10;i++){
        	 System.out.println("main...." + i);
         }
	}

}
