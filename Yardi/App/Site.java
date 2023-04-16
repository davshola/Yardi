

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Site {

	
	public static void main(String[] args) {
		
		 InetAddress address = null;
		 String[] sites= {"www.google.com","www.amazon.com","www.facebook.com"};
		for(int i = 0; i< sites.length; i++) {
			
			try {
				address = InetAddress.getByName(sites[i]);
				System.out.println("IP address for " + sites[i] + " is " + address.getHostAddress());
				
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
