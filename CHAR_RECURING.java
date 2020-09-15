import java.util.Scanner;
public class CHAR_RECURING {
	static Scanner s = new Scanner(System.in);
	
	public static char recuring(char[] ch) {
		char c = 0;
		for(int i=0; i<ch.length; i++) {
			for(int j=ch.length-1; j>i; j--) {
				if(ch[i] == ch[j])
					c = ch[j];
			}
		}
		return c;
	}
	public static void main(String[] args) {
		System.out.println("ENTER A SEQUENCE OF LETTERS");
		String str = s.nextLine();
		char[] ch = str.toCharArray();
		char c;
		c = recuring(ch);
		if(c==0)
			System.out.println("THERE IS NO RECURING CHARACTER");
		else
			System.out.println("THE RECURING CHARACTER IS " +c);
	}

}
