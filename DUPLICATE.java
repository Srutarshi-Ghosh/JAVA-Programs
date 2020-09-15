package program;
import java.util.Scanner;

public class DUPLICATE {
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("ENTER THE NUMBER OF ELEMENTS YOU WANT TO ENTER");
		int x;
		x = s.nextInt();
		int arr[] = new int[x];
		System.out.println("ENTER THE NUMBERS");
		for(int i=0;i<x;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("THE DUPLICATE NUMBERS ARE");
		for(int i=0;i<x;i++) {
			for(int j=x-1;j>i;j--) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[j]+ " ");
				}
			}
		}
	}

}
