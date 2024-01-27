package shashi;
import java.util.Scanner;

public class SimpleIntrest {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter principal amount: ");
	        double principal = scanner.nextDouble();

	        System.out.print("Enter rate of interest (in percentage): ");
	        double rateOfInterest = scanner.nextDouble();

	        System.out.print("Enter time period (in years): ");
	        double time = scanner.nextDouble();

	        double simpleInterest = calculateSimpleInterest(principal, rateOfInterest, time);

	        System.out.println("Simple Interest: " + simpleInterest);
	        scanner.close();
	    }
	    private static double calculateSimpleInterest(double principal, double rateOfInterest, double time) {
	        return (principal * rateOfInterest * time) / 100;	

		}

	
}
