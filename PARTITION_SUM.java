import java.util.Scanner;

public class PARTITION_SUM {
	static Scanner s = new Scanner(System.in);
	
	public static boolean subsetsum(int[] arr, int sum, int n) {
		if(sum == 0)
			return true;
		if(n==0 && sum!=0)
			return false;
		
		if(arr[n-1]>sum)
			return subsetsum(arr, sum, n-1);
		 
		return subsetsum(arr, sum, n-1) || subsetsum(arr, sum-arr[n-1], n-1);
	}
	
	public static boolean findpartition(int[] arr, int n) {
		int sum = 0;
		for(int i=0; i<n; i++) 
		sum += arr[i];
		
		if(sum%2 != 0)
			return false;
		
		return subsetsum(arr, sum/2, n);
					 
	}
	public static void main(String[] args) {
		
		System.out.println("ENTER  ARRAY SIZE");
		int n = s.nextInt();
		
		int[] arr = new int[n];
		System.out.println("ENTER THE ELEMENTS OF THE ARRAY");
		for(int i=0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		
		if(findpartition(arr, n) == true) {
			System.out.println("CAN BE PARTITIONED");
		}
			if(findpartition(arr, n) == false) {
				System.out.println("CANNOT BE PARTITIONED");
		}
	}

}
