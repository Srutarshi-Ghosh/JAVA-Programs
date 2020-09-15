import javax.swing.JOptionPane;
public class SUM {

	public static void main(String[] args) {
		String fn = JOptionPane.showInputDialog("ENTER FIRST NUMBER");
		String sn = JOptionPane.showInputDialog("ENTER SECOND NUMBER");
		int num1 = Integer.parseInt(fn);
		int num2 = Integer.parseInt(sn);
		int sum = num1+num2;
		
		JOptionPane.showMessageDialog(null, "THE ANSWER IS " +sum,"ANSWER" , JOptionPane.PLAIN_MESSAGE);
	}


	

}
