import java.util.Scanner;
import java.util.ArrayList;

public class ARRAY_INTERSECTION {
	static Scanner s = new Scanner(System.in);
	
	public static void sort(int arr[]) {
		
		int N=arr.length;
		int pos,temp;
		for(int i=0;i<N;i++) {
			pos = i;
			for(int j=i+1;j<N;j++) {
				if(arr[j]<arr[pos]) {
					pos=j;
				}
			}
			temp=arr[i];
			arr[i]=arr[pos];
			arr[pos]=temp;
		}
		}
	
	public static ArrayList<Integer> intersection(int[] arr1, int[] arr2, int[] arr3){
		
		sort(arr1);
		sort(arr2);
		sort(arr3);
		ArrayList<Integer> al = new ArrayList<Integer>();
		int x=0, y=0, z=0;
		while (x>=arr1.length || y>=arr2.length || z>=arr3.length) {
			
			if(arr1[x]==arr2[y] && arr2[y]==arr3[z]) {
			al.add(arr1[x]);
			x++;
			y++;
			z++;
			}
			else if(arr1[x] < arr2[y])
				x++;
			
			else if(arr2[y] < arr3[z])
				y++;
			
			else
				z++;
		};
		return al;
	}
	
	public static void main(String[] args) {
		
		System.out.println("ENTER SIZE OF FIRST ARRAY");
		int s1 = s.nextInt(); 
		System.out.println("ENTER FIRST ARRAY");
		int[] arr1 = new int[s1];
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = s.nextInt();
		}
		
		System.out.println("ENTER SIZE OF SECOND ARRAY");
		int s2 = s.nextInt(); 
		System.out.println("ENTER SECOND ARRAY");
		int[] arr2 = new int[s2];
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = s.nextInt();
		}
		
		System.out.println("ENTER SIZE OF THIRD ARRAY");
		int s3 = s.nextInt(); 
		System.out.println("ENTER THIRD ARRAY");
		int[] arr3 = new int[s3];
		for(int i=0; i<arr3.length; i++) {
			arr3[i] = s.nextInt();
		}
		
		ArrayList<Integer> al = intersection(arr1, arr2, arr3);
		System.out.println("THE INTERSECTING ELEMENTS OF THE ARRAYS ARE");
		for(int i=0; i<al.size(); i++) {
			System.out.print(al.get(i)+ " ");
		}
	}

}
