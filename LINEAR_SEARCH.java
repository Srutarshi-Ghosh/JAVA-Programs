import java.util.Scanner;
public class LINEAR_SEARCH {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int no;
		System.out.println("ENTER NO OF ELEMENTS:");
		no=s.nextInt();
		int ARRAY[] = new int[no];
		System.out.println("ENTER THE ELEMENTS");
		for(int i=0;i<no;i++) {
			ARRAY[i]=s.nextInt();
		}
		System.out.println();
		System.out.println("THE ARRAY IS");
		for(int i=0;i<no;i++) {
			System.out.println(ARRAY[i]);
		}
		System.out.println("ENTER THE ELEMENT TO SEARCH");
		int search,pos;
		search=s.nextInt();
		for(int i=0;i<no;i++) {
			if(search==ARRAY[i])
				System.out.print("THE POSITION OF THE ELEMENT IS "+ (i+1));
		}
	}

}
