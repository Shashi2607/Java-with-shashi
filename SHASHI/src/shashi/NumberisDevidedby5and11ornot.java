package shashi;
import java.util.Scanner;

public class NumberisDevidedby5and11ornot {

		public static void main(String[] args) {
			 Scanner scanner = new Scanner(System.in);
	 System.out.print("Enter a number: ");
		        int number = scanner.nextInt();

		        checkEvenOdd(number);
		    }

		    private static void checkEvenOdd(int number) {
		        if (number % 2 == 0) {
		            System.out.println("The number is even.");
		        } else {
		            System.out.println("The number is odd.");
		        }	

		}

	
}
