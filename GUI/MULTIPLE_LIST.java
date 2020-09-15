import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class MULTIPLE_LIST extends JFrame{
	
	private JList left;
	private JList right;
	private JButton move;
	private static String[] meat = {"CHICKEN", "FISH", "PORK", "HAM", "BEEF", "LAMB"};
		
	public MULTIPLE_LIST() {
		super("LIST");
		setLayout(new FlowLayout());
		
		left = new JList(meat);
		left.setVisibleRowCount(3);
		left.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add( new JScrollPane(left));
		
		move = new JButton("MOVE -->");
		move.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					right.setListData(left.getSelectedValues());
				}
			}
		);
		add(move);
		
		right = new JList();
		right.setVisibleRowCount(3);
		right.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		right.setFixedCellHeight(45);
		right.setFixedCellWidth(100);
		
		add(new JScrollPane(right));
		
	}
	public static void main(String[] args) {
		MULTIPLE_LIST go = new MULTIPLE_LIST();
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		go.setSize(300,300);
		go.setVisible(true);
	}

}
