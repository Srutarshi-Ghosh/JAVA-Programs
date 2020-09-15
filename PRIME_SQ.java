import java.util.*;
import java.io.*;
import java.math.*;

public class Prime_sq {
	static ArrayList<Integer> simpleSieve(int limit) 
    { 
        limit++;
		ArrayList<Integer> prime = new ArrayList<Integer>();
        boolean mark[] = new boolean[limit+2]; 
          
        for (int i = 0; i < mark.length; i++) 
            mark[i] = true; 
       
        for (int p=2; p*p<=limit; p++) 
        { 
            // If p is not changed, then it is a prime 
            if (mark[p] == true) 
            { 
                // Update all multiples of p 
                for (int i=p*2; i<limit; i+=p) 
                    mark[i] = false; 
            } 
        } 
       
        // Print all prime numbers and store them in prime 
        for (int p=2; p<=limit; p++) 
        { 
            if (mark[p] == true) 
            { 
                prime.add(p); 
                
            } 
        }
        return prime;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF THE GRID");
		int n = sc.nextInt();
		ArrayList<Integer> al = simpleSieve(n);
		
		long p=0;
		
		for(int i=0; i<al.size(); i++) {
			p+=(long)Math.pow((n-al.get(i)+1),2);
			
		}
		System.out.println("THE NUMBER OF SQUARES WHOSE LENGTH IS A PRIME PRESENT IN THE GRID ARE");
		System.out.println(p);
	}

}
