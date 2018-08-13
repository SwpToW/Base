package day21;
/*
 * 异常有编译异常和运行时异常
 * 编译异常:调用了抛出异常的方法，不处理编译失败
 * 
 * 运行异常：抛出的异常RunTimeException抑或是其子类
 * 运行异常的特点
 *  方法内部抛出的是运行异常，new XXXException
 *  方法的声明上不需要throws声明自己可能产生异常
 *  设计原因:
 *    因为运行异常，不能发生，但是如果发生，需要程序员停止程序修改源代码
 *    一旦发生，不要处理，请你修改源代码
 */
public class RunTimeExceptionTest {
   public static void main(String[] args) {
	
  }
   public static void function(){
	   throw new RuntimeException();
   }
}
