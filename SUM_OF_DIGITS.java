package program;
import java.util.Scanner;
public class SUM_OF_DIGITS {
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("ENTER A NUMBER");
		int n,rem=0,sum=0;
		n=s.nextInt();
		
		while(n>0) 
		{
		rem=n%10;
		sum=sum+rem;
		n=n/10;
		}
		System.out.println("SUM OF THE DIGITS IS "+sum);

}
}