package day21;
/*
 * �ؼ���Throw
 *   throw�ڷ����ڲ��׳��쳣
 *   thorw�������Ҫдnew�����Ķ���(������Expection�������������)
 *   
 *   �����������쳣�ؼ��֣�throws, �����˷������ܻ����쳣��������ߴ���
 *   ���������쳣������  
 *   
 *   ����ȥ������һ���׳����쳣�ķ����������߱���Ҫ���д����������ʧ��
 */
public class ExceptionTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        int[] arr=null;
        getArray(arr);
	}
	public static int getArray(int[] arr) throws Exception{
		//��Ҫ�Է���������һ���Ϸ��Ե��ж�
		if(arr==null){
			System.out.println("��Ǹ������Ϊ��");
			//�ֶ����쳣�Ķ���������ߵ����߲���������
			throw new Exception("��Ǹ����������鲻����");
		}
		//�ж������ǲ�����Ԫ��
		if(arr.length==0){
			throw new Exception("��Ǹ��������û�ж���");
		}
		int i=arr[arr.length-1];
		return i*2;
	}

}
