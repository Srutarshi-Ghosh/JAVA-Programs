import java.util.*;
import java.io.*;

public class WORDSEARCH {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	static int x[] = {-1, 0, 1, 1, 0, -1, 1, -1};
	static int y[] = {1, 1, 0, -1, -1, 0, 1, -1};
	
	public static boolean search(String[] grid, String word, int row, int col) {
		if(word.charAt(0)!=grid[row].charAt(col))
			return false;
		
		for(int dir=0; dir<8; dir++) {
			
			int k, rd=row+x[dir], cd=col+y[dir];
			for(k=1; k<word.length(); k++) {
				if(rd>=grid.length || cd>=grid[0].length() || rd<0 || cd<0)
					break;
				
				if(grid[rd].charAt(cd)!=word.charAt(k))
					break;
				
				rd+=x[dir];
				cd+=y[dir];
			}
			if(k==word.length())
				return true;
		}
		return false;
	}

	public static void main(String[] args) throws IOException {
		System.out.println("ENTER THE SIZE OF THE GRID");
		int row = Integer.parseInt(br.readLine());
		
		String[] grid = new String[row]; 
		
		System.out.println("ENTER THE GRID");
		for(int i=0; i<row; i++) {
			grid[i]= br.readLine();
		}
		System.out.println("ENTER THE WORD");
		String word = br.readLine();
		for(int r=0; r<grid.length; r++) {
			for(int c=0; c<grid[0].length(); c++) {
				if(search(grid, word, r, c)==true)
					System.out.println("WORD FOUND AT "+r+ ", "+c);
			}
		}
		
	}

}
