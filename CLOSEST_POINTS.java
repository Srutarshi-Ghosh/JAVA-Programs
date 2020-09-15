import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class CLOSEST_POINTS {
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		int points;
		
		int X,Y;
		System.out.println("ENTER THE MAIN CO-ORDINATE");
		X = s.nextInt();
		Y = s.nextInt();
		System.out.println("THE MAIN CO-ORDINATE IS: (" +X+ "," +Y+ ")");
		System.out.println("ENTER NUMBER OF POINTS YOU WANT TO ENTER");
		points = s.nextInt();
		double arr[][] = new double[points][3];
		System.out.println("ENTER THE ARRAY OF CO-ORDINATES");
		for(int i=0; i<points; i++) {
			arr[i][0] = s.nextInt();
			arr[i][1] = s.nextInt();
			arr[i][2] = Math.sqrt(((Y-arr[i][1])*((Y-arr[i][1])))+((X-arr[i][0])*(X-arr[i][0]))); 
			System.out.println();
			System.out.println("THE "+(i+1)+" CO-ORDINATE IS: (" +arr[i][0]+","+arr[i][1]+")");
			System.out.println();
		}
		
		int no;
		System.out.println("ENTER THE NUMBER OF POINTS YOU WANT TO FIND NEAR MAIN POINT");
		no = s.nextInt();
		
		if(no>points && points==0) {
			System.out.println("NOT POSSIBLE");
			System.out.println("ENTER NUMBER AGAIN");
			no = s.nextInt();
		}
		
		ArrayList<Double> al = new ArrayList<Double>();
		for(int i=0; i<points; i++) {
			al.add(new Double(arr[i][2]));
		}
		ArrayList<Double> obj = new ArrayList<Double>(al);
		Collections.sort(al);
		int index[] = new int[no];
		for(int i=0; i<no; i++) {
			index[i] = obj.indexOf(al.get(i));
			
		}
		for(int i=0; i<no; i++) {
			System.out.println(arr[index[i]][0]+","+arr[index[i]][1]);
		}
	}

}
