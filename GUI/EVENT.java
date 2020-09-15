import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
public class EVENT extends JFrame{
	
		private JTextField item1;
		private JTextField item2;
		private JTextField item3;
		private JPasswordField pass;
		
		public EVENT() {
			super("TITLE");
			setLayout(new FlowLayout());
			
			item1 = new JTextField(10);
			add(item1);
			
			item2 = new JTextField("ENTER TEXT HERE");
			add(item2);
			
			item3 = new JTextField("UNEDITABLE", 20);
			item3.setEditable(false);
			add(item3);
			
			pass = new JPasswordField("mypass");
			add(pass);
			
			thehandler handler = new thehandler();
			item1.addActionListener(handler);
			item2.addActionListener(handler);
			item3.addActionListener(handler);
			pass.addActionListener(handler);
			
		}
		private class thehandler implements ActionListener{
			public void actionPerformed(ActionEvent event) {
				String string = "";
				
				if(event.getSource()==item1)
					string=string.format("field 1: %s", event.getActionCommand());
				else if(event.getSource()==item2)
					string=string.format("field 2: %s", event.getActionCommand());
				else if(event.getSource()==item3)
					string=string.format("field 3: %s", event.getActionCommand());
				else if(event.getSource()==pass)
					string=string.format("password field is: %s", event.getActionCommand());
				
				JOptionPane.showMessageDialog(null, string);
				
			}
	}
		public static void main(String[] args) {
			EVENT bucky = new EVENT();
			bucky.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			bucky.setSize(350, 200);
			bucky.setVisible(true);
			
		}
}
