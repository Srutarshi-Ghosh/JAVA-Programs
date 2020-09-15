import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class COLOR_CHOOSER extends JFrame{
	
	private Color color = (Color.WHITE);
	private JButton b;
	private JPanel p;
	
	public COLOR_CHOOSER() {
		super("COLOR CHOOSER");
		
		p = new JPanel();
		p.setBackground(color);
		
		b = new JButton("COLOR");
		b.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						color = JColorChooser.showDialog(null, "PICK YOUR COLOR", color);
						if(color==null)
							color=(Color.WHITE);
						
						p.setBackground(color);
					}
				}
				);
		
		add(p, BorderLayout.CENTER);
		add(b, BorderLayout.SOUTH);
		setSize(425,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		COLOR_CHOOSER go = new COLOR_CHOOSER();
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
