import java.util.Scanner;

public class STAIRCASE {
	static Scanner s = new Scanner(System.in);
	
	public static int ways(int n, int steps[])
	{
		if(n==0)
			return 1;
		int num[] = new int[n+1];
		num[0]=1;
		
		for(int i=1; i<=n; i++) {
			int total=0;
			for(int j=0; j<steps.length; j++) {
				if(i-steps[j] >= 0) {
					total += num[i-steps[j]];
				}
			}
			num[i] = total;
				
			}
				return num[n];
		}
	
	public static void main(String[] args) {
		System.out.println("ENTER THE NUMBER OF STAIRS YOU WANT TO CLIMB");
		int n;
		n = s.nextInt();
		int steps[] = new int[3];
		System.out.println("ENTER THE STEPS YOU CAN CLIMB IN 1 TURN");
		for(int i=0;i<3;i++) {
			steps[i] = s.nextInt();
		}

		int x = ways(n, steps); 
		System.out.print("THE NUMBER OF WAYS TO CLIMB " +n+ " STAIRS IS " +x);
		
	}

}
