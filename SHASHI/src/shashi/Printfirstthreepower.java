package shashi;
import java.util.Scanner;

public class Printfirstthreepower {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter an integer (N): ");
	        int N = scanner.nextInt();
	        printPowers(N);
	    }

	    private static void printPowers(int N) {
	        System.out.println("Powers of " + N + ":");
	        System.out.println("N^1: " + N);
	        System.out.println("N^2: " + (N * N));
	        System.out.println("N^3: " + (N * N * N));

		}

	
}
