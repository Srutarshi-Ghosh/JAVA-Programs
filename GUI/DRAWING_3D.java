import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class DRAWING_3D extends JPanel{
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		
		g.setColor(Color.BLUE);
		g.drawLine(10, 30, 200, 45);
		
		g.setColor(Color.RED);
		g.drawRect(10, 55, 100, 30);
		
		g.setColor(Color.GREEN);
		g.fillOval(10, 95, 100, 30);
		
		g.setColor(Color.ORANGE);
		g.fill3DRect(10, 160, 100, 50, true);
	}
	public static void main(String[] args) {
		JFrame f = new JFrame("DRAW");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		DRAWING_3D draw = new DRAWING_3D();
		draw.setBackground(Color.WHITE);
		f.add(draw);
		f.setSize(500, 270);
		f.setVisible(true);
		
	}

}
