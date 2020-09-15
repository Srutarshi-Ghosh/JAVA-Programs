import java.util.*;
import java.io.*;

public class ARRAY_POS {
	
	static BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
	
	static int[] positionchange(int arr[]) {
		int pos[] = new int[arr.length];
		for(int i=1; i<=arr.length; i++) {
			pos[i-1] = arr[arr[i-1]-1];
		}
		return pos;
	}
	
	static ArrayList<int[]> permute(int arr[]){
		ArrayList<int[]> al = new ArrayList<int[]>();
		helper(0, arr, al);
		return al;
	}
	
	static void helper(int start, int arr[], ArrayList<int[]> al) {
		if(start==arr.length) {
			int temp[] = new int[arr.length];
			for(int i=0; i<arr.length; i++) {
				temp[i]=arr[i];
			}
			al.add(temp);
		}
		for(int i=start; i<arr.length; i++) {
			swap(arr, i, start);
			helper(start+1, arr, al);
			swap(arr, i, start);
		}
	}
	
	static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void main(String[] args) throws IOException{
		String str[] = br.readLine().split(" ");
		int arr[] = new int[str.length];
		for(int i=0; i<str.length; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		
		ArrayList<int[]> al = permute(arr);
		for(int i=0; i<al.size(); i++) {
			arr = positionchange(al.get(i));
			for(int j=0; j<arr.length; j++) {
				System.out.print(al.get(i)[j]+" ");
			}
			System.out.println();
			for(int j=0; j<arr.length; j++) {
				System.out.print(arr[j]+" ");
			}
			System.out.println();
			arr = positionchange(arr);
			for(int j=0; j<arr.length; j++) {
				System.out.print(arr[j]+" ");
			}
			System.out.println();
			System.out.println();
		}
		
	}

}
