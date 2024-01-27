package shashi;
import java.util.Scanner;

public class ReverseAgivenNumber {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        int reversedNumber = reverseNumber(number);

	        System.out.println("Reversed Number: " + reversedNumber);
	    }
	    private static int reverseNumber(int number) {
	        int reversedNumber = 0;

	        while (number != 0) {
	            int digit = number % 10;
	            reversedNumber = reversedNumber * 10 + digit;
	            number /= 10;
	        }

	        return reversedNumber;
		}

	}




