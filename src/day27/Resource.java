package day27;
/*
 * 模拟资源类
 */
public class Resource {
    private String name;
    private String sex;
    private boolean flag=false;  //判断资源类里是否有值
    public synchronized void set(String name,String sex){
    	if(flag)
    	try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
   	 this.name=name;
   	 this.sex=sex;
   	 //设置之后，资源类里面有值了，将标记设置为true；
   	 flag=true;
   	 //唤醒output
   	 this.notify();
    	
   }
    public synchronized void out(){
    	if(!flag)
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	System.out.println("姓名："+name+",性别："+sex);
    	//改变标记，输入线程就可以输入数据
    	flag=false;
    	//叫醒input
    	this.notify();
    }
   
}
