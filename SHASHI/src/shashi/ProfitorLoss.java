package shashi;
import java.util.Scanner;

public class ProfitorLoss {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the Cost Price (CP): ");
	        double costPrice = scanner.nextDouble();

	        System.out.print("Enter the Selling Price (SP): ");
	        double sellingPrice = scanner.nextDouble();

	        calculateAndPrintProfitLoss(costPrice, sellingPrice);
	    }

	    private static void calculateAndPrintProfitLoss(double costPrice, double sellingPrice) {
	     
	        double profitOrLoss = sellingPrice - costPrice;

	        if (profitOrLoss > 0) {
	            System.out.println("Profit Amount: " + profitOrLoss);
	            System.out.println("It's a Profit!");
	        } else if (profitOrLoss < 0) {
	            System.out.println("Loss Amount: " + Math.abs(profitOrLoss));
	            System.out.println("It's a Loss!");
	        } else {
	            System.out.println("No Profit, No Loss. Break-even!");
	        }

		}

	
}
