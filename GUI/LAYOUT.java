import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class LAYOUT extends JFrame{

	private JButton lb;
	private JButton cb;
	private JButton rb;
	private FlowLayout layout;
	private Container cont;
	
	public LAYOUT() {
		
		super("LAYOUT");
		layout = new FlowLayout();
		cont = getContentPane();
		setLayout(layout);
		
		lb = new JButton("LEFT");
		add(lb);
		lb.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						layout.setAlignment(FlowLayout.LEFT);
						layout.layoutContainer(cont);
					}
				}
				);
		
		cb = new JButton("CENTER");
		add(cb);
		cb.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						layout.setAlignment(FlowLayout.CENTER);
						layout.layoutContainer(cont);
					}
				}
				);
		
		rb = new JButton("RIGHT");
		add(rb);
		rb.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						layout.setAlignment(FlowLayout.RIGHT);
						layout.layoutContainer(cont);
					}
				}
				);
		
	}
	public static void main(String[] args) {
		LAYOUT go = new LAYOUT();
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		go.setSize(300,300);
		go.setVisible(true);
	}

}
