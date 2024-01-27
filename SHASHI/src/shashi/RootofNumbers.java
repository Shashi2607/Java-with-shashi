package shashi;
import java.util.Scanner;

public class RootofNumbers {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        int genericRoot = findGenericRoot(number); 
	        System.out.println("The generic root of " + number + " is: " + genericRoot);
	    }
	    private static int findGenericRoot(int number) {
	        while (number >= 10) {
	            int sum = 0;
	            while (number > 0) {
	                sum += number % 10;
	                number /= 10;
	            }
	            number = sum;
	        }
	        return number;

		}

	
}
