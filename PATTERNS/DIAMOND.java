import java.util.Scanner;

public class DIAMOND {
	
	static Scanner sc = new Scanner(System.in);
	public static void diamond(int n) {
		int a=n-2;
		for(int i=0; i<n; i+=2) {
			
			for(int j=0; j<a; j++) {
				System.out.print(" ");
			}
			a-=2;
			System.out.print("* ");
				for(int k=0; k<i; k++) {
					System.out.print("* ");
				}
			System.out.println();
		}
		
		a=2;
		for(int i=n-4; i>=0; i-=2) {
			
			for(int j=0; j<a; j++) {
				System.out.print(" ");
			}
			a+=2;
			System.out.print("* ");
			
				for(int k=0; k<i; k++) {
					System.out.print("* ");
				}
			System.out.println();
			
		}
	}

	public static void main(String[] args) {
		System.out.println("ENTER THE NUMBER OF ROWS");
		int n=sc.nextInt();
		diamond(n*2);

	}
}


