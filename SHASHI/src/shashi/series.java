package shashi;
import java.util.Scanner;
public class series {
	
	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the limit for Fibonacci series: ");
	        int limit = scanner.nextInt();

	        displayFibonacciSeries(limit);
	    }
	    private static void displayFibonacciSeries(int limit) {
	        int firstTerm = 0, secondTerm = 1;

	        System.out.println("Fibonacci series up to " + limit + " terms:");

	        for (int i = 1; i <= limit; ++i) {
	            System.out.print(firstTerm + " ");

	            int nextTerm = firstTerm + secondTerm;
	            firstTerm = secondTerm;
	            secondTerm = nextTerm;
	        }

		}

	
}
