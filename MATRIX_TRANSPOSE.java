import java.util.Scanner;
public class MATRIX_TRANSPOSE {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int row,column,i,j;
		System.out.println("ENTER NO OF ROWS");
		row=in.nextInt();
		System.out.println("ENTER NO OF COLUMNS");
		column=in.nextInt();
		int MATRIX[][]= new int[row][column];
		System.out.println("ENTER MATRIX: ");
		for(i=0;i<row;i++) 
		{
			for(j=0;j<column;j++) {
				MATRIX[i][j]=in.nextInt();
			System.out.print(" ");}
		}System.out.println("MATRIX: ");
		for(i=0;i<row;i++) {
			for(j=0;j<column;j++) {
				System.out.print(MATRIX[i][j]+" ");
			}
			System.out.println(" ");
		}
		System.out.println("TRANSPOSE OF THE MATRIX IS: ");
		for(i=0;i<column;i++) {
			for(j=0;j<row;j++){
				System.out.print(MATRIX[j][i]+" ");
		}System.out.println(" ");
		}
		}
		
	}

