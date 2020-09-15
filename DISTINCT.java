package program;
import java.util.Scanner;
import java.util.ArrayList;

public class DISTINCT {
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {

			System.out.println("ENTER THE NUMBER OF ELEMENTS YOU WANT TO ENTER");
			int x;
			x = s.nextInt();
			int arr[] = new int[x];
			System.out.println("ENTER THE NUMBERS");
			for(int i=0; i<x; i++) {
				arr[i]=s.nextInt();
			}
			System.out.println("THE DISTINCT NUMBERS ARE");
			ArrayList<Integer> al = new ArrayList<Integer>(); 
			for(int i=0; i<arr.length; i++) {
				if(!al.contains(arr[i]))
				al.add(arr[i]);
			}
			for(int i=0; i<al.size(); i++) {
				System.out.print(al.get(i)+ " ");
			}
		}

	

	}


