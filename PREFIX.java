import java.util.Scanner;
public class PREFIX {
	static Scanner s = new Scanner(System.in);
	
	public static boolean prefix(String str, String s) {
		
			char[] ch = str.toCharArray();
			char[] c = s.toCharArray();
			for(int i=0; i<ch.length; i++) {
				for(int j=0; j<c.length; j++) {
					if(ch[j] == c[j]) {
						return true;
					}
				}
			}
			return false;
		}
	
	public static void main(String[] args) {
		System.out.println("ENTER THE QUERY");
		String query = s.nextLine();
		System.out.println("ENTER THE NO OF ITEMS IN THE ARRAY");
		int no = s.nextInt();
		String arr[] = new String[no];
		System.out.println("ENTER THE ITEMS");
		for(int i=0; i<no; i++) {
			arr[i] = s.nextLine();
		}
		for(int i=0; i<no; i++) {
			boolean x = prefix(arr[i], query);
			if(x == true)
				System.out.println(arr[i]);
		}
	}

}
