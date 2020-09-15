package program;

import java.util.*;
import java.io.*;
import java.math.*;


public class Prime_decomposition {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static ArrayList<Integer> sieve(int n) {
		boolean prime[] = new boolean[n+1];
		ArrayList<Integer> al = new ArrayList<Integer>();
		Arrays.fill(prime, true);
		prime[0]=false;
		prime[1]=false;
		int p;
		for(int i=2; i<=n; i++) {
			if(prime[i]==true) {
				p=2*i;
				while(p<=n) {
					prime[p]=false;
					p+=i;
				}
				al.add(i);
			}
		}
		return al;
	}
	
	public static BigInteger fact(int n, ArrayList<Integer> al) {
		BigInteger res = new BigInteger("1");
		int t;
		long sum;

		for(int i=0; i<al.size(); i++) {
			t=al.get(i);
			sum=0;
			while(t<=n) {
				sum += n/t;
				t*=al.get(i);
			}
			res =res.multiply(BigInteger.valueOf((long)Math.pow(al.get(i), sum)));
		}
		return res;
	}
	
	public static void main(String[] args) throws IOException {
		
		System.out.print("Enter a number to calculate its factorial: ");
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> al = sieve(n);
		System.out.println("The factorial of the number is: ");
		BigInteger b = fact(n, al);
		System.out.println(b);
	}

}
