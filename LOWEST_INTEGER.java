import java.util.Scanner;
public class LOWEST_INTEGER {
	static Scanner s = new Scanner(System.in);
	
	public static int[] positive(int arr[]) {
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>0)
				count++;
		}
		int positive[] = new int[count];
		int j=0;
		for(int i=0; i<positive.length; i++) {
			if(arr[i]<0)
				continue;
				positive[j] = arr[i];
			j++;
		}
		return positive;
	}
	public static int integer(int arr[]) {
		arr = positive(arr);
		int num = arr[0];
		for(int i=0; i<arr.length; i++ ) {
			if(num>arr[i] && arr[i]>0)
				num = arr[i];
		}
		for(int i=0; i<arr.length; i++) {
			if(num==arr[i])
				num++;
		}
		return num;
	}
	public static void main(String[] args) {
		System.out.println("ENTER THE SIZE OF ARRAY");
		int size;
		size = s.nextInt();
		int array[] = new int[size];
		System.out.println("ENTER THE ELEMENTS OF ARRAY");
		for(int i=0; i<size; i++) {
			array[i] = s.nextInt();
		}
			int x = integer(array);
			System.out.println("THE MISSING POSITIVE INTEGER IS " +x);
		}
	}

