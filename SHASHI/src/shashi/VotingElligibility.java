package shashi;
import java.util.Scanner;

public class VotingElligibility {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter your age: ");
	        int age = scanner.nextInt();
	        boolean isEligible = checkVotingEligibility(age);

	        if (isEligible) {
	            System.out.println("You are eligible to vote.");
	        } else {
	            System.out.println("You are not eligible to vote.");
	        }
	    }
	    private static boolean checkVotingEligibility(int age) {
	        return age >= 18;

		}

	
}
