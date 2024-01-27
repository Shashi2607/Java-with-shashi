package shashi;
import java.util.Scanner;

public class triangleisvalidornot {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the first angle: ");
	        int angle1 = scanner.nextInt();

	        System.out.print("Enter the second angle: ");
	        int angle2 = scanner.nextInt();

	        System.out.print("Enter the third angle: ");
	        int angle3 = scanner.nextInt();
	        boolean isValidTriangle = checkTriangleValidity(angle1, angle2, angle3);

	        if (isValidTriangle) {
	            System.out.println("The angles form a valid triangle.");
	        } else {
	            System.out.println("The angles do not form a valid triangle.");
	        }
	    }
	    private static boolean checkTriangleValidity(int angle1, int angle2, int angle3) {
	        return (angle1 + angle2 + angle3) == 180;

		}

	
}
