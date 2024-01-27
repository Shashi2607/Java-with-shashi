package shashi;
import java.util.Scanner;
public class lcmno {
	
	

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the first number: ");
	        int num1 = scanner.nextInt();

	        System.out.print("Enter the second number: ");
	        int num2 = scanner.nextInt();
	        int lcm = calculateLCM(num1, num2);

	        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
	    }
	    private static int calculateLCM(int num1, int num2) {
	        
	        int gcd = calculateGCD(num1, num2);
	        return (num1 * num2) / gcd;
	    }

	    private static int calculateGCD(int a, int b) {
	        while (b != 0) {
	            int temp = b;
	            b = a % b;
	            a = temp;
	        }
	        return a;

		}

	

}
