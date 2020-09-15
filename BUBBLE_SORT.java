import java.util.Scanner;
public class BUBBLE_SORT {
	
	public static int[] swap(int[] numbers, int i, int j) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
		return numbers;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x;
		System.out.println("ENTER NO OF ELEMENTS:");
		x=s.nextInt();
		System.out.println("ENTER ARRAY");
		int numbers[] = new int[x];
		for(int i=0;i<x;i++) {
			numbers[i]=s.nextInt();
		}
		System.out.println("THE ELEMENTS OF THE ARRAY ARE:");
		for(int i=0;i<x;i++) {
			System.out.println(numbers[i]);
		}
		for(int i=0;i<x;i++) {
			for(int j=0;j<x-1-i;j++) {
				if(numbers[j]>numbers[j+1]) {
					numbers=swap(numbers, j, j+1);
				}
			}
			System.out.println("ARRAY AFTER SORTING");
			for(int j=0;j<x;j++) {
				System.out.print(numbers[j]+" ");
			}
			System.out.println();
		}
	}

}
