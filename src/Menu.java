import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CalorieManager caloriemanager = new CalorieManager(input);
		selectMenu(input,caloriemanager);
	}
	public static void selectMenu(Scanner input,CalorieManager caloriemanager) {
		int num = 0;
		while(num != 5) { 
			try{ShowMenu();
			num = input.nextInt();
			switch(num) {
			case 1:
				caloriemanager.addcalorie();
				break;
			case 2:
				caloriemanager.deleteuser();
				break;
			case 3: 
				caloriemanager.edit();
				break;
			case 4:
				caloriemanager.viewStats();
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
		System.out.println("1.Add calorie ");
		System.out.println("2.Delete calorie");
		System.out.println("3.Edit user");
		System.out.println("4.View users");
		System.out.println("5.Exit");
		System.out.println("Select one number between 1-5: ");
	}
}




