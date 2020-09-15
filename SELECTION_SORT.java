import java.util.Scanner;

public class SELECTION_SORT {
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

	public static void main(String[] args) {
		
		int n;
		System.out.println("ENTER NO OF ELEMENTS TO BE INSERTED:");
		n=s.nextInt();
		int arr[] = new int[n];
		System.out.println("ENTER THE ELEMENTS TO BE INSERTED:");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("THE ELEMENTS OF THE ARRAY ARE:");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		sort(arr);
		System.out.println("ELEMENTS AFTER SORTING:");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}

}
