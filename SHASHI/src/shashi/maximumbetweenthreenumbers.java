package shashi;
import java.util.Scanner;

public class maximumbetweenthreenumbers {
	
		
		public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the first number: ");
	        int num1 = scanner.nextInt();

	        System.out.print("Enter the second number: ");
	        int num2 = scanner.nextInt();

	        System.out.print("Enter the third number: ");
	        int num3 = scanner.nextInt();
	        int maximum = findMaximum(num1, num2, num3);

	        System.out.println("The maximum among " + num1 + ", " + num2 + ", and " + num3 + " is: " + maximum);
	    }

	    private static int findMaximum(int num1, int num2, int num3) {
	        return Math.max(Math.max(num1, num2), num3);
	}
	
}
