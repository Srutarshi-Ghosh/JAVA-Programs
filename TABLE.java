package program;
import java.util.Scanner;
public class TABLE {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int no,c,num,number;
		System.out.println("Enter no to be multiplied ");
		no=in.nextInt();
		System.out.println("Enter no of times ");
		num=in.nextInt();
		for(c=1;c<=num;c++)
		{number=no*c;
		System.out.println("Multiplication of "+no+"*"+c+" is "+number);
	}
	}
}
