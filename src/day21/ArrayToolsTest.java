package day21;

public class ArrayToolsTest {
  public static void main(String[] args) {
	int[] arr={1,2,3,4};
	int i=getArray(arr);  //�쳣�׵�main����,main��������û�д����쳣�ĳ������û���ҵ����׸�JVM
	 //JVM �������£����쳣��ӡ������̨������������
	System.out.println(i);
}
  public static int getArray(int[] arr){
	  int i=arr[3];  //���������Խ���쳣���ֻ��������쳣���׳�����������г��򽫲��ᱻִ��
	  return i+1; //���ϣ������쳣�Ļ��׸�������main
  }
}
