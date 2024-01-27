package shashi;
import java.util.Scanner;

public class RemoveAllVowels {
	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String inputString = scanner.nextLine();
	       
	        String result = removeVowels(inputString);
	        System.out.println("String without vowels: " + result);

	    }
	    private static String removeVowels(String inputString) {
	        StringBuilder result = new StringBuilder();

	        for (char ch : inputString.toCharArray()) {
	            
	            if ("AEIOUaeiou".indexOf(ch) == -1) {
	                result.append(ch);
	            }
	        }

	        return result.toString();

		}

	}



