package program;
import java.util.Scanner;
public class BINARY_CHECK {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int no,digits=0,rem=0,num,status=0;
		System.out.println("ENTER THE NUMBER");
		no = s.nextInt();
		num=no;
		while (no>0) {
			rem=no%10;
			no=no/10;
			digits++;
		}
			int arr[] = new int[digits];
			for(int i=0;i<digits;i++) {
				arr[i]=num%10;
				num=num/10;
			}
			for(int i=0;i<digits;i++) {
				if(arr[i]==1||arr[i]==0) {
					status++;
				}
			}
			if(status==digits)
				System.out.println("THE NUMBER IS BINARY");
				else 
					System.out.println("THE NUMBER IS NOT BINARY");
			}
		}
		
	


