package day21;
/*
 * Throwable��һЩ����
 * String getMessage() ���쳣��Ϣ����ϸ����
 * String toString ()
 * void printStackTrace()���쳣��Ϣ׷�ٵ���׼�Ĵ��������쳣��Ϣ��ȫ
 */
public class ThrowableFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         try {
			function();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	public static void function() throws Exception {
		throw new Exception("�����쳣");
	}

}
