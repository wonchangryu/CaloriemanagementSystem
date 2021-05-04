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
				StatAmeric s=new StatAmeric();
				System.out.println("1 ���� �� pound�� feet������ �𸨴ϴ�");
				System.out.println("2 ���� �� pound�� feet������ �дϴ�");
				System.out.println("Select unit between 1 and 2:");
				int num=input.nextInt();
				if(num==1) {
				s.getUserInput(input);
				stats.add(s);
				}
				else if(num==2) {
					s.getUserInput2(input);
					stats.add(s);
				}
				break;
			}
			else {
				System.out.println("Select unit between 1 and 2:");
			}
		}
		System.out.println("***  ���� ��ħ �Ĵ� ***");
		System.out.println("1.����"); 
		System.out.println("2.����"); 
		int morning = input.nextInt();
		if(morning ==1) {
			System.out.println("549kcal�Դϴ�");
		}
		else{
			System.out.println("0kcal�Դϴ�");
		}
		System.out.println("��ħ�� ������ Į�θ��� �Է��ϼ���");
		int m = input.nextInt();
		
		System.out.println("***  ���� ���� �Ĵ� ***");
		diet();
		int lunch = input.nextInt();
		if(lunch==1) {
			System.out.println("1400kcal�Դϴ�");
		}
		else if(lunch==2) {
			System.out.println("1200kcal�Դϴ�");
		}
		else if(lunch ==3) {
			System.out.println("975kcal�Դϴ�");
		}
		else if(lunch==4) {
			System.out.println("545kcal�Դϴ�");
		}
		else if(lunch ==5) {
			System.out.println("450kcal�Դϴ�");
		}
		else if(lunch ==6) {
			System.out.println("500kcal�Դϴ�");
		}
		else {
			System.out.println("0kcal�Դϴ�");
		}
		System.out.println("���ɿ� ������ Į�θ��� �Է��ϼ���");
		int l = input.nextInt();
		
		System.out.println("***  ���� ���� �Ĵ� ***");
		diet();
		int dinner = input.nextInt();
		if(dinner==1) {
			System.out.println("1400kcal�Դϴ�");
		}
		else if(dinner==2) {
			System.out.println("1200kcal�Դϴ�");
		}
		else if(dinner ==3) {
			System.out.println("975kcal�Դϴ�");
		}
		else if(dinner==4) {
			System.out.println("545kcal�Դϴ�");
		}
		else if(dinner ==5) {
			System.out.println("450kcal�Դϴ�");
		}
		else if(dinner==6) {
			System.out.println("500kcal�Դϴ�");
		}
		else {
			System.out.println("0kcal�Դϴ�");
		}
		System.out.println("���ῡ ������ Į�θ��� �Է��ϼ���");
		int d = input.nextInt();
		System.out.println("�� ������ Į�θ� ���Դϴ�: " + (m+l+d));
		
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
				System.out.println("����:");
				double height=input.nextDouble();
				stat.setHeight(height);
				System.out.println("������:");
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
		System.out.println("1.���Ϳ��ۼ�Ʈ");
		System.out.println("2.¥��� +������");
		System.out.println("3.���̳�����(���ްŽ� ������ũ 3����)");
		System.out.println("4.����");
		System.out.println("5.���� ��� 2�� + ����"); 
		System.out.println("6.���"); 
		System.out.println("7.����"); 
	}
	

}
	

