import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import Log.EventLogger;

public class Menu {
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		CalorieManager caloriemanager = getObject("caloriemanager.ser"); 
		if(caloriemanager==null) {
			caloriemanager=new CalorieManager(input); 
		}
		selectMenu(input,caloriemanager);
		putObject(caloriemanager,"caloriemanager.ser");
	}
	public static void selectMenu(Scanner input,CalorieManager caloriemanager) {
		int num = 0;
		while(num != 5) { 
			try{ShowMenu();
			num = input.nextInt();
			switch(num) {
			case 1:
				caloriemanager.addusers();
				logger.log("add an user");
				break;
			case 2:
				caloriemanager.deleteuser();
				logger.log("delete an user");
				break;
			case 3: 
				caloriemanager.edit();
				logger.log("edit an user");
				break;
			case 4:
				caloriemanager.viewStats();
				logger.log("view an user");
				break;
			default:
				continue;
			}
			}
			catch(InputMismatchException e) {
				System.out.println("Error! Select one number between 1-5: ");
				if(input.hasNext()) {
					input.next();
				}
				num=-1;
			}
		}

	}
	public static void ShowMenu() {
		System.out.println("*** Calorie management System Menu ***");
		System.out.println("1.Add users ");
		System.out.println("2.Delete users");
		System.out.println("3.Edit user");
		System.out.println("4.View users");
		System.out.println("5.Exit");
		System.out.println("Select one number between 1-5: ");
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




