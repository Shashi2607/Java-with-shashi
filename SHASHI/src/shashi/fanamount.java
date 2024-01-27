package shashi;
import java.util.Scanner;
public class fanamount {
	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the amount: ");
	        int amount = scanner.nextInt();
	        calculateAndPrintDenominations(amount);

	    }
	    private static void calculateAndPrintDenominations(int amount) {
	        int[] denominations = { 2000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };

	        System.out.println("Denominations for " + amount + " are:");

	        for (int denomination : denominations) {
	            if (amount >= denomination) {
	                int count = amount / denomination;
	                System.out.println(denomination + " : " + count);
	                amount %= denomination;
	            }
	        }
		}
}
