package day16;

public class StringBufferTest {
     public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
	    sb.append("abcde").append("fgh");//append�������ص���StringBuffer�� 
	    
	    sb.delete(0, 3);  //����ͷ������β������ɾ��0 1 2
	    System.out.println(sb);
	    System.out.println(sb.insert(0, "abc"));//ָ��λ�ò����κ��ֶΣ��ֶβ��뵽�ƶ�����λ�ã�ԭλ�������ֶ��Զ�����
	    System.out.println(sb.replace(0, 4, "fuck"));//ָ�������滻�ƶ��ַ���
	    System.out.println(sb.reverse());//��ת�ַ���
	    String str=sb.toString(); //������������ַ����String����ַ������ӿɱ��ַ��������������ɲ��ɱ��String���Ͷ���
	}
     
}
