package day21;

public class FinallyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         try{
        	 function(1);
        	 }catch( Exception E){
        		 E.printStackTrace();
        }finally{    //������catch���������System.exit ֹͣ�����������finally�����һ����ִ��
        	 System.out.println("�������ִ��"); //finally�����ͷ���Դ
         }
         
	}
	public static void function(int a) throws Exception{
		if(a==0){
			throw new Exception();
		}
	}

}
