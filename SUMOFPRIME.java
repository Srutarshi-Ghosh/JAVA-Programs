import java.util.Scanner;
public class SUMOFPRIME {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count=0,sum=0,no,number=2;
		System.out.println("ENTER THE NO OF PRIMES YOU WANT TO ADD");
		no = s.nextInt();
		while(count<no) {
			if(prime(number)) {
			sum+=number;
			count++;
		}
		number++;
		}
		System.out.print("THE SUM OF "+no+" PRIME NUMBERS IS ");
		System.out.println(sum);
	}
	private static boolean prime(int number){
		for(int i=2;i<=number/2;i++) {
			if(number%i==0)
				return false;
		}
	
	return true;
	}
}
