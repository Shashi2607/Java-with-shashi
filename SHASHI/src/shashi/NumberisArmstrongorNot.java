package shashi;
import java.util.Scanner;

public class NumberisArmstrongorNot {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        boolean isArmstrong = checkArmstrongNumber(number);

	        if (isArmstrong) {
	            System.out.println(number + " is an Armstrong number.");
	        } else {
	            System.out.println(number + " is not an Armstrong number.");
	        }

	    }

	    private static boolean checkArmstrongNumber(int number) {
	        int originalNumber = number;
	        int numDigits = String.valueOf(number).length();
	        int sum = 0;

	        while (number != 0) {
	            int digit = number % 10;
	            sum += Math.pow(digit, numDigits);
	            number /= 10;
	        }

	        return sum == originalNumber;
		}

	
}
