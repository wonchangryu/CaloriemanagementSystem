package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import GUI.UserAdder;
import GUI.Windowframe;

public class ButtonaddListener implements ActionListener {
	
	Windowframe frame;
	
	public ButtonaddListener(Windowframe frame) {
		this.frame=frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b=(JButton)e.getSource();
		UserAdder adder = frame.getUseradder();
		frame.setupPanel(adder);
	}

}
