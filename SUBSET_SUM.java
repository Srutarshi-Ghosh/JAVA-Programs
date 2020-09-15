import java.util.Scanner;

public class SUBSET_SUM {
	static Scanner s = new Scanner(System.in);
	
	 static int Subsets(int set[], int no)
	    {
	        int n = set.length;
	 	    int count = 0; 
	        for (int i=0; i<(1<<n); i++)
	        {    
	        	int num=0; 
	        	
	            for (int j=0; j<n; j++)
	            { 
	            	if ((i & (1 << j)) > 0) {
	                  num += set[j]; 
	           	}
	            }
	            if(num==no)
	                count++;        
	         }
	        return count;
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
		System.out.println("ENTER THE NUMBER");
		int no = s.nextInt();
		int number;
		System.out.println("ENTER THE SET");
		number = s.nextInt();
		int digits[] = convert(number);
	    int x = Subsets(digits, no);
	    System.out.println("THE NUMBER OF SUBSETS WHOSE SUM IS EQUAL TO " +no+ " IS " +x);
	}

}
