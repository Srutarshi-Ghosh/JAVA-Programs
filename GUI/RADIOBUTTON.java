import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class RADIOBUTTON extends JFrame{

	private JTextField tf;
	private Font pf;
	private Font bf;
	private Font itf;
	private Font bif;
	private JRadioButton pb;
	private JRadioButton bb;
	private JRadioButton itb;
	private JRadioButton bib;
	private ButtonGroup group;
	
	public RADIOBUTTON(){
		super("RADIOBUTTON");
		setLayout(new FlowLayout());
		
		tf = new JTextField("DRAGON", 25);
		add(tf);
		pb = new JRadioButton("PLAIN", true);
		add(pb);
		bb = new JRadioButton("BOLD", false);
		add(bb);
		itb = new JRadioButton("ITALICS", false);
		add(itb);
		bib = new JRadioButton("BOLD-ITALICS", false);
		add(bib);
		
		group = new ButtonGroup();
		group.add(pb);
		group.add(bb);
		group.add(itb);
		group.add(bib);
		
		pf = new Font("Serif", Font.PLAIN, 14);
		bf = new Font("Serif", Font.BOLD, 14);
		itf = new Font("Serif", Font.ITALIC, 14);
		bif = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
		
		pb.addItemListener(new HandlerClass(pf));
		bb.addItemListener(new HandlerClass(bf));
		itb.addItemListener(new HandlerClass(itf));
		bib.addItemListener(new HandlerClass(bif));
		
	}
	
	private class HandlerClass implements ItemListener{
		private Font font;
		
		public HandlerClass(Font f) 
		{
			font = f;
		}
	
		public void itemStateChanged(ItemEvent e) {
			tf.setFont(font);
		}
		}
		
	public static void main(String[] args) {
		RADIOBUTTON go = new RADIOBUTTON();
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		go.setSize(300,500);
		go.setVisible(true);
	}

}
