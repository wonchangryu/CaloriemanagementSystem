package GUI;

import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Manager.CalorieManager;
import test.UserInput;

public class UserViewer extends JPanel {
	
	Windowframe frame;
	CalorieManager caloriemanager;
	
	public CalorieManager getCaloriemanager() {
		return caloriemanager;
	}

	public void setCaloriemanager(CalorieManager caloriemanager) {
		this.caloriemanager = caloriemanager;
		this.removeAll();
		
		DefaultTableModel model=new DefaultTableModel();
		model.addColumn("Name");
		model.addColumn("Age");
		model.addColumn("Height");
		model.addColumn("Weight");
		
		for(int i=0; i<caloriemanager.size();i++) {
			Vector row= new Vector();
			UserInput ui=caloriemanager.get(i);
			row.add(ui.getName());
			row.add(ui.getAge());
			row.add(ui.getHeight());
			row.add(ui.getWeight());
			model.addRow(row);
			
		}
		
		JTable table = new JTable(model);
		JScrollPane sp= new JScrollPane(table); 
		
		this.add(sp);
		
	}

	public UserViewer(Windowframe frame,CalorieManager caloriemanager) {
		this.frame=frame;
		this.caloriemanager=caloriemanager;
		
		System.out.println("***"+caloriemanager.size()+"***");
		
		DefaultTableModel model=new DefaultTableModel();
		model.addColumn("Name");
		model.addColumn("Age");
		model.addColumn("Height");
		model.addColumn("Weight");
		
		for(int i=0; i<caloriemanager.size();i++) {
			Vector row= new Vector();
			UserInput ui=caloriemanager.get(i);
			row.add(ui.getName());
			row.add(ui.getAge());
			row.add(ui.getHeight());
			row.add(ui.getWeight());
			model.addRow(row);
			
		}
		
		JTable table = new JTable(model);
		JScrollPane sp= new JScrollPane(table); 
		
		this.add(sp);
		
	}
}
