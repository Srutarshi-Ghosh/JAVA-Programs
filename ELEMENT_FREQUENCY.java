import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class ELEMENT_FREQUENCY {
	static Scanner s = new Scanner(System.in);
	
	public static int[] frequency(int arr[], int k) {
		ArrayList<Integer> al = new ArrayList<Integer>(); 
		for(int i=0; i<arr.length; i++) {
			if(!al.contains(arr[i]))
			al.add(arr[i]);
		}
		ArrayList<Integer> freq = new ArrayList<Integer>(); 
		ArrayList<Integer> index = new ArrayList<Integer>(freq); 
		for(int i=0; i<al.size(); i++) {
			int num = 0;
			for(int j=0; j<arr.length; j++) {
				if(al.get(i)==arr[j])
					num++;
			}
			freq.add(num);
		}
		Collections.sort(freq, Collections.reverseOrder());
		int indices[] = new int[freq.size()];
		for(int i=0; i<indices.length; i++) {
			indices[i] = index.indexOf(freq.get(i));
		}
		int ans[] = new int[k];
		for(int i=0; i<k; i++) {
		ans[i] = al.get(i);
		}
		return ans;
	}
	public static void main(String[] args) {
		
		System.out.println("ENTER THE NUMBER OF ELEMENTS OF THE ARRAY");
		int no = s.nextInt();
		
		int arr[] = new int[no];
		System.out.println("ENTER THE ELEMENTS OF THE ARRAY");
		for(int i=0; i<arr.length; i++) {
			arr[i] = s.nextInt();
		}
		
		System.out.println("ENTER THE NUMBER OF FREQUENCIES YOU WANT TO FIND");
		int f = s.nextInt();
				
		System.out.println(f+ " ELEMENTS WITH HIGHEST FREQUENCIES ARE");
		int x[] = frequency(arr, f);
		for(int i=0; i<x.length; i++) {
		System.out.print(x[i]+ " ");
	}
	}
}
