import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class COMBOBOX extends JFrame{

	private JComboBox box;
	private JLabel pic;
	
	private static String[] filename = {"wings.png", "moon.jpg"};
	private Icon[] pics = {new ImageIcon(getClass().getResource(filename[0])), new ImageIcon(getClass().getResource(filename[1]))};
	
	public COMBOBOX() {
		super("COMBOBOX");
		setLayout (new FlowLayout());
		
		box = new JComboBox(filename);
		handlerClass handler = new handlerClass();
		box.addItemListener(handler);
		
		add(box);
		pic = new JLabel(pics[0]);
		add(pic);
	}
	
	private class handlerClass implements ItemListener {

		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange()==ItemEvent.SELECTED) {
				pic.setIcon(pics[box.getSelectedIndex()]);
			}
			
		}
		
	}

	public static void main(String[] args) {
		COMBOBOX go = new COMBOBOX();
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		go.setSize(300,500);
		go.setVisible(true);
	}
	}


