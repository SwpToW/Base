package day30;
/*
 * 反射机制
 */
public class Reflect {
   public static void main(String[] args) {
	/*
	 *  根据模块划分servlet  同样的模块请求同一个servlet
	 *  根据方法来实现特定的需求
	 *  页面请求的url 后面需要带上方法名和页面给出的参数
	 *  
	 */
	   //1.获取页面请求的方法名称
	   //String methodName=req.getParametr("method");
	   //2.获取当前被访问对象的字节码对象
	   //Class clazz=this.getClass();
	   //3.获取当前字节码对象的制定方法
	   //Method method=clazz.getMethod(methodName,req.class,res.class);
	   //4.执行方法
	   //method.invoke(this.req,resp);
}
}  
