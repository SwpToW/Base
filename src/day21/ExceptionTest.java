package day21;
/*
 * 关键字Throw
 *   throw在方法内部抛出异常
 *   thorw后面必须要写new出来的对象(必须是Expection对象或者其子类)
 *   
 *   方法中声明异常关键字，throws, 表明此方法可能会有异常，请调用者处理
 *   后面必须跟异常类类名  
 *   
 *   当你去调用了一个抛出了异常的方法，调用者必须要进行处理，否则编译失败
 */
public class ExceptionTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        int[] arr=null;
        getArray(arr);
	}
	public static int getArray(int[] arr) throws Exception{
		//需要对方法参数有一个合法性的判断
		if(arr==null){
			System.out.println("抱歉，数组为空");
			//手动抛异常的对象出来告诉调用者参数有问题
			throw new Exception("抱歉，你给的数组不存在");
		}
		//判断数组是不是有元素
		if(arr.length==0){
			throw new Exception("抱歉，数组里没有东西");
		}
		int i=arr[arr.length-1];
		return i*2;
	}

}
