import java.util.Scanner;
import java.util.ArrayList;

public class PALINDROME_LINE {
	static Scanner s = new Scanner(System.in);
	
	public static boolean palin_word(String palin) {
		for(int i=0; i<palin.length()/2; i++) {
			if(palin.charAt(i)!=palin.charAt(palin.length()-1-i))
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println("ENTER A LINE");
		String[] st = s.nextLine().split(" ");
		String bin = "";
		System.out.println("THE PALINDROME WORDS IN THE LINE ARE");
		for(int i=0; i<st.length; i++) {
			if(palin_word(st[i])==true) {
				bin+=st[i]+" ";
			}
		}
			System.out.println(bin);
			}
		
	}


