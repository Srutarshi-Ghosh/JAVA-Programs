package program;
import java.util.Scanner;

class ADDITION {
public static Scanner in;

public static void main(String args[]) {
	int x,y,z ;
	System.out.println("Enter numbers");
	in = new Scanner(System.in);
	x=in.nextInt();
	y=in.nextInt();
	z=x+y;
	System.out.println("Sum="+z);
}
}
