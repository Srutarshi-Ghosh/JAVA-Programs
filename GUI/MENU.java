import javax.swing.*;
import java.awt.*;
public class MENU {
	MENU(){
		JFrame frame = new JFrame("CHAT FRAME");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
				
		JMenuBar mb = new JMenuBar();
		JMenu m1 = new JMenu("FILE");
		JMenu m2 = new JMenu("HELP");
		mb.add(m1);
		mb.add(m2);
		JMenuItem m11 = new JMenuItem("OPEN");
		JMenuItem m12 = new JMenuItem("SAVE AS");
		m1.add(m11);
		m1.add(m12);
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("ENTER TEXT");
		JTextField t = new JTextField(10);
		JButton send = new JButton("SEND");
		JButton reset = new JButton("RESET");
		panel.add(label);
		panel.add(t);
		panel.add(send);
		panel.add(reset);
		
	   
		JTextArea ta = new JTextArea();
		
		frame.getContentPane().add(BorderLayout.SOUTH, panel);
		frame.getContentPane().add(BorderLayout.NORTH, mb);
		frame.getContentPane().add(BorderLayout.CENTER, ta);
		frame.setVisible(true);
		
	}
			
	public static void main(String[] args)
	{
		new MENU();
	}

}
