import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class SHAPE extends JPanel{
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.YELLOW);
		
		g.setColor(Color.BLUE);
		g.fillRect(25, 25, 100, 30);
		
		g.setColor(new Color(190,81,215));
		g.fillOval(25, 65, 100, 50);
		
		g.setColor(new Color(32,54,183));
		g.drawString("THIS IS A LINE", 25, 150);
	}
	public static void main(String[] args) {
		JFrame f = new JFrame("FRAME");
		SHAPE go = new SHAPE();
		f.add(go);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(300,500);
		f.setVisible(true);
	}

}
