package day21;
/*
 * �쳣�Ĵ���ʽ
 *   try....catch...finally
 *   try{
 *      ���ܳ����쳣�Ĵ���
 *   }catch(�쳣���� ����){
 *      �쳣�Ĵ���ʽ��
 *      дʲô����
 *   }finally{
 *      ����Ҫִ�еĴ���
 *   }
 *   
 *   �����ʽ�Ϳ����ó����Լ������쳣�������׸�JVM���³���ֹͣ����
 */
public class TryCacthTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr={1,2};
        try{
        int i=getArray(arr);
        System.out.println(i);
        }catch(IndexOutOfBoundsException ex){//��catch���л��ƣ�һ��catch����һ���쳣
        	//System.out.println(ex);
        	ex.printStackTrace();
        }catch(NullPointerException ex){
        	ex.printStackTrace();     //��catch���л��ƣ�һ��catch����һ���쳣
        }
        System.out.println("�������");
	}
	/*
	 * ����һ���������׳��쳣
	 */
	public static int getArray(int[] arr) throws NullPointerException,IndexOutOfBoundsException{
		if(arr==null){
			throw new NullPointerException("���鲻���ڣ���Ǹ");
		}
		if(arr.length<3){
			throw new IndexOutOfBoundsException("��Ǹ���������沢û��3����");
		}
		return arr[3]+1;
	}

}
