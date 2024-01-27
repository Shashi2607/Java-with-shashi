package shashi;
import java.util.Scanner;

public class MultiplyTwoMatrices {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of rows for the first matrix: ");
	        int rows1 = scanner.nextInt();

	        System.out.print("Enter the number of columns for the first matrix: ");
	        int columns1 = scanner.nextInt();

	        int[][] matrix1 = new int[rows1][columns1];
	        System.out.println("Enter the elements of the first matrix:");

	        for (int i = 0; i < rows1; i++) {
	            for (int j = 0; j < columns1; j++) {
	                System.out.print("Enter element at position (" + i + ", " + j + "): ");
	                matrix1[i][j] = scanner.nextInt();
	            }
	        }

	        System.out.print("Enter the number of columns for the second matrix: ");
	        int columns2 = scanner.nextInt();

	        int[][] matrix2 = new int[columns1][columns2];
	        System.out.println("Enter the elements of the second matrix:");

	        for (int i = 0; i < columns1; i++) {
	            for (int j = 0; j < columns2; j++) {
	                System.out.print("Enter element at position (" + i + ", " + j + "): ");
	                matrix2[i][j] = scanner.nextInt();
	            }
	        }

	        int[][] productMatrix = multiplyMatrices(matrix1, matrix2);
	        System.out.println("Product of the matrices is:");

	        for (int i = 0; i < rows1; i++) {
	            for (int j = 0; j < columns2; j++) {
	                System.out.print(productMatrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	 
	    private static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
	        int rows1 = matrix1.length;
	        int columns1 = matrix1[0].length;
	        int columns2 = matrix2[0].length;

	        int[][] productMatrix = new int[rows1][columns2];

	        for (int i = 0; i < rows1; i++) {
	            for (int j = 0; j < columns2; j++) {
	                for (int k = 0; k < columns1; k++) {
	                    productMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
	                }
	            }
	        }

	        return productMatrix;

		}

	
}
