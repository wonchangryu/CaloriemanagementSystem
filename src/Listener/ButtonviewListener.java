package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import GUI.UserViewer;
import GUI.Windowframe;
import Manager.CalorieManager;

public class ButtonviewListener implements ActionListener {
	
	Windowframe frame;

	
	
	public ButtonviewListener(Windowframe frame) {
		this.frame=frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		UserViewer viewer = frame.getUserviewer();
		CalorieManager caloriemanager = getObject("caloriemanager.ser"); 
		viewer.setCaloriemanager(caloriemanager);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(viewer);
		frame.revalidate();
		frame.repaint();
	}
	
	public static CalorieManager getObject(String filename) {
		CalorieManager caloriemanager=null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in=new ObjectInputStream(file);
			caloriemanager=(CalorieManager)in.readObject();
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return caloriemanager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return caloriemanager;
	}
}
