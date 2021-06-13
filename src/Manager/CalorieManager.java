package Manager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import test.Stat;
import test.StatAmeric;
import test.StatKor;
import test.Statunit;
import test.UserInput;

public class CalorieManager implements Serializable {
	

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6260178943990172816L;
	transient Scanner input;
	ArrayList<UserInput> stats=new ArrayList<UserInput>();
	CalorieManager(Scanner input){
		this.input = input;
	}
	
	public void addusers(String Name,String age,String height, String weight) {
		UserInput statInput = new StatKor(Statunit.Kor);
		statInput.getUserInput(input);
		stats.add(statInput);
	}
	
	public void addusers(UserInput userinput) {
		stats.add(userinput);
	}
	
	public void addusers() {
		int unit=0;
		UserInput statInput;
		while(unit !=1 && unit != 2) {
			try {
				show();
				unit = input.nextInt();
				if (unit==1) {
					statInput = new StatKor(Statunit.Kor);
					statInput.getUserInput(input);
					stats.add(statInput);
				}
				else if(unit==2) {
					statInput =new StatAmeric(Statunit.Americ);
					statInput.getUserInput(input);
					stats.add(statInput);
				}
				food();
			}
			catch(InputMismatchException e) {
				System.out.println("Error! Select one number between 1-5: ");
				if(input.hasNext()) {
					input.next();
				}
				unit=-1;
			}
		}
	}
	public void show() {
		System.out.println("1 for Kor(cm,kg)");
		System.out.println("2 for Americ(feet,lb)");
		System.out.println("Select unit between 1 and 2:");
	}

	public void deleteuser() {
		System.out.println("users name:");	
		String name = input.next();
		int index=findindex(name);
		removedata(index,name);
	}

	public int findindex(String name) {
		int index=-1;	
		for(int i=0; i<stats.size(); i++) {
			if(stats.get(i).getName().equals(name)) {
				index = i;
				break;	
			}	
		}
		return index;
	}
	public int removedata(int index,String name) {
		if(index>=0) {
			stats.remove(index);
			System.out.println(name+ " is deleted");
			return 1;
		}
		else{
			System.out.println("your stats have not been registerd");
			return -1;
		}
	}

	public void edit() {
		System.out.print("users name:");
		String name = input.next();
		for(int i=0; i<stats.size(); i++) {
			UserInput stat= stats.get(i);
			stat.setName(name);
			if(stat.getName().equals(name)) {
				show();
				int num=input.nextInt();
				if(num==1)
					stat.setKor(input);
				else if(num==2) 
					stat.setAmeric(input);
				else
					continue;
			}
		}	
	}


	public void viewStats() {
		for(int i=0; i<stats.size(); i++) {
			stats.get(i).printinfo();
		}
	}
	
	public int size() {
		return stats.size(); 
	}
	
	public UserInput get(int index) {
		return stats.get(index);
	}

	public void diet() {
		System.out.println("1.몬스터와퍼세트");
		System.out.println("2.짜장면 +탕수육");
		System.out.println("3.도미노피자(블랙앵거스 스테이크 3조각)");
		System.out.println("4.집밥");
		System.out.println("5.삶은 계란 2개 + 우유"); 
		System.out.println("6.라면"); 
		System.out.println("7.굶음"); 
	}
	public void food() {
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

}


