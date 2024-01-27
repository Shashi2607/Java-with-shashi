package shashi;
import java.util.Scanner;

public class SortingArrayAscendingandDescendingOrder {

		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();

	        System.out.println("Enter the array elements:");

	        int[] array = new int[size];

	        for (int i = 0; i < size; i++) {
	            System.out.print("Enter element at index " + i + ": ");
	            array[i] = scanner.nextInt();
	        }
	        sortAndPrintAscending(array);
	        sortAndPrintDescending(array);
	    }
	    private static void sortAndPrintAscending(int[] array) {
	        int n = array.length;
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (array[j] > array[j + 1]) {
	               
	                    int temp = array[j];
	                    array[j] = array[j + 1];
	                    array[j + 1] = temp;
	                }
	            }
	        }
	        System.out.println("Sorted Array (Ascending):");
	        for (int i = 0; i < n; i++) {
	            System.out.print(array[i] + " ");
	        }
	        System.out.println();
	    }
	    private static void sortAndPrintDescending(int[] array) {
	        int n = array.length;
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (array[j] < array[j + 1]) {
	             
	                    int temp = array[j];
	                    array[j] = array[j + 1];
	                    array[j + 1] = temp;
	                }
	            }
	        }
	        System.out.println("Sorted Array (Descending):");
	        for (int i = 0; i < n; i++) {
	            System.out.print(array[i] + " ");
	        }
	        System.out.println();


		}

	
}
