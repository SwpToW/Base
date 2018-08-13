package day20;
/*
 * JDK1.5新特性：静态导入，减少开发的代码量
 * 标准写法，导入包的时候才能使用
 */
import static java.lang.System.out;//这样的语句最末尾必须是一个静态成员
public class StaticImportTest {
public static void main(String[] args) {
	out.println("0.0");//这里就可以不写System
}
}
