package day20;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
public class NumPlusExercise
{
//ͳ��һ���ַ�������Ӧ�ַ����ֵĴ���
  public static void main(String[] args)
  {
    //
    System.out.println("���Խ����");
    String s = "aagfagdlkerjgavpofjmvglk";
    //�����Զ��巽���� ͳ����Ӧ�ַ����ֵĴ���
    method(s);
  }
  private static void method(String s)
  {
    //���� һ������
    TreeMap<Character,Integer> tm = new TreeMap<Character,Integer>();
    //����TreeMap�е�keyȫ��ȡ������Ȼ�󴢴浽set������ȥ
    Set<Character> st = tm.keySet();
    //������Ҫͳ�Ƶ��ַ���ת����һ���ַ�����
    char[] c = s.toCharArray();
    //ͨ��forѭ����һͳ��ÿ���ַ����ֵĴ���
    for(int x=0;x<c.length;x++)
    {
      if(!st.contains(c[x]))
      {
        tm.put(c[x], 1);
      }
      else
      {
        tm.put(c[x], tm.get(c[x])+1);
      }
    }
    //�����Զ��巽���ڿ���̨�����ͳ����Ϣ
    printMapDemo(tm);
  }
  private static void printMapDemo(TreeMap<Character, Integer> tm) {
    // TODO Auto-generated method stub
    Set<Character> st = tm.keySet();
    Iterator<Character> ti = st.iterator();
    for(;ti.hasNext();)
    {
      char key = ti.next();
      System.out.println(key+"("+tm.get(key)+")");
    }
  }
}
