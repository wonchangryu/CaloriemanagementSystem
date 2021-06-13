package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import Exception.HeightException;
import Manager.CalorieManager;
import test.StatKor;
import test.UserInput;

public class Useradderlistener implements ActionListener {

	JTextField fieldname;
	JTextField fieldage;
	JTextField fieldheight;
	JTextField fieldweight;
	CalorieManager caloriemanager;
	
	public Useradderlistener(JTextField fieldname, JTextField fieldage, JTextField fieldheight,
			JTextField fieldweight, CalorieManager caloriemanager) {
		this.fieldname = fieldname;
		this.fieldage = fieldage;
		this.fieldheight = fieldheight;
		this.fieldweight = fieldweight;
		this.caloriemanager=caloriemanager;
	}
	
	public void actionPerformed(ActionEvent e) {
		
		UserInput user= new StatKor();
		try {
			user.setName(fieldname.getText());
			user.setAge(Integer.parseInt(fieldage.getText()));
			user.setHeight(Double.parseDouble(fieldheight.getText()));
			user.setWeight(Double.parseDouble(fieldweight.getText()));
			caloriemanager.addusers(user);
			putObject(caloriemanager,"caloriemanager.ser");
			user.printinfo();
			
			
		} 
		catch (HeightException e1) {
			e1.printStackTrace();
		}
	}
	
	public static void putObject(CalorieManager caloriemanager,String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out=new ObjectOutputStream(file);
			out.writeObject(caloriemanager);

			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
