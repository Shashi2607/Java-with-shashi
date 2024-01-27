package shashi;
import java.util.Scanner;

public class SalaryofEmploy {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter Basic Salary: ");
	        double basicSalary = scanner.nextDouble();

	        System.out.print("Enter House Rent Allowance (HRA) percentage: ");
	        double hraPercentage = scanner.nextDouble();

	        System.out.print("Enter Dearness Allowance (DA) percentage: ");
	        double daPercentage = scanner.nextDouble();
	    
	        double grossSalary = calculateGrossSalary(basicSalary, hraPercentage, daPercentage);
	       
	        System.out.println("Gross Salary: " + grossSalary);
	    }
	    private static double calculateGrossSalary(double basicSalary, double hraPercentage, double daPercentage) {
	      
	        double hra = (hraPercentage / 100) * basicSalary;
	        double da = (daPercentage / 100) * basicSalary;

	        return basicSalary + hra + da;	

		}

	
}
