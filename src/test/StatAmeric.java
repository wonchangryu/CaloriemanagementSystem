package test;

import java.util.Scanner;

public class StatAmeric extends Stat {
	public StatAmeric(Statunit unit){
		super(unit);
	}
	public StatAmeric(){
	
	}
	public void getUserInput(Scanner input) { 
		setNameAge(input);
		setAmeric(input);
	}
	
	public void printinfo() { 
		this.unit=Statunit.Americ;
		System.out.println("����: "+unit+" �̸�: " + name + " ������� ����: " + age + " ����(cm): "+ height + " ������(kg): "+ weight);
		System.out.println("���� ��緮: " +(66.47+(13.75*weight) +5*height-(6.76*age))+" kcal");
	}
	
}
