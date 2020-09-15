import java.util.*;
import java.io.*;

public class BINARYGRID {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	static int x[] = {0,-1, 0, 1, 1, 0, -1, 1, -1};
	static int y[] = {0,1, 1, 0, -1, -1, 0, 1, -1};
	
	public static int[] updateval(int[][] grid, int n) {
		int[] values = new int[2];
		values[0]=0;
		values[1]=0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(grid[i][j]==1)
					values[1]++;
				else
					values[0]++;
			}
		}
		return values;
	}
	
	public static void main(String[] args) throws IOException{
		System.out.println("ENTER THE SIZE OF THE GRID");
		int n = Integer.parseInt(br.readLine());
		int count1=0, count0=0, iter=0;
		int[][] grid = new int[n][n]; 
		
		System.out.println("ENTER THE GRID");
		for(int i=0; i<n; i++) {
			String[] tokens = br.readLine().split(" ");
			for(int j=0; j<tokens.length; j++) {
				grid[i][j] = Integer.parseInt(tokens[j]);
			}
		}
		int[] values = updateval(grid, n);
		while(values[0]!=0 && values[1]!=0) {
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					for(int dir=0; dir<9; dir++) {
						if(i+x[dir]>=n || j+y[dir]>=n || i+x[dir]<0 || j+y[dir]<0)
							continue;
						if(grid[i+x[dir]][j+y[dir]]==1)
							count1++;
						else
							count0++;
					}
					if(count1>=count0)
						grid[i][j]=1;
					else
						grid[i][j]=0;
					count1=0;
					count0=0;
				}
			}
			iter++;
			values = updateval(grid, n);
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					System.out.print(grid[i][j]+" ");
				}
				System.out.println();
		}
			System.out.println();
		}
		System.out.println(iter);
	}

}
