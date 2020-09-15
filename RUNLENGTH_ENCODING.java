import java.util.ArrayList;

public class RUNLENGTH_ENCODING {
	
	public static ArrayList<Character> encode(String str){
		ArrayList ar = new ArrayList<Character>();
		char[] ch = str.toCharArray();
		int num=0;
		for(int i=0; i<ch.length-1; i++) {

			if(ch[i] == ch[i+1]) {
				num++;
				 if(i==ch.length-2) {
					ar.add(num+1);
					ar.add(ch[i]);
				 }
			}
			
			else if(ch[i] != ch[i+1]) {
				ar.add(num+1);
				ar.add(ch[i]);
				num = 0;
			}
			
		}
		
		if (ch[ch.length-2] != ch[ch.length-1]) {
			ar.add(1);
			ar.add(ch[ch.length-1]);
		}
		return ar;
	}
	
	public static void main(String[] args) {
		String str = "AAAABBBCCDAA";
		ArrayList<Character> ar = encode(str);
		for(int i=0; i<ar.size(); i++) {
		System.out.print(ar.get(i));
		}
	}

}
