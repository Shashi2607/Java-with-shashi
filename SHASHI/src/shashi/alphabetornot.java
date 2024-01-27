package shashi;
import java.util.Scanner;
public class alphabetornot {
		public static void main(String[] args) {
				char ch;
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter The character");
				ch=sc.next().charAt(0);
				if( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
		            System.out.println(ch + " is an alphabet.");
		        else
		            System.out.println(ch + " is not an alphabet.");
		}
	}

