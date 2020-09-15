import java.util.Scanner;

public class HOLLOW_DIAMOND {
	static Scanner sc = new Scanner(System.in);
	public static void odd_pyramid(int n) {
		int a=n-2;
		for(int i=0; i<n; i+=2) {
			
			for(int j=0; j<a; j++) {
				System.out.print(" ");
			}
			a-=2;
			System.out.print("* ");
			if(i!=0) {
				for(int k=0; k<i*2-2; k++) {
					System.out.print(" ");
				}
				System.out.print("*");
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
			if(i!=0) {	
				for(int k=0; k<i*2-2; k++) {
					System.out.print(" ");
				}
				System.out.print("* ");
			}
			System.out.println();
			
		}
	}

	public static void main(String[] args) {
		System.out.println("ENTER THE NUMBER OF ROWS");
		int a=sc.nextInt();
		odd_pyramid(2*a);
		int n=2*a-1;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(j+i==n/2 || i+j==n+a-2 || j==i+(n/2) || i==j+(n/2)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
	}
}
