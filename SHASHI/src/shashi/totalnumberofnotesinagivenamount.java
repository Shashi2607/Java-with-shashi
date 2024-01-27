package shashi;
import java.util.Scanner;

public class totalnumberofnotesinagivenamount {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the amount: ");
	        int amount = scanner.nextInt();

	        countNotes(amount);
	    }
	    private static void countNotes(int amount) {
	        int[] denominations = { 2000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };

	        System.out.println("Notes count for " + amount + " is:");

	        for (int denomination : denominations) {
	            if (amount >= denomination) {
	                int notesCount = amount / denomination;
	                System.out.println(denomination + " : " + notesCount);
	                amount = amount % denomination;
	            }
	        }
		}

	
}
