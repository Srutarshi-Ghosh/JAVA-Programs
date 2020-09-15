import java.util.Scanner;
public class SWAP_COLUMN {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int row,column;
		System.out.println("NO OF ROWS:");
		row=s.nextInt();
		System.out.println("NO OF COLUMNS:");
		column=s.nextInt();
		int MATRIX[][]= new int[row][column];
		System.out.println("ENTER MATRIX:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				MATRIX[i][j]=s.nextInt();
			}
	}
		System.out.println("MATRIX:");
		System.out.println();
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(MATRIX[i][j]+"\t");
			}System.out.println();
	}
		System.out.println("MATRIX AFTER SWAPPING:");
		
		for(int i=0;i<row;i++) {
			for(int j=column-1;j>=0;j--) {
				System.out.print(MATRIX[i][j]+"\t");
						}System.out.println();

	}
		}
}
