import java.util.Scanner;

public class Calorie {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while(num != 5) {
			System.out.println("*** Calorie management System Menu ***");
			System.out.println("1.Add users");
			System.out.println("2.Delete users");
			System.out.println("3.Edit users");
			System.out.println("4.View users");
			System.out.println("5.Exit");
			System.out.println("Select one number between 1-5: ");
			num = input.nextInt();
			switch(num) {
			case 1: 	
				System.out.println("Your height(cm): ");
				double height = input.nextDouble();
				System.out.println("Your weight(kg): ");
				double weight = input.nextDouble();
				break;
			case 2:
			case 3:
			case 4:
				
	          }
		}
	}
}
