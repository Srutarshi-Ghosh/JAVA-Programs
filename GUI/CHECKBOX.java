import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CHECKBOX extends JFrame{
	
	private JTextField j;
	JCheckBox jbold;
	JCheckBox jitalics;
	CHECKBOX()
	{
		super("BUTTON");
		setLayout(new FlowLayout());
		j = new JTextField(20);
		j.setFont(new Font("Serif", Font.PLAIN, 14));
		add(j);
		jbold = new JCheckBox("BOLD");
		add(jbold);
		jitalics = new JCheckBox("ITALICS");
		add(jitalics);
					
		act action = new act();
		jbold.addItemListener(action);
		jitalics.addItemListener(action);
	}			
		private class act implements ItemListener{
		public void itemStateChanged(ItemEvent event) {
			Font font = null;
			if(jbold.isSelected() && jitalics.isSelected())
			{
				font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
			}
			else if(jbold.isSelected()) 
			{
				font = new Font("Serif", Font.BOLD, 14);
			}
			else if(jitalics.isSelected()) {
				font = new Font("Serif", Font.ITALIC, 14);
			}
			else
				font = new Font("Serif", Font.PLAIN, 14);
			j.setFont(font);
			
			}
	
		}
				
	
	public static void main(String[] args) {
		CHECKBOX go = new CHECKBOX();
		go.setSize(300,200);
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		go.setVisible(true);
	}

}
