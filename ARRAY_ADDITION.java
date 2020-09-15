import java.util.Scanner;
public class ARRAY_ADDITION {
	static Scanner s = new Scanner(System.in);
	
	public static boolean sum_array(int n, int arr[]) {
		int x;
		for(int i=0; i<arr.length;i++) {
			x=n-arr[i];
			for(int j=1; j<arr.length;j++) {
				if(arr[j]==x) {
					return true;		
				}		
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int k,size;
		System.out.println("ENTER THE VALUE TO BE ADDED");
		k = s.nextInt();
		System.out.println("ENTER THE SIZE OF ARRAY");
		size = s.nextInt();
		int array[] = new int[size];
		System.out.println("ENTER THE ARRAY");
		for(int i=0; i<size;i++) {
			array[i] = s.nextInt();
		}
		boolean x;
		x = sum_array(k, array);
		if(x==true) {
			System.out.println("THE ELEMENTS HAVE THE SUM");
		}
		else
			System.out.println("THE ELEMENTS DO NOT HAVE THE SUM");
	}

}
