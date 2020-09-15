import java.util.Scanner;
public class STRING_REV {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = new String();
		System.out.println("ENTER A LINE");
		str = s.nextLine();
		System.out.println();
		System.out.print(str);
		System.out.println();
		int length=str.length();
		char[] stringArray;
		stringArray = str.toCharArray();
		for(int i=0;i<length/2;i++) {
			char temp = stringArray[i];
			stringArray[i] = stringArray[length-1-i];
			stringArray[length-1-i] = temp;
		}
		System.out.println("THE REVERSE OF STRING IS:");
		System.out.print(stringArray);
	}
}

