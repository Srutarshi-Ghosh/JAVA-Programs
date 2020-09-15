package program;
import java.util.Scanner;
public class CIRCLE {

	public static void main(String[] args) {
		System.out.println("Enter radius");
		Scanner in = new Scanner(System.in);
		double area,radius;
		radius=in.nextInt();
		area= Math.PI*radius*radius;
		System.out.println("Area is"+area);
		

	}

}
