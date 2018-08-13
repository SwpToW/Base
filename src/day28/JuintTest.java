package day28;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/*
 * 单元测试
 */
public class JuintTest {
    public static void main(String[] args) {
		System.out.println("helloworld");
	}
    @Test
    public void testJunit(){
    	System.out.println("hello Junit");
    }
    @Before
    public void testbefroe(){
    	System.out.println("before");
    }
    @After
    public void testafter(){
    	System.out.println("after");
    }
}
