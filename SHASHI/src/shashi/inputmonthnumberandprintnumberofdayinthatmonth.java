package shashi;


	import java.util.Scanner;
	public class inputmonthnumberandprintnumberofdayinthatmonth {

		public static void main(String[] args) {
			 Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a month number (1-12): ");
		        int monthNumber = scanner.nextInt();
		        printDaysInMonth(monthNumber);

		    }
		    private static void printDaysInMonth(int monthNumber) {
		        int daysInMonth;

		        switch (monthNumber) {
		            case 1: 
		            case 3: 
		            case 5: 
		            case 7: 
		            case 8: 
		            case 10: 
		            case 12: 
		                daysInMonth = 31;
		                break;
		            case 4: 
		            case 6: 
		            case 9: 
		            case 11: 
		                daysInMonth = 30;
		                break;
		            case 2: 
		                daysInMonth = 28;
		                break;
		            default:
		                System.out.println("Invalid month number. Please enter a number between 1 and 12.");
		                return;
		        }

		        System.out.println("Number of days in the month: " + daysInMonth);	
		}

	}


