import java.util.Scanner;

public class SUBSET_MAXSUM {
	static Scanner s = new Scanner(System.in);
	
	public static int findmaxsum(int arr[]) {
		int curr, global;
		curr = global = 0;
		
		for(int i=0; i<arr.length; i++) {
			curr = Math.max(arr[i], curr + arr[i]);		
				
		if(curr > global) 
			global = curr;
			
		
		}
		return global;
	}
	public static void main(String[] args) {
		System.out.println("ENTER THE NUMBER OF ELEMENTS YOU WANT TO ENTER");
		int no = s.nextInt();
		
		int arr[] = new int[no];
		System.out.println("ENTER THE ELEMENTS");
		for(int i=0; i<arr.length; i++) {
			arr[i] = s.nextInt();
		}
		
		int maxsum = findmaxsum(arr);
		System.out.println("THE MAXIMUM SUM OF SUBSET IN THE ARRAY IS " +maxsum);
	}

}
