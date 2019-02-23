package intro_to_array_lists;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton button = new JButton();
JButton button2 = new JButton();
	public static void main(String[] args) {
		GuestBook q = new GuestBook();
		q.play();
	}
	public void play() {
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	frame.add(panel);
	panel.add(button);
	panel.add(button2);
	button.setText("Add Name");
	button2.setText("View Names");
	button.addActionListener(this);
	button2.addActionListener(this);	
	
	
	frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object r = e.getSource();
		if (r == button) {
			add();
		}
		else {
			View();
		}
	}
	public void View() {
		JOptionPane.showMessageDialog(null, "");
	}
	
	
	
	
	public void add() {
		String name = JOptionPane.showInputDialog("Insert a guest's name.");
	}
	
	
	
	
	
	
	
	
}
