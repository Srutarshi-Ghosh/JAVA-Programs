import java.util.Scanner;

public class RELATION {
	static Scanner s = new Scanner(System.in);
	
	public static void relation(char ch[], char arr[], int n1, int n2) {
		for (int i=0; i<n1; i++) {
			for(int j=0; j<n2; j++) {
				System.out.print("{" +ch[i]+ "," +arr[j]+ "} ");
			}
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("ENTER THE SIZE OF THE FIRST ARRAY");
		int n1 = s.nextInt();
		System.out.println("ENTER FIRST ARRAY");
		char ch[] = new char[n1];
		for(int i=0; i<n1; i++) {
			char c = s.next().charAt(0);
			ch[i] = c;
		}
		
		System.out.println("ENTER TE SIZE OF SECOND ARRAY");
		int n2 = s.nextInt();
		char arr[] = new char[n2];
		System.out.println("ENTER SECOND ARRAY");
		for(int i=0; i<n2; i++) {
			char c = s.next().charAt(0);
			arr[i] = c;
		}
		
		System.out.println("THE RELATION BETWEEN THE TWO SETS IS");
		relation(ch, arr, n1, n2);
	}

}
