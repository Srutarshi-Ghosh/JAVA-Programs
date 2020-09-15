package program;
import java.util.Scanner;
import java.util.*;
public class PRIME {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num=3,x,status=1;
		System.out.println("ENTER THE NO OF PRIME NOS YOU WANT TO FIND:");
		x=s.nextInt();
		if(x>=1)
		{
			System.out.println("THE FIRST "+x+" PRIME NUMBERS IS");
			System.out.println(2);
		}
			for(int i=2;i<=x;) {
				for(int j=2;j<=Math.sqrt(num);j++) {
					if(num%j==0) {
						status=0;
						break;
					}
				}
					if(status!=0) {
						System.out.println(num);
						i++;
				}
				status=1;
				num++;
			}
				
		}

}
