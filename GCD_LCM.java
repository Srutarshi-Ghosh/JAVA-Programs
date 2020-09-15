import java.util.Scanner;
public class GCD_LCM {
	static Scanner in = new Scanner(System.in);
	static int gcd(int x,int y) {
		int r=0,a,b;
		a=(x>y)?x:y;
		b=(x>y)?y:x;
		r=b;
		while(a%b!=0) {
			r=a%b;
			a=b;
			b=r;
	}
		return r;
	}
	static int lcm(int x,int y) {
		int a;
		a=(x>y)?x:y;
		while(true){
		if(a%x==0 && a%y==0)
		return a;
			++a;
		}
				
	}
	public static void main(String[] args) {
		System.out.println("Enter the numbers: ");
		int x=in.nextInt();
		int y=in.nextInt();
		System.out.println("GCD of the numbers is: "+gcd(x,y));
		System.out.println("LCM of the numbers is: "+lcm(x,y));
	}

}
