import java.util.Scanner;
import java.util.ArrayList;

public class DUPLICATE_STR_REMOVE {
	static Scanner s = new Scanner(System.in);
	
	public static ArrayList<Character> str_remove(String str) {
		
		char[] ch = str.toCharArray();
		ArrayList<Character> al = new ArrayList<Character>();
		
		for(int i=0;i<str.length();i++) {
			if(!al.contains(ch[i]))
				al.add(ch[i]);
			}
		return al;
	}
	public static void main(String[] args) {
		System.out.println("ENTER A LINE");
		String string;
		string = s.nextLine();
		
		ArrayList<Character> ans = str_remove(string);
		System.out.println("THE LINE WITHOUT DUPLICATE CHARACTERS IS");
		for(int i=0; i<ans.size()-1; i++) {
			System.out.print(ans.get(i));
		}
	}

}
