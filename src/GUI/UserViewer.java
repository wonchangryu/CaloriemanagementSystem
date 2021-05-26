package GUI;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class UserViewer extends JFrame {
	
	public UserViewer() {
		DefaultTableModel model=new DefaultTableModel();
		model.addColumn("Name");
		model.addColumn("Age");
		model.addColumn("Height");
		model.addColumn("Weight");
		
		JTable table = new JTable(model);
		JScrollPane sp= new JScrollPane(table); 
		
		this.add(sp);
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		this.setVisible(true);
	}
}
