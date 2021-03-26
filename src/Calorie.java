import java.util.Scanner;

public class Calorie {

	public static void main(String[] args) {
		int num = 0;
		
		Scanner input = new Scanner(System.in);
		
		while(num != 5) {
			System.out.println("*** Calorie management System Menu ***");
			System.out.println("1.Add calorie ");
			System.out.println("2.Delete calorie");
			System.out.println("3.Edit users");
			System.out.println("4.View users");
			System.out.println("5.Exit");
			System.out.println("Select one number between 1-5: ");
			num = input.nextInt();
			switch(num) {
			case 1:
				addcalorie();	
				
			case 2:
				deletecalorie();	
			case 3:
				edit();
			case 4:
				view();
				
	          }
		}
	}
	public static void addcalorie() {
		Scanner input = new Scanner(System.in);
		System.out.println("사용자의 나이:  ");
		double age = input.nextDouble();
		System.out.println("신장(cm): ");
		double height = input.nextDouble();
		System.out.println("몸무게(kg): ");
		double weight = input.nextDouble();
		System.out.print(66.47+(13.75*weight) +5*height-(6.76*age) + "kcal가 당신의 기초대사량입니다.");
		double a =66.47+(13.75*weight) +5*height-(6.76*age);
		System.out.println("***  오늘 아침 식단 ***");
		System.out.println("1.집밥"); 
		System.out.println("2.굶음"); 
		int morning = input.nextInt();
		if(morning ==1) {
			System.out.println("549kcal입니다");
		}
		else{
			System.out.println("0kcal입니다");
		}
		System.out.println("아침에 섭취한 칼로리를 입력하세요");
		int m = input.nextInt();
		
		System.out.println("***  오늘 점심 식단 ***");
		diet();
		int lunch = input.nextInt();
		if(lunch==1) {
			System.out.println("1400kcal입니다");
		}
		else if(lunch==2) {
			System.out.println("1200kcal입니다");
		}
		else if(lunch ==3) {
			System.out.println("975kcal입니다");
		}
		else if(lunch==4) {
			System.out.println("545kcal입니다");
		}
		else if(lunch ==5) {
			System.out.println("450kcal입니다");
		}
		else if(lunch ==6) {
			System.out.println("500kcal입니다");
		}
		else {
			System.out.println("0kcal입니다");
		}
		System.out.println("점심에 섭취한 칼로리를 입력하세요");
		int l = input.nextInt();
		
		System.out.println("***  오늘 저녁 식단 ***");
		diet();
		int dinner = input.nextInt();
		if(dinner==1) {
			System.out.println("1400kcal입니다");
		}
		else if(dinner==2) {
			System.out.println("1200kcal입니다");
		}
		else if(dinner ==3) {
			System.out.println("975kcal입니다");
		}
		else if(dinner==4) {
			System.out.println("545kcal입니다");
		}
		else if(dinner ==5) {
			System.out.println("450kcal입니다");
		}
		else if(dinner==6) {
			System.out.println("500kcal입니다");
		}
		else {
			System.out.println("0kcal입니다");
		}
		System.out.println("저녁에 섭취한 칼로리를 입력하세요");
		int d = input.nextInt();
		System.out.println("총 섭취한 칼로리 양입니다: " + (m+l+d));
		
		}
		
	public static void deletecalorie() {
		addcalorie();
	}
	public static void edit() {
		Scanner input = new Scanner(System.in); //사용자의 신체정보 수정
		System.out.println("사용자의 나이:  ");
		double age = input.nextDouble();
		System.out.println("신장(cm): ");
		double height = input.nextDouble();
		System.out.println("몸무게(kg): ");
		double weight = input.nextDouble();
		System.out.print(66.47+(13.75*weight) +5*height-(6.76*age) + "kcal가 당신의 기초대사량입니다.");
		double a =66.47+(13.75*weight) +5*height-(6.76*age);
		System.out.print("나이: " +age);
		System.out.print("신장(cm): " +height);
		System.out.print("몸무게(kg): " +weight);
		System.out.print("기초대사량(kcal): " +a);
		
	}
	public static void view() {
		edit();
	}
	public static void diet() {
		System.out.println("1.몬스터와퍼세트");
		System.out.println("2.짜장면 +탕수육");
		System.out.println("3.도미노피자(블랙앵거스 스테이크 3조각)");
		System.out.println("4.집밥");
		System.out.println("5.삶은 계란 2개 + 우유"); 
		System.out.println("6.라면"); 
		System.out.println("7.굶음"); 
	}

}
	

