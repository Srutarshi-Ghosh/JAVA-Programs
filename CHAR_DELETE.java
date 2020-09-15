package program;
import java.util.Scanner;

public class CHAR_DELETE {
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("ENTER THE STRING");
		String str = new String();
		str = s.nextLine();
		System.out.println("ENTER POSITION OF CHARACTER YOU WANT TO DELETE");
		int x;
		x = s.nextInt();
		if(str.length()>x) {
		removeCharAt(str,x);
		System.out.println(removeCharAt(str,x));
		}
		else
			System.out.println("ERROR!");
	}

	private static String removeCharAt(String s, int pos) {
		return s.substring(0,pos) + s.substring(pos+1);
		
	}

}
