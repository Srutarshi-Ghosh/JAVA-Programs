import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MOUSE extends JFrame{
	
	private JPanel mouse;
	private JLabel statusbar;
	
	public MOUSE() {
		super("MOUSE");
		
		mouse = new JPanel();
		mouse.setBackground(Color.WHITE);
		add(mouse, BorderLayout.CENTER);
		
		statusbar = new JLabel("default");
		add(statusbar, BorderLayout.SOUTH);
		
		Hand handler = new Hand();
		mouse.addMouseListener(handler);
		mouse.addMouseMotionListener(handler);
		
	}
	
	private class Hand implements MouseListener, MouseMotionListener{
		public void mouseClicked(MouseEvent e) {
			statusbar.setText(String.format("CLICKED AT %d, %d", e.getX(), e.getY()));
		}
		
		public void mousePressed(MouseEvent event) {
			statusbar.setText("YOU PRESSED THE MOUSE");			
		}
		
		public void mouseReleased(MouseEvent event) {
			statusbar.setText("YOU RELEASED THE MOUSE");
		}
		
		public void mouseEntered(MouseEvent e) {
			statusbar.setText("YOU ENTERED THE AREA");
			mouse.setBackground(Color.RED);
		}
		
		public void mouseExited(MouseEvent e) {
			statusbar.setText("THE MOUSE HAS LEFT THE WINDOW");
			mouse.setBackground(Color.WHITE);
		}
		
		public void mouseDragged(MouseEvent e) {
			statusbar.setText("YOU ARE DRAGGING THE MOUSE");
		}
		
		public void mouseMoved(MouseEvent e) {
			statusbar.setText("YOU MOVED THE MOUSE");
		}
	}
	public static void main(String[] args) {
		MOUSE g = new MOUSE();
		g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		g.setSize(300,200);
		g.setVisible(true);
	}

}
