package day21;
/*
 * 异常的处理方式
 *   try....catch...finally
 *   try{
 *      可能出现异常的代码
 *   }catch(异常类名 变量){
 *      异常的处理方式，
 *      写什么都行
 *   }finally{
 *      必须要执行的代码
 *   }
 *   
 *   这个方式就可以让程序自己处理异常，并不抛给JVM导致程序停止运行
 */
public class TryCacthTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr={1,2};
        try{
        int i=getArray(arr);
        System.out.println(i);
        }catch(IndexOutOfBoundsException ex){//多catch运行机制，一个catch捕获一个异常
        	//System.out.println(ex);
        	ex.printStackTrace();
        }catch(NullPointerException ex){
        	ex.printStackTrace();     //多catch运行机制，一个catch捕获一个异常
        }
        System.out.println("程序结束");
	}
	/*
	 * 定义一个方法，抛出异常
	 */
	public static int getArray(int[] arr) throws NullPointerException,IndexOutOfBoundsException{
		if(arr==null){
			throw new NullPointerException("数组不存在，抱歉");
		}
		if(arr.length<3){
			throw new IndexOutOfBoundsException("抱歉，数组里面并没有3索引");
		}
		return arr[3]+1;
	}

}
