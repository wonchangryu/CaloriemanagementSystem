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
		System.out.println("1.??????????????");
		System.out.println("2.?????? +??????");
		System.out.println("3.??????????(?????????? ???????? 3????)");
		System.out.println("4.????");
		System.out.println("5.???? ???? 2?? + ????"); 
		System.out.println("6.????"); 
		System.out.println("7.????"); 
	}
	public void food() {
		System.out.println("***  ???? ???? ???? ***");
		System.out.println("1.????"); 
		System.out.println("2.????"); 
		int morning = input.nextInt();
		if(morning ==1) {
			System.out.println("549kcal??????");
		}
		else{
			System.out.println("0kcal??????");
		}
		System.out.println("?????? ?????? ???????? ??????????");
		int m = input.nextInt();

		System.out.println("***  ???? ???? ???? ***");
		diet();
		int lunch = input.nextInt();
		if(lunch==1) {
			System.out.println("1400kcal??????");
		}
		else if(lunch==2) {
			System.out.println("1200kcal??????");
		}
		else if(lunch ==3) {
			System.out.println("975kcal??????");
		}
		else if(lunch==4) {
			System.out.println("545kcal??????");
		}
		else if(lunch ==5) {
			System.out.println("450kcal??????");
		}
		else if(lunch ==6) {
			System.out.println("500kcal??????");
		}
		else {
			System.out.println("0kcal??????");
		}
		System.out.println("?????? ?????? ???????? ??????????");
		int l = input.nextInt();

		System.out.println("***  ???? ???? ???? ***");
		diet();
		int dinner = input.nextInt();
		if(dinner==1) {
			System.out.println("1400kcal??????");
		}
		else if(dinner==2) {
			System.out.println("1200kcal??????");
		}
		else if(dinner ==3) {
			System.out.println("975kcal??????");
		}
		else if(dinner==4) {
			System.out.println("545kcal??????");
		}
		else if(dinner ==5) {
			System.out.println("450kcal??????");
		}
		else if(dinner==6) {
			System.out.println("500kcal??????");
		}
		else {
			System.out.println("0kcal??????");
		}
		System.out.println("?????? ?????? ???????? ??????????");
		int d = input.nextInt();
		System.out.println("?? ?????? ?????? ????????: " + (m+l+d));
	}

}


