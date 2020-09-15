package program;
import java.util.Scanner;
public class REMOVE_VOWEL {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER THE SENTENCE");
		String str = new String();
		str = s.nextLine();
		char[] c = str.toCharArray();
		char[] ch = new char[str.length()];
		int j=0;
		for(int i=0;i<str.length();i++) {
			if (c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U') {
				continue;
			}
			else {
				ch[j]=c[i];
			j++;
			}
		}
		System.out.println("ARRAY AFTER REMOVING VOWEL");
		System.out.print(ch);
	}
}


