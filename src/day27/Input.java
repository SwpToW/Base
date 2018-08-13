package day27;
//输入线程任务类
public class Input implements Runnable{
    private Resource r;

	public Input(Resource r){
		this.r=r;
	}
	public void run() {
	   int count=0;
	   while(true){
		   if(count==0){
			   r.set("小明", "男生");
		   }else{
			   r.set("小花", "女生");
		   }
		   count=(count+1)%2;
	   }
		
	}
   
}
