import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ADAPTER extends JFrame{
	
	private String details;
	private JLabel statusbar;
	
	public ADAPTER() {
		super("ADAPTER CLASS");
		
		statusbar = new JLabel("DEFAULT");
		add(statusbar, BorderLayout.SOUTH);
		addMouseListener(new Mouseclass());
	}
	
	private class Mouseclass extends MouseAdapter{
		public void mouseClicked(MouseEvent e) {
			details = String.format("YOU CLICKED %d ", e.getClickCount());
			
			if(e.isMetaDown())
				details += "WITH RIGHT MOUSE BUTTON";
			else if(e.isAltDown())
				details += "WITH CENTER MOUSE BUTTON";
			else
				details += "WITH LEFT MOUSE BITTON";
			
			statusbar.setText(details);
		}
	}
	public static void main(String[] args) {
		ADAPTER go = new ADAPTER();
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		go.setSize(300,200);
		go.setVisible(true);
	}

}
