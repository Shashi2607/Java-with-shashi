package shashi;
import java.util.Scanner;

public class SubtreacttwoMatrices {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of rows for matrices: ");
	        int rows = scanner.nextInt();

	        System.out.print("Enter the number of columns for matrices: ");
	        int columns = scanner.nextInt();

	        int[][] matrix1 = new int[rows][columns];
	        System.out.println("Enter the elements of the first matrix:");

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                System.out.print("Enter element at position (" + i + ", " + j + "): ");
	                matrix1[i][j] = scanner.nextInt();
	            }
	        }
	        int[][] matrix2 = new int[rows][columns];
	        System.out.println("Enter the elements of the second matrix:");

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                System.out.print("Enter element at position (" + i + ", " + j + "): ");
	                matrix2[i][j] = scanner.nextInt();
	            }
	        }
	        int[][] differenceMatrix = subtractMatrices(matrix1, matrix2);
	        System.out.println("Difference of the matrices is:");

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                System.out.print(differenceMatrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	    private static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
	        int rows = matrix1.length;
	        int columns = matrix1[0].length;

	        int[][] differenceMatrix = new int[rows][columns];

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                differenceMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
	            }
	        }

	        return differenceMatrix;
		}

	
}
