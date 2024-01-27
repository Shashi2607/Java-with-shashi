package shashi;
import java.util.Scanner;

public class SumofNaturalNumbers {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the limit (n): ");
	        int limit = scanner.nextInt();

	        int sum = calculateSum(limit);

	        System.out.println("Sum of natural numbers from 1 to " + limit + " is: " + sum);
	    }

	    private static int calculateSum(int limit) {
	        return (limit * (limit + 1)) / 2;


		}

	
}
