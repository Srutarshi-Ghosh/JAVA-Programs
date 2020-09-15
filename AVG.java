import java.util.Scanner;
public class AVG {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x;
		System.out.println("ENTER THE LENGTH OF ARRAY:");
		x=s.nextInt();
		int NUMBERS[] = new int[x];
		System.out.println("ENTER THE NUMBERS:");
		for(int i=0;i<x;i++) {
			NUMBERS[i]=s.nextInt();
		}
		System.out.println("THE NUMBERS ARE:");
		for(int i=0;i<x;i++) {
			System.out.print(NUMBERS[i]+" ");
		}System.out.println();
		int sum=0;
		for(int i=0;i<x;i++) {
			 sum+=NUMBERS[i];
		}
		double avg=sum/x;
		System.out.println("THE AVERAGE OF THE NUMBERS IS: "+avg);
	}

}
