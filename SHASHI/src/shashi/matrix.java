package shashi;
import java.util.Scanner;
public class matrix {
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
	        int[][] sumMatrix = addMatrices(matrix1, matrix2);
	        System.out.println("Sum of the matrices is:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                System.out.print(sumMatrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
	        int rows = matrix1.length;
	        int columns = matrix1[0].length;
	        int[][] sumMatrix = new int[rows][columns];
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
	            }
	        }
	        return sumMatrix;
		}
	}

