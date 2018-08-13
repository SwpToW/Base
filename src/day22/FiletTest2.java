package day22;

import java.io.File;
import java.io.IOException;

/*
 * 文件类的创建和删除
 * 文件或者是目录
 */
public class FiletTest2 {
   public static void main(String[] args) throws IOException {
	function2();
}
   /*
    * boolean createNewfile() 创建文件
    * 创建的文件路径和文件名，在File构造方法中给出
    * 如果文件已经存在，不再创建
    * 
    * boolean mkdir() 创建文件夹
    * 创建的路径也在File构造器中给出
    * 
    * boolean mkdirs() 这可以创建多层文件夹    推荐使用mkdirs，因为mkdir有局限性
    */
   public static void function() throws IOException{
	   File file=new File("C:\\新建文件夹\\新建文件夹");
	   //boolean b=file.createNewFile();
	   boolean a=file.mkdir();
	   System.out.println(a);
   }
   /*
    * boolean delete() 删除的文件或者是文件夹路径在File、构造方法中给出
    * 如果文件处在打开状态，删除失败
    * 删除此抽象路径名表示的文件或目录。如果此路径名表示一个目录，则该目录必须为空才能删除。
    */
   public static void function2(){
	   File file=new File("C:\\新建文件夹\\新建文件夹");//注意：目录为空时才能删除
	   System.out.println(file.delete());  //删除方法不走回收站直接消失
   }
   
}
