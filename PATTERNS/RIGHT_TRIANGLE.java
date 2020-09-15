import java.util.*;

public class RIGHT_TRIANGLE {
	
	static Scanner s = new Scanner(System.in);
	public static void pyramid(int n) {
		int a=2*(n);
		for(int i=1; i<=n; i++) {
			for(int j=0; j<2*(n-i); j++) {
				System.out.print(" ");
			}
			a--;
			
			for(int k=0; k<i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("ENTER THE NUMBER");
		int n = s.nextInt();
		pyramid(n);
	}
}
