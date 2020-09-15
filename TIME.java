import java.util.Scanner;
public class TIME {
	public int hour;
	public int minute;
	public int second;
	
	public void settime(int h ,int m ,int s) {
		hour=(h> 0&& h<24)?h:0;
		minute=(m>0 && m<60)?m:0;
		second=(s>0 && s<60)?s:0;
	}
public String Military() {
	return String.format("%02d:%02d:%02d",hour,minute,second);
}
	public static void main(String[] args) {
		TIME TIMEObject = new TIME();
		TIMEObject.settime(4, 58, 49);
		System.out.println(TIMEObject.Military());
	}

}
