import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LEADERBOARD {

static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
			    
          int[][] s= new int[3][3];
          
          for(int i=0; i<3; i++){
	             for(int j=0; j<3; j++){
	            	 s[i][j] = sc.nextInt();
	             }
	             }
			 ArrayList<Integer> al = new ArrayList<Integer>();
	         ArrayList<Integer> a = new ArrayList<Integer>();
	        ArrayList<Integer> duplicate = new ArrayList<Integer>();
	        for(int i=0; i<9; i++){
	            al.add(i+1);
	       
	        }
	        duplicate.add(s[0][0]);
	        for(int i=0; i<3; i++){
	             for(int j=0; j<3; j++){
	            	 if(i!=0 && j!=0) 
	            		
	                 a.add(s[i][j]);
	                 for(int x=0; x<a.size()-1; x++){
	                     if(s[i][j]==a.get(x))
	                         duplicate.add(s[i][j]);
	                 }
	                    for(int k=0; k<al.size(); k++){
	                if(s[i][j]==al.get(k))
	                    al.remove(k);
	                
	             System.out.println(al.get(k));
	                  
	                    }
	        }
	        }
	        int sum=0;
	        int no = 0;
	        for(int i=0; i<duplicate.size(); i++){
	            no= Math.abs(duplicate.get(i)-al.get(0));
	            for(int j=0; j<al.size(); j++){
	                if(Math.abs(duplicate.get(i)-al.get(j))<no){
	                    no=Math.abs(duplicate.get(i)-al.get(j));
	                    al.remove(j);
	            }
	                else 
	                    al.remove(0);
	            }
	            sum+=no;
	        }
		 }
}
		 
