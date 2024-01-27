package shashi;
import java.util.Scanner;
public class assickivalue {
	
	

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
	        System.out.print("Enter a character: ");
	       
	        char inputChar = scanner.next().charAt(0);

	        int asciiValue = (int) inputChar;
	        System.out.println("The ASCII value of '" + inputChar + "' is: " + asciiValue);

		}
}
