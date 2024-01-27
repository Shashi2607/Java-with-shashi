package shashi;
import java.util.Scanner;

public class PersonsnameAbbreviated {

		public static void main(String[] args) {
			 Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter your full name: ");
		        String fullName = scanner.nextLine();
		        String abbreviation = getAbbreviation(fullName);

		        System.out.println("Abbreviated Name: " + abbreviation);
		    }
		    private static String getAbbreviation(String fullName) {
		        StringBuilder abbreviation = new StringBuilder();
		        String[] words = fullName.split("\\s+");

		        for (String word : words) {
		            if (!word.isEmpty()) {
		                abbreviation.append(word.charAt(0));
		            }
		        }

		        return abbreviation.toString().toUpperCase();

		}

	
}
