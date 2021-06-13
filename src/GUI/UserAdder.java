package GUI;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import Listener.UseraddercancelListener;
import Listener.Useradderlistener;
import Manager.CalorieManager;

public class UserAdder extends JPanel {
	
	Windowframe frame;
	CalorieManager caloriemanager;
	
	public UserAdder(Windowframe frame, CalorieManager caloriemanager) {
		this.frame=frame;
		JPanel p = new JPanel();
		p.setLayout(new SpringLayout());
		
		JLabel name=new JLabel("Name: ",JLabel.TRAILING);
		JTextField fieldname = new JTextField(10);
		name.setLabelFor(fieldname);
		p.add(name);
		p.add(fieldname);
		
		JLabel age=new JLabel("Age: ",JLabel.TRAILING);
		JTextField fieldage = new JTextField(10);
		age.setLabelFor(fieldage);
		p.add(age);
		p.add(fieldage);
		
		JLabel height=new JLabel("Height: ",JLabel.TRAILING);
		JTextField fieldheight = new JTextField(10);
		height.setLabelFor(fieldname);
		p.add(height);
		p.add(fieldheight);
		
		JLabel weight=new JLabel("Weight: ",JLabel.TRAILING);
		JTextField fieldweight = new JTextField(10);
		weight.setLabelFor(fieldname);
		p.add(weight);
		p.add(fieldweight);
		
		JButton savebutton =new JButton("save");
		savebutton.addActionListener(new Useradderlistener(fieldname,fieldage,fieldheight,fieldweight,caloriemanager));
		JButton cancelbutton =new JButton("cancel");
		cancelbutton.addActionListener(new UseraddercancelListener(frame));
		p.add(savebutton);
		p.add(cancelbutton);
		
		SpringUtilities.makeCompactGrid(p,5,2,6,6,6,6);
		
		this.add(p);
		this.setVisible(true);
	}

}
