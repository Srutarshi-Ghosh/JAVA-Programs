import java.util.Scanner;
public class TRIANGLE {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x;
		System.out.println("NO OF ROWS:");
		x=in.nextInt();
		System.out.println("TRIANGLE:");
		for(int i=0;i<x;i++) {
			int num=1;
			for(int j=0;j<=i;j++) {
				System.out.print(+num);
				++num;
			}System.out.println(" ");
		}
	}

}
