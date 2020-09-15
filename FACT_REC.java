import java.util.Scanner;
import java.math.*;

public class FACT_REC {
	static Scanner s = new Scanner(System.in);
static BigInteger factorial(BigInteger num) {
	if(num.equals(BigInteger.valueOf(1)))
		return BigInteger.valueOf(1);
	else
		return num.multiply(factorial(num.subtract(BigInteger.valueOf(1))));
}
	public static void main(String[] args) {
		System.out.println("ENTER NO TO FIND FACTORIAL");
		BigInteger num = new BigInteger(String.valueOf(s.nextLong()));
		System.out.print("THE FACTORIAL OF "+num+" is ");
		System.out.println(factorial(num));
		}
		
}


