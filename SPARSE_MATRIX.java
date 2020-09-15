import java.util.Scanner;
public class SPARSE_MATRIX {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int row,column;
		System.out.println("ENTER NO OF ROWS");
		row=s.nextInt();
		System.out.println("ENTER NO OF COLUMNS");
		column=s.nextInt();
		int matrix[][]=new int[row][column];
		System.out.println("ENTER THE MATRIX");
		for (int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				matrix[i][j]=s.nextInt();
			}
		}
		System.out.println("THE MATRIX IS");
		for (int i=0;i<row;i++) {
				for(int j=0;j<column;j++) {
				System.out.print(matrix[i][j]+ " ");
			}System.out.println();
		}
		int zero=0;
		for (int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				if(matrix[i][j]==0) {
					zero++;
				}
			}
		}
		if(zero>(row*column)/2) {
			System.out.println("IT IS A SPARSE MATRIX");
		}
		else
			System.out.println("IT IS NOT A SPARSE MATRIX");
	}

}
