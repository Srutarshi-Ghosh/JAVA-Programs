package program;
import java.util.Scanner;
public class FLYD_TRIANGLE {

	public static void main(String[] args) {
int x,y,no,num=1;
System.out.println("Enter no of lines ");
Scanner input = new Scanner(System.in);
no = input.nextInt();
System.out.println("Floyd Triangle");
for(x=1;x<=no;x++)
{
	for(y=1;y<=x;y++)
	{
System.out.print(num+" ");
num++;
	}
	System.out.println();
}
}
}