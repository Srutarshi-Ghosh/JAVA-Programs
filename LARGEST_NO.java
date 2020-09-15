package program;
import java.util.Scanner;
public class LARGEST_NO {
	public static void main(String args[]) {
	int x,y,z;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the nos ");
	x=in.nextInt();
	y=in.nextInt();
	z=in.nextInt();
	if(x>y&&x>z)
		System.out.println("The largest no is "+x);
	if(y>x&&y>z)
			System.out.println("The largest no is "+y);
	if (x>x&&x>y)
			System.out.println("The largest no is "+z);
		
}
}
