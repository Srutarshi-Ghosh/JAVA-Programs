import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class RUNNING_MEDIAN {
	static Scanner s = new Scanner(System.in);
	
	public static float median(int[] arr , int k) {
		float mid = 0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		
		for(int i=0; i<k; i++) {
			al.add(arr[i]);
		}
		Collections.sort(al);
		
		if(k == 0) {
			mid = arr[0];
		}
		else if(k == 1) {
			mid = (arr[0] + arr[1])/2;
		}
		else if(al.size()%2 == 0)
			mid = (al.get(al.size()/2) + al.get((al.size()/2)-1))/2;
		
		else if(al.size()%2 == 1)
			mid = al.get((al.size()/2));
		
		return mid;
	}
	
	public static void main(String[] args) {
		int size;
		System.out.println("ENTER ARRAY SIZE");
		size = s.nextInt();
		
		int arr[] = new int[size];
		System.out.println("ENTER THE ELEMENTS OF THE ARRAY");
		for(int i=0; i<size; i++) {
			arr[i] = s.nextInt();
		}
		System.out.println("THE SYSTEM OF RUNNING MEDIAN IS");
		for(int k=0; k<arr.length; k++) {
			float num = median(arr , k);
			System.out.print(num+ " ");
		}
	}

}
