package day17;
/*
 * 数学工具类Math全是静态方法组成
 */
public class MathTest {
    public static void main(String[] args) {
		function();
	}
    /*
     * abs(参) 获取参数绝对值   
     * double ceil(double d)返回大于或者等于参数d的最小double类型整数
     * double floor(double d) 返回小于等于参数d的最大整数
     * double pow(a,b) 返回a的b次方
     * double sqrt(double d) 返回d的开方根
     * double random() 返回随机数0.0到1.0之间
     * double round(double d)获得参数的四舍五入值取整数
     */
    public static void function(){
    	double d=Math.ceil(5.1); //-11.5
    	System.out.println(d);  //返回-11
    }
}
