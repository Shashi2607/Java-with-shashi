package shashi;

	import java.util.Scanner;
	public class inputweeknumberandprintweekly {

		public static void main(String[] args) {
			 Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter a week number (1-7): ");
		        int weekNumber = scanner.nextInt();
		        printWeekday(weekNumber);
		    }
		    private static void printWeekday(int weekNumber) {
		        switch (weekNumber) {
		            case 1:
		                System.out.println("Monday");
		                break;
		            case 2:
		                System.out.println("Tuesday");
		                break;
		            case 3:
		                System.out.println("Wednesday");
		                break;
		            case 4:
		                System.out.println("Thursday");
		                break;
		            case 5:
		                System.out.println("Friday");
		                break;
		            case 6:
		                System.out.println("Saturday");
		                break;
		            case 7:
		                System.out.println("Sunday");
		                break;
		            default:
		                System.out.println("Invalid week number. Please enter a number between 1 and 7.");
		        }

		

	}

}
