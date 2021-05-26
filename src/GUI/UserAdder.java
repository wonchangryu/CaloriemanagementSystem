package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class UserAdder extends JFrame {

	public UserAdder() {
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
		
		p.add(new JButton("save"));
		p.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(p,5,2,6,6,6,6);
		 
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(p);
		this.setVisible(true);
	}

}
