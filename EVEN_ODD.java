package program;
import java.util.Scanner;
public class EVEN_ODD {

	public static void main(String args[]) {
	System.out.println("Enter no");
	Scanner in = new Scanner(System.in);
	int x;
	x=in.nextInt();
	if(x%2==0)
		System.out.println("NO IS EVEN");
	else{
		System.out.println("NO IS ODD");
	}
	}

}
