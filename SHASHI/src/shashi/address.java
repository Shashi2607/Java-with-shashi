package shashi;
import java.util.Random;
public class address {
		public static void main(String[] args) {
			String ipAddress = generateIPAddress();
	        System.out.println("Random IP Address: " + ipAddress);
	    }
	    private static String generateIPAddress() {
	        Random rand = new Random();
	        StringBuilder ipAddress = new StringBuilder();

	        for (int i = 0; i < 4; i++) {
	            ipAddress.append(rand.nextInt(256)); // Each octet can have values from 0 to 255

	            if (i < 3) {
	                ipAddress.append(".");
	            }
	        }

	        return ipAddress.toString();
		}

	}


