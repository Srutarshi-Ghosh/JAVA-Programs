import java.util.Arrays;
import java.util.Scanner;
public class SORT_STRING {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER THE NO OF NAMES YOU WANT TO ENTER");
		int x;
		x = s.nextInt();
		String str[] = new String[x+1];
		System.out.println("ENTER "+x+" NAMES");
		for(int i=0;i<=x;i++) {
			str[i] = s.nextLine();
		}
		Arrays.sort(str);
		System.out.println("STRING ARRAY SORTED");
		for(int i=0;i<=x;i++) {
			System.out.println(str[i]);
		}
	}
	}


