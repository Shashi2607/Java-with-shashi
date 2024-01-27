package shashi;
import java.util.Scanner;

public class MultiplicationTable {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number for the multiplication table: ");
	        int number = scanner.nextInt();

	        printMultiplicationTable(number);
	    }

	    private static void printMultiplicationTable(int number) {
	        System.out.println("Multiplication table for " + number + ":");

	        for (int i = 1; i <= 10; i++) {
	            System.out.println(number + " x " + i + " = " + (number * i));
	        }
		}

	

}
