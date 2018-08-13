package day18;
/*
 * 增强型for循环 内部原理其实是个迭代器
 * 格式
 * for(数据类型 变量名:数组或集合){
 *   sop(变量)；
 * }
 */
public class ForeachTest {
       public static void main(String[] args) {
		int[] arr={1,54,54,8,1,651,61};
		for(int x: arr){
			System.out.println(x);//注意：增强型循环只能用来遍历，没有索引不能够操作容器里的元素！！！遍历对象集合可以调用对象方法
		}
	}
}
