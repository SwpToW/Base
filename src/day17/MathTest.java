package day17;
/*
 * ��ѧ������Mathȫ�Ǿ�̬�������
 */
public class MathTest {
    public static void main(String[] args) {
		function();
	}
    /*
     * abs(��) ��ȡ��������ֵ   
     * double ceil(double d)���ش��ڻ��ߵ��ڲ���d����Сdouble��������
     * double floor(double d) ����С�ڵ��ڲ���d���������
     * double pow(a,b) ����a��b�η�
     * double sqrt(double d) ����d�Ŀ�����
     * double random() ���������0.0��1.0֮��
     * double round(double d)��ò�������������ֵȡ����
     */
    public static void function(){
    	double d=Math.ceil(5.1); //-11.5
    	System.out.println(d);  //����-11
    }
}
