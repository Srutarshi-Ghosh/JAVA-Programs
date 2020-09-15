import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class GRAPHIC extends JFrame{
	private JLabel item1;
	public GRAPHIC() {
		super("TITLE");
		setLayout(new FlowLayout());
		
		item1 = new JLabel("THIS IS A SENTENCE");
		item1.setToolTipText("THIS IS ITEM");
		add(item1);
	}

	public static void main(String[] args) {
		GRAPHIC graphic =  new GRAPHIC();
		graphic.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		graphic.setSize(275,180);
		graphic.setVisible(true);
		
	}

}
