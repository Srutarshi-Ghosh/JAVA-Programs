import java.util.Scanner;

public class PERMUTATIONS {
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("ENTER A SERIES TO PERMUTE");
		String str;
		str = s.nextLine();
		System.out.println("THE PERMUTATIONS ARE");
		PERMUTATIONS permutation = new PERMUTATIONS();
		permutation.permute(str, 0, str.length()-1);
	}
	public void permute(String str, int l, int r) {
		if(l==r) {
			System.out.println(str);
		}
		else 
		{
			for(int i=l;i<=r;i++) 
			{
				str = swap(str, l, i);
				permute(str, l+1, r);
				str = swap(str, l, i);
			}
		}
	}
	
	public String swap(String str, int i, int j) 
	{
		char temp;
		char[] stringArray;
		stringArray = str.toCharArray();
		temp = stringArray[i];
		stringArray[i] = stringArray[j];
		stringArray[j] = temp;
		return String.valueOf(stringArray);
	}
}
