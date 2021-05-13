import java.util.Scanner;

public class Calorie {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		CalorieManager caloriemanager = new CalorieManager(input);
		while(num != 5) { 
			ShowMenu();
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




