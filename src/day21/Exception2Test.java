package day21;

public class Exception2Test {
  /*
   * 传递成绩，计算成绩平均数
   */
	public static void main(String[] args) {
		int result=0;
		
			result = getAvg(50,60,-70,80);
		
		//如果成绩传的是负数呢？ 那就要自定义异常类FUSHUException
		System.out.println(result);
	}
	public static int getAvg(int...source){
		int sum=0;
		for(int i:source){
			if(i<0){
				throw new FUSHUException("成绩"+i);
			}
			sum=sum+i;
		}
		return sum/source.length;
	}
}
