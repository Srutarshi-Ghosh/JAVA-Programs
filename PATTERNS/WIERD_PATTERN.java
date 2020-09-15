import java.util.*;

public class WIERD_PATTERN {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void wierd(int n) {

		int k = n*2+n/2;
		n--;
		for(int i=0; i<n; i++) {
			for(int j=0; j<k-i; j++) {
				System.out.print(" ");
			}
			k--;
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=0; i<=n; i++) {
			System.out.print("* ");
		}
	}
	public static void main(String[] args) {
		System.out.println("ENTER THE NUMBER OF ROWS");
		int n = sc.nextInt();
		wierd(n);
	}

}
