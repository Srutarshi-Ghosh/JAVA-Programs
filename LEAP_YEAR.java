package program;
import java.util.Scanner;
public class LEAP_YEAR {

	public static void main(String[] args) {
		int year;
		System.out.println("Enter Year:");
		Scanner in = new Scanner(System.in);
		year=in.nextInt();
		if((year%400==0)||((year%4==0)||(year%100!=0)))
		System.out.println("Leap Year");
		else {
			System.out.println("Not a Leap Year");
		
		}

	

}
}