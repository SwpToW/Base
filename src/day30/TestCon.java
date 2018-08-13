package day30;

import java.sql.Connection;

public class TestCon {
  public static void main(String[] args) {
	Connection con=C3P0Utils.getCon();
	System.out.println(con);
	C3P0Utils.close(con, null, null);
}
}
