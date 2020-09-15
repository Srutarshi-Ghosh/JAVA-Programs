package program;
import java.util.Scanner;

public class PALINDROME_STRING {
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		String palin = new String();
		char[] stringArray;
		System.out.println("ENTER THE ARRAY");
			palin = s.nextLine();
			System.out.println();
			System.out.println(palin);
			stringArray = palin.toCharArray();
			int num=0;
			for(int i=0;i<stringArray.length/2;i++) {
				int j=stringArray.length-1-i;
				if(stringArray[i]==stringArray[j]) {
					num++;
				}
			}
			if(num==stringArray.length/2) {
				System.out.println("STRING IS PALINDROME");
			}
				else 
					System.out.println("STRING IS NOT PALINDROME");
				
		}
	}


