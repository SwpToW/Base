package day22;

import java.io.File;

/*
 * File类的获取功能
 */
public class FileTest3 {
   public static void main(String[] args) {
	function();
}
   /*
    * String getName()  返回路径中表示的文件或者文件夹名,获取到路径最后部分的名字，比如下面的eclipse
    * 这个方法并不关心文件对象本身是否正确，只是对String进行了切割得到路径最后的部分
    * String getPath()  返回文件对象的toString
    * long length() 返回路径中表示的文件的字节数
    * String getAbsolutePath() 获取绝对路径,返回String对象
    * File getAbsoluteFile() 也是获取绝对路径，返回File对象
    * 在eclipse环境中，写的是一个相对路径，绝对位置就是工程根目录，这里是JAVAbase
    */
   /*
    * File类的获取功能
    * String getParent()    返回父目录的String对象
    *
    * File getParentFile() 返回腹部路的File对象
    */
   public static void function(){
	   File file=new File("D:\\eclipse\\ecplise.exe");
	   /*System.out.println(file.getName());
	   System.out.println(file.getPath());
	   long length=file.length();
	   System.out.println(length);
	   File FAB=file.getAbsoluteFile();
	   System.out.println(FAB);*/
	   File file2=file.getParentFile().getParentFile();//注意盘符是顶层根目录
	   System.out.println(file2);
   }
}
