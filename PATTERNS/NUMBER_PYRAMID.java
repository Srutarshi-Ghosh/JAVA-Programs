import java.util.*;

public class NUMBER_PYRAMID {
	static Scanner sc = new Scanner(System.in);
	
	public static void no_pyramid(int n) {
		int no=1;
		for(int i=1; i<=n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(no+" ");
				no--;
			}
			System.out.println();
			no=i+1;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("ENTER THE NUMBER OF ROWS");
		int n = sc.nextInt();
		no_pyramid(n);
	}

}
