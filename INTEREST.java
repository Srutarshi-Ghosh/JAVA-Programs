package program;
import java.util.Scanner;
public class INTEREST {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter ammt ");
		int total,time;
		float ammt,perc;
		ammt=in.nextFloat();
		System.out.println("Enter percentage ");
		perc=in.nextFloat();
		System.out.println("Enter time ");
		time=in.nextInt();
		ammt=ammt+(ammt*time*perc/100);
		System.out.println("Total ammt is "+ammt);
	}

}
