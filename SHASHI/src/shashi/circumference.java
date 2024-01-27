package shashi;
import java.util.Scanner;
public class circumference {
		public static void main(String[] args) {
			float r,aoc,coc;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter The Value of r = ");
			r=sc.nextFloat();
			aoc=r*r;
			coc=r;
			System.out.println("Area of Circle is ="+aoc*3.14);
			System.out.println("Circumference of Circle is ="+coc*2*3.14);


		}

	}


