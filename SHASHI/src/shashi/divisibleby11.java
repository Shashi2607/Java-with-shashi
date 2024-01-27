package shashi;
import java.util.Scanner;

public class divisibleby11 {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);  
	        System.out.print("Enter a number: ");
	        String numberStr = scanner.nextLine();
	        boolean isDivisibleBy11 = checkDivisibilityBy11(numberStr);

	        if (isDivisibleBy11) {
	            System.out.println(numberStr + " is divisible by 11 using Vedic Math.");
	        } else {
	            System.out.println(numberStr + " is not divisible by 11 using Vedic Math.");
	        }
	    }
	    private static boolean checkDivisibilityBy11(String numberStr) {
	        int evenSum = 0;
	        int oddSum = 0;

	        for (int i = 0; i < numberStr.length(); i++) {
	            int digit = Character.getNumericValue(numberStr.charAt(i));

	            if (i % 2 == 0) {
	                evenSum += digit;
	            } else {
	                oddSum += digit;
	            }
	        }

	        int result = Math.abs(evenSum - oddSum);

	        return result % 11 == 0;

		}

	}

