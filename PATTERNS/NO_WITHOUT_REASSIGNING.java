import java.io.*;
import java.util.*;

public class NO_WITHOUT_REASSIGNING {
	static Scanner s = new Scanner(System.in);
	
	public static void pattern(int n) {
		int count = 1;
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(count+ " ");
				count++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		System.out.println("ENTER THE NUMBER OF ROWS OF THE PYRAMID");
		int n = s.nextInt();
		pattern(n);
	}

}
