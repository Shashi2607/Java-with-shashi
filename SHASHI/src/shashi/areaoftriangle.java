package shashi;
import java.util.Scanner;
public class areaoftriangle {
		public static void main(String[] args) {
			float b,h,aot;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter The Value of Bridght");
			b=sc.nextInt();
			System.out.println("Enter The Value Of Height");
			h=sc.nextInt();
			aot=b*h/2;
			System.out.println("The Area Of Triangle is "+aot);


		}

	
}
