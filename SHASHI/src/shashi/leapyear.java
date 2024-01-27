package shashi;
import java.util.Scanner;

public class leapyear {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a year: ");
	        int year = scanner.nextInt();

	        boolean isLeapYear = checkLeapYear(year);
	        if (isLeapYear) {
	            System.out.println(year + " is a leap year.");
	        } else {
	            System.out.println(year + " is not a leap year.");
	        }
	    }

	    private static boolean checkLeapYear(int year) {
	   
	        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		}

	
}
