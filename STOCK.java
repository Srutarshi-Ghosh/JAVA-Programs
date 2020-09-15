import java.util.Scanner;

public class STOCK {
	static Scanner s = new Scanner(System.in);
	
	public static void stock(int[] arr) {
		int buy, sell;
		
		buy = arr[0];
		sell = arr[arr.length-1];
		for(int i=1; i<arr.length; i++) {
			
			for(int j=arr.length-1; j>i; j--) {
				
				if(arr[j] - arr[i] > sell - buy) {
					buy = arr[i];
					sell = arr[j];
					
				}
			}			
		}
		System.out.println("YOU CAN BUY YOUR STOCK AT " +buy+ " BUCKS AND SELL YOUR STOCK AT " +sell+ " BUCKS.");
	}
	
	public static void main(String[] args) {
		
		System.out.println("ENTER THE NUMBER OF STOCK OPTIONS YOU WANT TO ENTER");
		int no = s.nextInt();
		
		int st[] = new int[no];
		System.out.println("ENTER STOCKS");
		
		for(int i=0; i<no; i++) {
			st[i] = s.nextInt();
		}
		
		stock(st);
	}

}
