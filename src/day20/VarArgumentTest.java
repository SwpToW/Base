package day20;
/*
 * JDK1.5�����ԣ������Ŀɱ����; �����Ͽɱ��������һ������
 * ǰ�᣺����������������ȷ�������Ǹ�����ȷ������������
 * ע�����
 * һ�������У��ɱ����ֻ����һ��
 * �ɱ����������д�ڲ����б�����һλ
 * public static int(int a,int b,int...c)
 * ��ǿ��Ŀɱ����(Object...i),�����Ϳ��Դ��������
 */
public class VarArgumentTest {
    /*
     * ����һ����������������������
     * ����һ����������������������
     * �������ö�ö�ö����������ô����
     */
	public static void main(String[] args) {
		System.out.println(getSumfinal(1,5,4,8));
	}
	
	public static int getSumfinal(int...a){//��ʽ����������...������   һ���������� �����Ͽɱ��������һ������
		int sum=0;
		for(int i:a){
			sum=sum+i;
		}
		return sum;
	}
}
