import java.util.ArrayList;
import java.util.Scanner;

public class CALCULATOR {
		
	private static Scanner s;

	public static void main(String[] args) {
		float num=0;
		int n;
		s = new Scanner(System.in);
		System.out.println("ENTER OPERATION:");
		System.out.println("1.ADDITION");
		System.out.println("2.SUBTRACTION");
		System.out.println("3.MULTIPLICATION");
		System.out.println("4.DIVISION");
		System.out.println("5.EXIT");
		 ArrayList<Float> in = new ArrayList<Float>();
		do {
			
		n=s.nextInt();
		if(n==1) 
		{
				if(in.size()!=0)
				{
					num=in.get(in.size()-1);
					in.add(num);
				}else 
				{
					num=0;
				}
			System.out.println("ENTER ELEMENT TO ADD");
			float a;
			a=s.nextFloat();
			num+=a;
			System.out.println("THE EXPRESSION IS " +num);
			in.add(num);
			
			n=s.nextInt();
		}
		if(n==2)
		{
			if(in.size()!=0) {
				num=in.get(in.size()-1);
				in.add(num);
			}else 
			{
				num=0;
			}
			System.out.println("ENTER ELEMENT TO SUBTRACT");
			float a;
			a=s.nextFloat();
			num=num-a;
			System.out.println("THE EXPRESSION IS " +num);
			in.add(num);
			
			n=s.nextInt();
		}
		if(n==3)
		{
			if(in.size()!=0) 
			{
				num=in.get(in.size()-1);
				in.add(num);
			}else
			{
				num=0;
			}
			System.out.println("ENTER ELEMENT TO MULTIPLY");
			float a;
			a=s.nextFloat();
			num=num*a;
			System.out.println("THE EXPRESSION IS " +num);
			in.add(num);
			
			n=s.nextInt();
		}
		if(n==4)
		{
			if(in.size()!=0) {
				num=in.get(in.size()-1);
				in.add(num);
			}else {
				num=0;
			}
			System.out.println("ENTER ELEMENT TO DIVIDE");
			float a;
			a=s.nextFloat();
			num=num/a;
			System.out.println("THE EXPRESSION IS " +num);
			in.add(num);
			n=s.nextInt();		 
		}
		
		if(n==5) 
		{
			System.out.println("THE ANSWER IS " +num);
		}
		else
			System.out.println("WRONG CHOICE");
		 }while (n!=5);
}
}
