package day20;
/*
 * JDK1.5新特性：方法的可变参数; 本质上可变参数就是一个数组
 * 前提：方法参数数据类型确定，但是个数不确定，可以任意
 * 注意事项：
 * 一个方法中，可变参数只能有一个
 * 可变参数，必须写在参数列表的最后一位
 * public static int(int a,int b,int...c)
 * 最强大的可变参有(Object...i),这样就可以传任意参数
 */
public class VarArgumentTest {
    /*
     * 定义一个方法，计算两个整数和
     * 定义一个方法，计算三个整数和
     * 接下来好多好多好多个整数和怎么办呢
     */
	public static void main(String[] args) {
		System.out.println(getSumfinal(1,5,4,8));
	}
	
	public static int getSumfinal(int...a){//格式，数据类型...变量名   一定是三个点 本质上可变参数就是一个数组
		int sum=0;
		for(int i:a){
			sum=sum+i;
		}
		return sum;
	}
}
