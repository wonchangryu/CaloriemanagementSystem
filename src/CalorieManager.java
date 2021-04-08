import java.util.ArrayList;
import java.util.Scanner;

import test.Stat;
import test.StatAmeric;

public class CalorieManager {
	Scanner input;
	ArrayList<Stat> stats=new ArrayList<Stat>();
	CalorieManager(Scanner input){
		this.input = input;
	}
	public void addcalorie() {
		int unit=0;
		Stat stat;
		while(unit !=1 && unit != 2) {
			System.out.println("1 for Kor(cm,kg)");
			System.out.println("2 for Americ(feet,lb)");
			System.out.println("Select unit between 1 and 2:");
			unit = input.nextInt();
			if (unit==1) {
				stat = new Stat();
				stat.getUserInput(input);
				stats.add(stat);
				break;
			}
			else if(unit==2) {
				stat = new StatAmeric();
				stat.getUserInput(input);
				stats.add(stat);
				break;
			}
			else {
				System.out.println("Select unit between 1 and 2:");
			}
		}
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
		
	public void deleteuser() {
		System.out.println("users name:");	
		String name = input.next();
		int index=-1;	
		for(int i=0; i<stats.size(); i++) {
			if(stats.get(i).getName().equals(name)) {
				index = i;
				break;	
			}	
		}
		if(index>=0) {
			stats.remove(index);
			System.out.println(name+ " is deleted");
		}
		
		else{
			System.out.println("your stats have not been registerd");
			return;
		}
		
	}
	public void edit() {
		System.out.print("users name:");
		String name = input.next();
		for(int i=0; i<stats.size(); i++) {
			Stat stat = new Stat();
			stat.setName(name);
			if(stat.getName().equals(name)) {
				System.out.println("신장:");
				double height=input.nextDouble();
				stat.setHeight(height);
				System.out.println("몸무게:");
				double weight=input.nextDouble();
				stat.setWeight(weight);
				System.out.println("edit:" +" height= "+ height + " weight= "+weight);
			}
		break;	
		}
	}
	public void viewStats() {
		for(int i=0; i<stats.size(); i++) {
			stats.get(i).printinfo();
		}
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
	

