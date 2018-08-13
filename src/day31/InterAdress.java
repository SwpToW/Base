package day31;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * 网络地址类
 */
public class InterAdress {
     public static void main(String[] args) throws UnknownHostException {
		InetAddress id=InetAddress.getLocalHost();
		System.out.println(id.getHostName());//计算机名
		System.out.println(id.getHostAddress());//ip地址
		
		//获取其他计算机的inetAdress实例
		InetAddress lhy=InetAddress.getByName("222.247.32.126");
		System.out.println(lhy.getHostName());
	}
}
