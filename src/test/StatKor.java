package test;

import java.util.Scanner;

public class StatKor extends Stat {
	public StatKor(Statunit unit){
		super(unit);
	}
	public StatKor(){

	}

	public void getUserInput(Scanner input) {
		setNameAge(input);
		setKor(input);
	}

	public void printinfo() { 
		this.unit=Statunit.Kor;
		System.out.println("����: "+unit+" �̸�: " + name + " ������� ����: " + age + " ����(cm): "+ height + " ������(kg): "+ weight);
		System.out.println("���� ��緮: " +(66.47+(13.75*weight) +5*height-(6.76*age))+" kcal");
	}
}
