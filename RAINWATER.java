import java.util.Scanner;

public class RAINWATER {
	static Scanner s = new Scanner(System.in);
	
	public static int water_trap(int[] arr) {
		int count = 0, wall;
		wall = Math.min(arr[0], arr[arr.length-1]);
		
		if(wall == arr[0]) {
			for(int i=1; i<arr.length-1; i++) {
				
				if(arr[i] > wall && arr[i] > arr[arr.length-1])
					wall = arr[arr.length-1];
				else if(arr[i] > wall)
					wall = arr[i];
				else
					count = wall - arr[i];
			}
		}
		
		if(wall == arr[arr.length-1]) {
			for(int i=arr.length-1; i>0; i--) {
				
				if(arr[i] > wall && arr[i] > arr[0])
					wall = arr[0];
				else if(arr[i] > wall)
					wall = arr[i];
				else
					count = wall - arr[i];
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println("ENTER THE NUMBER OF ELEMENTS");
		int no = s.nextInt();
		System.out.println("ENTER THE SERIES TO HOLD WATER");
		int arr[] = new int[no];
		for(int i=0; i<arr.length; i++) {
			arr[i] = s.nextInt();
		}
		int water = water_trap(arr);
		System.out.print("THE AMMOUNT OF WATER IT CAN HOLD IS " +water+ " UNITS");
	}

}
