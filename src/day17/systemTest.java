package day17;
/*
 * system 类的方法直接静态调用
 * currentTimeMillis()方法  ，获取系统当前毫秒值的方法 返回long型数据
 * 作用:可以对程序执行的时间进行测试
 */
public class systemTest {
     public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
	}
     public static void function(){
    	 for(int i=0;i<10000;i++){
    		System.out.println(i); 
    	 }
     }
}
