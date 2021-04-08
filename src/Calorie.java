import java.util.Scanner;

public class Calorie {

	public static void main(String[] args) {

		int num = 0;
		Scanner input = new Scanner(System.in);
		CalorieManager caloriemanager = new CalorieManager(input);
		while(num != 5) { 
			System.out.println("*** Calorie management System Menu ***");
			System.out.println("1.Add calorie ");
			System.out.println("2.Delete calorie");
			System.out.println("3.Edit user");
			System.out.println("4.View users");
			System.out.println("5.Exit");
			System.out.println("Select one number between 1-5: ");
			num = input.nextInt();
			if(num==1) {
				caloriemanager.addcalorie();}	
			else if(num==2) {
				caloriemanager.deleteuser();}
			else if(num==3) {
				caloriemanager.edit();}
			else if(num==4) {
				caloriemanager.viewStats();
			}
			else {
				continue;
			}
		}
	}
}




