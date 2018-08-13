package day21;
/*
 * 继承后，在子类重写父类方法的时候异常处理
 * 父类的方法，如果抛出异常，子类重写后，可以不抛出异常，也可以抛出异常
 * 但是如果子类要抛，抛出的异常不能大于父类异常，大小指的是继承关系
 * 父类的方法，如果没有抛出异常，那么子类不可以抛出异常
 * 
 */
public class extendsRewriteTest {

}
class Father{
	public void function(){}
}
class son extends Father{
	public void function(){}
}
