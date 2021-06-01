package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import GUI.UserViewer;
import GUI.Windowframe;

public class ButtonviewListener implements ActionListener {
	
	Windowframe frame;
	
	public ButtonviewListener(Windowframe frame) {
		this.frame=frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b=(JButton)e.getSource();
		UserViewer viewer = frame.getUserviewer();
		frame.setupPanel(viewer);
	}

}
