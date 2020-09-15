import java.util.Scanner;

public class LARGEST_SQ {
	static Scanner s = new Scanner(System.in);
	
	public static int largest_sq(int matrix[][]) {
		int result=0;
		int calc[][] = new int[matrix.length][matrix[0].length];
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				if(i==0 || j==0)
					calc[i][j] = matrix[i][j];
				else if(matrix[i][j]>0) {
					int min=calc[i][j-1];
					
					if(min>calc[i-1][j])
						min=calc[i-1][j];
					
					if(min>calc[i-1][j-1])
						min=calc[i-1][j-1];
					
					calc[i][j] = 1+min;
				}
				if(calc[i][j]>result)
					result = calc[i][j];
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println("ENTER THE SIZE OF THE MATRIX");
		int size = s.nextInt();
		int matrix[][] = new int[size][size];
		System.out.println("ENTER THE MATRIX");
		for(int i=0; i<size; i++)
			for(int j=0; j<size; j++) {
				matrix[i][j] = s.nextInt();
				while(matrix[i][j] != 1 && matrix[i][j] != 0) {
					System.out.println("YOU CANNOT ENTER THAT");
					System.out.println("ENTER AGAIN");
					matrix[i][j] = s.nextInt();
				}
			}
		int x = largest_sq(matrix);
		System.out.println("LARGEST SQUARE IN THE MATRIX IS " +x);
	}

}
