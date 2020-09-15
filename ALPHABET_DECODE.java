import java.util.Scanner;
public class ALPHABET_DECODE {
	static Scanner s = new Scanner(System.in);
	
	public static int decode(int arr[], int k, int memo[]) {
		if(k==0)
			return 1;
		
		int s = arr.length - k;
		if(arr[s]==0)
			return 0;
	
		if(memo[k]!=0)
			return memo[k];
		
		int result = decode(arr, k-1, memo);
				if(k>=2 && arr[s]*10+arr[s+1]<=26)
					result += decode(arr, k-2, memo);
					memo[k] = result;
		return result;
	}
	
	public static int num_ways(int data[]) {
		int memo[] = new int[data.length+1];
		return decode(data, data.length, memo);
	}
	public static int[] convert(int no) {
		int number = no;
		int dig=0;
		while(no>0) {
			no = no/10;
			dig++;
		}
		int digits[] = new int[dig];
		for(int i=digits.length-1; i>=0; i--) {
			digits[i] = number%10;
			number = number/10;
		}
		return digits;
	}
	public static void main(String[] args) {
		int no; 
		System.out.println("ENTER THE NUMBER");
		no = s.nextInt();
		int arr[] = convert(no);
		for(int i=0; i<arr.length; i++ ) {
			System.out.println(arr[i]);
		}
		int x = num_ways(arr);
		System.out.println("THE NUMBER OF WAYS IT CAN BE DECODED IS: " +x);
	}

}
