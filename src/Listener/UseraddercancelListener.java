package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import GUI.UserAdder;
import GUI.Windowframe;

public class UseraddercancelListener implements ActionListener {
	
	Windowframe frame;
	
	public UseraddercancelListener(Windowframe frame) {
		this.frame=frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getMenuselection());
		frame.revalidate();
		frame.repaint();
	}

}
