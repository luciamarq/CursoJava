package comunicaciones;

import java.net.InetAddress;

public class PrInetAdress {

	public static void main(String[] args) {
		try {
			InetAddress ip = InetAddress.getByName("recursosformacion.com");
			InetAddress miIp = InetAddress.getLocalHost();
			
			System.out.println("Host Name : " + ip.getHostName());
			System.out.println("Ip Adress: " + ip.getHostAddress());
			
			
			System.out.println("Host Name Local: " + miIp.getHostName());
			System.out.println("Host Name Local: " + miIp.getHostAddress());
			
		}catch (Exception e) {
			System.out.println(e);
		}

	}

}
