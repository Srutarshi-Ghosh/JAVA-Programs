import java.util.Scanner;
public class MATRIX_MULTIPLICATION {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int row1,column1,row2,column2;
		System.out.println("NO OF ROWS IN FIRST MATRIX:");
		row1=s.nextInt();
		System.out.println("NO OF COLUMNS IN FIRST MATRIX:");
		column1=s.nextInt();
		int MATRIX1[][]= new int[row1][column1];
System.out.println("ENTER FIRST MATRIX:");
for(int i=0;i<row1;i++) {
	for(int j=0;j<column1;j++) {
		MATRIX1[i][j]=s.nextInt();
	}
}

System.out.println("FIRST MATRIX:");
System.out.println();
for(int i=0;i<row1;i++) {
	for(int j=0;j<column1;j++) {
		System.out.print(MATRIX1[i][j]+"\t");
	}System.out.println();
	}
	System.out.println("NO OF ROWS IN SECOND MATRIX:");
	row2=s.nextInt();
	System.out.println("NO OF COLUMNS IN SECOND MATRIX:");
	column2=s.nextInt();
	int MATRIX2[][]= new int[row2][column2];

System.out.println("ENTER SECOND MATRIX:");
for(int i=0;i<row2;i++) {
	for(int j=0;j<column2;j++) {
		MATRIX2[i][j]=s.nextInt();
	}
}

System.out.println("SECOND MATRIX:");
System.out.println();
for(int i=0;i<row2;i++) {
	for(int j=0;j<column2;j++) {
		System.out.print(MATRIX2[i][j]+"\t");
	}System.out.println();
}
int MATRIX3[][]= new int[row1][column2];
System.out.println("MULTIPLYING THE MATRICES:");
System.out.println();
	for(int i=0;i<row1;i++) {
		for(int j=0;j<column2;j++) {
			for(int k=0;k<column1;k++) {
			MATRIX3[i][j]+=MATRIX1[i][k]*MATRIX2[k][j];
		}
	}
}
	for(int i=0;i<row1;i++) {
		for(int j=0;j<column2;j++) {
			System.out.print(MATRIX3[i][j]+"\t");
		}System.out.println();
	}
	}
}
