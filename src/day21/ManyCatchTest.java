package day21;

import java.util.NoSuchElementException;

/*
 * 多个catch写在一起
 * 这里有个顺序概念
 * 
 *  平级异常，异常之间没有继承关系,那就没有顺序，注意：
 *  上下级关系异常，比如Null...Exception 和 Exception 
 *  Exception  级别更高，写在代码块的底部
 *  这是因为有多态特性，  Exception 可以抓住比他级别更低的异常类。
 *  这样级别低的catch就不会运行，导致不能准确捕获异常做出相应的处理操作
 */
public class ManyCatchTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
      /* try{
    	   
       }catch(Exception e){  //如果级别高的异常(有继承关系就会有多态的特性存在)写在上面，方法抛出的低级异常会被其捕获，导致低级的异常捕获不到
    	   
       }*/
		function(1);
	}
	public static void function(int a) throws Exception{
		if(a==0){
			throw new Exception();
		}
		if(a==1){
			throw new RuntimeException();
		}
	}

}
