package shashi;
import java.util.Scanner;
public class factrialno {
	

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        long factorial = calculateFactorial(number);

	        System.out.println("Factorial of " + number + " is: " + factorial);
	    }
	    private static long calculateFactorial(int number) {
	      
	        if (number == 0 || number == 1) {
	   
	return 1;
	        }
	        long result = 1;
	        for (int i = 2; i <= number; i++) {
	            result *= i;
	        }

	        return result;

		}

	}


