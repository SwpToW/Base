import java.util.Scanner;

public class Apple {
    /*
     * N堆苹果， 每堆
     */
	public static void main(String[] args) {
		long start=System.currentTimeMillis();
		function();
		long l=System.currentTimeMillis()-start;
		System.out.println(l);
		
	}
	public static void function(){

		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();//num 表示苹果堆数
		int[] sum=new int[num];//sum表示苹果数组集合
		for(int i=0;i<num;i++){
			sum[i]=sc.nextInt();
			//System.out.println(sum[i]);
		}
		int m=sc.nextInt();
		int[] ques=new int[m];
		for(int i=0;i<m;i++){
			ques[i]=sc.nextInt();
		}
	    int s=0;
		for(int i=0;i<m;i++){
			s=0;
			for(int j=0;j<num;j++){
				s=s+sum[j];
			    if(ques[i]<=s){	
			    	System.out.println(j+1);
			    	break;
			    }			
			}
		}
	}
	}

