package shashi;
import java.util.Scanner;

public class gdctwono {
	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the first number: ");
	        int num1 = scanner.nextInt();

	        System.out.print("Enter the second number: ");
	        int num2 = scanner.nextInt();
	        int gcd = calculateGCD(num1, num2);
	        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);  
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
