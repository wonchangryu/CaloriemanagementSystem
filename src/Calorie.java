import java.util.Scanner;

public class Calorie {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while(num != 5) {
			System.out.println("*** Calorie management System Menu ***");
			System.out.println("1.사용자 기초대사량 구하기");
			System.out.println("2.먹은 음식");
			System.out.println("3.Edit users");
			System.out.println("4.View users");
			System.out.println("5.Exit");
			System.out.println("Select one number between 1-5: ");
			num = input.nextInt();
			switch(num) {
			case 1:
				System.out.println("사용자의 나이:  ");
				double age = input.nextDouble();
				System.out.println("신장(cm): ");
				double height = input.nextDouble();
				System.out.println("몸무게(kg): ");
				double weight = input.nextDouble();
				System.out.print(66.47+(13.75*weight) +5*height-(6.76*age) + "kcal가 당신의 기초대사량입니다.");
				break;
			case 2:
				System.out.println("먹은 음식:  "); //기본적인 밥,국,김치를 제외한 추가적인 음식이나 간식 만을 입력한다.
				
			case 3:
			case 4:
				
	          }
		}
	}
}
