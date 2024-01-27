package shashi;
import java.util.Scanner;
public class corectornot {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter data: ");
	        String inputData = scanner.nextLine();
	        boolean isDataCorrect = checkData(inputData);

	        if (isDataCorrect) {
	            System.out.println("The entered data is correct.");
	        } else {
	            System.out.println("The entered data is not correct.");
	        }
	    }
	    private static boolean checkData(String data) {
	        
	        return data.length() >= 5;
		}

	}

