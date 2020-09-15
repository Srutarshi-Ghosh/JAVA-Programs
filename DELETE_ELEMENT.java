import java.util.Scanner;
public class DELETE_ELEMENT {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x;
		System.out.println("ENTER NO OF ELEMENTS IN ARRAY");
		x = s.nextInt();
		int arr[] = new int[x];
		System.out.println("ENTER ARRAY ");
		for(int i=0;i<x;i++) 
		{
			arr[i] = s.nextInt();
		}
		System.out.println("THE ARRAY IS");
		for(int i=0;i<x;i++) {
		System.out.print(arr[i]+" ");
		}
		System.out.println();
		int del;
		System.out.println("ENTER THE ELEMENT YOU WANT TO DELETE");
		del = s.nextInt();
		System.out.println("THE ARRAY AFTER DELETING IS");
		for(int i=0;i<x;i++) {
			if(arr[i]==del)
				continue;
			System.out.print(arr[i]+" ");
		}
			
	}

}
