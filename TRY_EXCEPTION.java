package program;
import java.util.*;
public class TRY_EXCEPTION {
	
	public static void main(String[] args) {
		int x=1;
		do {
		try {
		Scanner s = new Scanner(System.in);
		int fn,sn,result;
		System.out.println("ENTER FIRST NUMBER");
		fn = s.nextInt();
		System.out.println("ENTER SECOND NUMBER");
		sn = s.nextInt();
		result=fn/sn;
		System.out.println("THE RESULT IS");
		System.out.println(result);
		x=2;
	}
		catch(Exception e) 
		{
		System.out.println("YOU CANT DO THAT");
	    }
		}while(x==1);
}
}