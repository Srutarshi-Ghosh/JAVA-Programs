package program;
import java.util.Scanner;
public class PERCENTAGE {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double x,y,perc;
		System.out.println("ENTER VALUE OF X");
		x = s.nextDouble();
		System.out.println("ENTER VALUE OF Y");
		y = s.nextDouble();
		System.out.println("CALCULATING PERCENTAGE "+x+"% of"+y+" IS");
		perc = x/y*100;
		System.out.println(perc+"%");
	}

}
