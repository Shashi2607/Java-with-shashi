package shashi;
import java.util.Scanner;
public class areaofcircle {
	
	

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the radius of the circle: ");
	        double radius = scanner.nextDouble();

	        double area = calculateCircleArea(radius);
	        System.out.println("Area of the circle: " + area);
	    }
	    private static double calculateCircleArea(double radius) {
	        return Math.PI * Math.pow(radius, 2);
		}

	}

