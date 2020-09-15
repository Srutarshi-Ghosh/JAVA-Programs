import java.util.Scanner;

public class RIGHT_NO_TRIANGLE {
	
static Scanner sc = new Scanner(System.in);
	
	public static void no_pyramid(int n) {
		int no, k=2*(n-1);
		for(int i=1; i<=n; i++) {
			for(int j=0; j<k; j++) {
				System.out.print(" ");
			}
			k-=2;
			for(int x=i; x>0; x--) {
				System.out.print(x+" ");
			}
			System.out.println();
			
		}
	}

	public static void main(String[] args) {
		System.out.println("ENTER THE NUMBER OF ROWS");
		int n = sc.nextInt();
		no_pyramid(n);

	}

}
