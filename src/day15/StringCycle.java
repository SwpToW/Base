package day15;

public class StringCycle {
    public static void Cycle(String str){
    	char[] st=str.toCharArray();
    	int min=0;
    	int max=str.length()-1;
    	while(min!=max&&min<max){
    		if(st[min]==st[max]){
    			System.out.println("第"+(min+1)+"次比较相等");
    			min++;
    			max--;
    		}else{
    			System.out.println(str+"是不对称的");
    			return;
    		}
    	}
    	System.out.println(str+"是对称的");
    }
	public static void main(String[] args) {
		String[] s={"010","3223","666","7890987","123123"};
        for(int i=0;i<s.length;i++){
        	StringCycle.Cycle(s[i]);
        }
        
	}

}
