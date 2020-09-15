import java.util.*;

public class ODD_PYRAMID {
	
	static Scanner sc = new Scanner(System.in);
	public static void odd_pyramid(int n) {
		int a=2*(n-1);
		for(int i=1; i<=n; i++) {
			
			for(int j=0; j<a; j++) {
				System.out.print(" ");
			}
			a-=2;
			for(int k=0; k<2*i-1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		System.out.println("ENTER THE NUMBER OF ROWS");
		int n=sc.nextInt();
		odd_pyramid(n);

	}

}
