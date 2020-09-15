package program;
import java.util.Scanner;
public class FIBONACCI {


	public static void main(String[] args) {
		System.out.println("ENTER NO OF FIBONACCI SERIES TO BE PRINTED ");
		Scanner s = new Scanner(System.in);
		int x;
		x = s.nextInt();
		int fib[] = new int[x];
		fib[0]=0;
		fib[1]=1;		
		for(int i=2;i<x;i++) {
			fib[i]=fib[i-1]+fib[i-2];
		}
		for(int i=0;i<x;i++) {
		System.out.print(fib[i]+" ");
	}
	}
}

