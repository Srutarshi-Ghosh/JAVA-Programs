import java.util.Scanner;

public class ELEMENT_MULTIPLICATION {
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
	System.out.println("ENTER THE NUMBER OF ELEMENTS IN THE ARRAY");
	int no;
	no = s.nextInt();
	int arr[] = new int[no];
	int ans[] = new int[no];
	System.out.println("ENTER " +no+ " ELEMENTS OF THE ARRAY");
	for(int i=0; i<no; i++) {
		arr[i] = s.nextInt();
	}
	System.out.println("THE ARRAY AFTER MULTIPLYNG THE OTHER ELEMENTS ARE");
	for(int i=0; i<no; i++) {
		int mul=1;
		for(int j=0; j<no; j++) {
			if(i == j)
				continue;
			mul *= arr[j];
			ans[i] = mul;
		}
		System.out.print(ans[i]+ " ");
	}
	}

}
