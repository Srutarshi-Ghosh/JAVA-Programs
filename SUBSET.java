import  java.util.Scanner;

public class SUBSET {
	static Scanner s = new Scanner(System.in);
	
	 static void printSubsets(char set[])
	    {
	        int n = set.length;
	 	       
	        for (int i=0; i<(1<<n); i++)
	        {
	            System.out.print("{ ");
	 	       
	            for (int j=0; j<n; j++) {
	                if ((i & (1 << j)) > 0)
	                    System.out.print(set[j] + " ");
	            }
	            System.out.println("}"); 
	        }
	    }
	public static void main(String[] args) {
		 String str;
		 System.out.println("ENTER THE SET");
		 str = s.nextLine();
		 char set[];
		 set = str.toCharArray();
	        printSubsets(set);
	}

}
