package day21;
/*
 * Throwable的一些方法
 * String getMessage() 对异常信息的详细描述
 * String toString ()
 * void printStackTrace()将异常信息追踪到标准的错误流，异常信息最全
 */
public class ThrowableFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         try {
			function();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	public static void function() throws Exception {
		throw new Exception("我是异常");
	}

}
