package day21;
/*
 * �쳣�б����쳣������ʱ�쳣
 * �����쳣:�������׳��쳣�ķ��������������ʧ��
 * 
 * �����쳣���׳����쳣RunTimeException�ֻ���������
 * �����쳣���ص�
 *  �����ڲ��׳����������쳣��new XXXException
 *  �����������ϲ���Ҫthrows�����Լ����ܲ����쳣
 *  ���ԭ��:
 *    ��Ϊ�����쳣�����ܷ��������������������Ҫ����Աֹͣ�����޸�Դ����
 *    һ����������Ҫ���������޸�Դ����
 */
public class RunTimeExceptionTest {
   public static void main(String[] args) {
	
  }
   public static void function(){
	   throw new RuntimeException();
   }
}
