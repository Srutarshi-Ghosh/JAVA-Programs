package program;
import java.util.Scanner;
public class STRING_TRIM {
	static Scanner s = new Scanner(System.in);
	public static char[] trim(String str) {
		char[] ch = str.toCharArray();
		char space[] = new char[str.length()];
		int j=0;
		for(int i=0;i<str.length();i++) {
			if(ch[i]==' ') 
				continue;
			space[j] = ch[i];
			j++;
		}
		return space;
		
	}
	public static void main(String[] args) {
		String trim;
		System.out.println("ENTER A LINE");
		trim = s.nextLine();
		char[] ch = trim(trim);
		System.out.println("THE LINE WITHOUT SPACE IS");
		for(int i=0;i<trim.length();i++) {
		System.out.print(ch[i]);
	}
	}
}
