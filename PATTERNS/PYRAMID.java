import java.io.*;
import java.util.*;

public class PYRAMID {
	static Scanner s = new Scanner(System.in);
	public static void pyramid(int n) {
		int k = n;
		for(int i=0; i<n; i++) {
			for(int j=0; j<k; j++) {
				System.out.print(" ");
			}
			k--;
			for(int j=0; j<=i; j++) {
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
