package day21;

public class Exception2Test {
  /*
   * ���ݳɼ�������ɼ�ƽ����
   */
	public static void main(String[] args) {
		int result=0;
		
			result = getAvg(50,60,-70,80);
		
		//����ɼ������Ǹ����أ� �Ǿ�Ҫ�Զ����쳣��FUSHUException
		System.out.println(result);
	}
	public static int getAvg(int...source){
		int sum=0;
		for(int i:source){
			if(i<0){
				throw new FUSHUException("�ɼ�"+i);
			}
			sum=sum+i;
		}
		return sum/source.length;
	}
}
