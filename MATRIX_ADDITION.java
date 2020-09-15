import java.util.Scanner;
public class MATRIX_ADDITION {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int row,column;
		System.out.println("NO OF ROWS:");
		row=s.nextInt();
		System.out.println("NO OF COLUMNS:");
		column=s.nextInt();
		int MATRIX1[][]= new int[row][column];
		int MATRIX2[][]= new int[row][column];
		int MATRIX3[][]= new int[row][column];
System.out.println("ENTER FIRST MATRIX:");
for(int i=0;i<row;i++) {
	for(int j=0;j<column;j++) {
		MATRIX1[i][j]=s.nextInt();
	}
}

System.out.println("FIRST MATRIX:");
System.out.println();
for(int i=0;i<row;i++) {
	for(int j=0;j<column;j++) {
		System.out.print(MATRIX1[i][j]+"\t");
	}System.out.println();

}

System.out.println("ENTER SECOND MATRIX:");
for(int i=0;i<row;i++) {
	for(int j=0;j<column;j++) {
		MATRIX2[i][j]=s.nextInt();
	}
}

System.out.println("SECOND MATRIX:");
System.out.println();
for(int i=0;i<row;i++) {
	for(int j=0;j<column;j++) {
		System.out.print(MATRIX2[i][j]+"\t");
	}System.out.println();
}

System.out.println();
System.out.println("ADDING THE MATRICES:");
	for(int i=0;i<row;i++) {
		for(int j=0;j<column;j++) {
			MATRIX3[i][j]=MATRIX1[i][j]+MATRIX2[i][j];
		}
}
	for(int i=0;i<row;i++) {
		for(int j=0;j<column;j++) {
			System.out.print(MATRIX3[i][j]+"\t");
		}System.out.println();
}
	}
}