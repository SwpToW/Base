package day21;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TryThrowTest {
  public static void main(String[] args)  {  //不建议一直抛异常，这样程序会停止
	//function();
}
  public static void function() throws ParseException{
	  SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
	  Date date=sdf.parse("2017-8-7");
  }
}
