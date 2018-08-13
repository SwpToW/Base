package day21;

public class FinallyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         try{
        	 function(1);
        	 }catch( Exception E){
        		 E.printStackTrace();
        }finally{    //除了在catch代码块里面System.exit 停止虚拟机，否则finally代码块一定会执行
        	 System.out.println("代码必须执行"); //finally可以释放资源
         }
         
	}
	public static void function(int a) throws Exception{
		if(a==0){
			throw new Exception();
		}
	}

}
