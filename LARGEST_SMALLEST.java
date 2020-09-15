import java.util.Scanner;
public class LARGEST_SMALLEST {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x;
		System.out.println("ENTER SIZE OF ARRAY:");
		x=in.nextInt();
		int no[]= new int[x];
		System.out.println("ENTER THE NUMBERS:");
		for(int i=0;i<x;i++) {
			no[i]=in.nextInt();
		}
		int largest=no[0];
		for(int i=0;i<x;i++) {
			if(no[i]>largest) {
				largest=no[i];
		}
		}
		int smallest=no[0];
		for(int j=1;j<x;j++) {
			if(no[j]<smallest)
			{
				smallest=no[j];
			}
			
					
		}System.out.println("largest "+largest);
		System.out.println("smallest "+smallest);
			}
		}

