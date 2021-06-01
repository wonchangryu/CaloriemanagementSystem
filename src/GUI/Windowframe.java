package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Manager.CalorieManager;

public class Windowframe extends JFrame {
	
	MenuSelection menuselection;
	UserAdder useradder;
	UserViewer userviewer;
	CalorieManager caloriemanager;
	
	public Windowframe(CalorieManager caloriemanager) {
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.caloriemanager=caloriemanager;
		menuselection =new MenuSelection(this);
		useradder=new UserAdder(this);
		userviewer=new UserViewer(this,this.caloriemanager);
		
		this.setupPanel(menuselection);
		this.setVisible(true);
		
		
		
	}

	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	

	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public UserAdder getUseradder() {
		return useradder;
	}

	public void setUseradder(UserAdder useradder) {
		this.useradder = useradder;
	}

	public UserViewer getUserviewer() {
		return userviewer;
	}

	public void setUserviewer(UserViewer userviewer) {
		this.userviewer = userviewer;
	}

	
	

}
