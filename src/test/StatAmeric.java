package test;

import java.util.Scanner;

public class StatAmeric extends Stat {
	public void getUserInput(Scanner input) {
		System.out.println("������� �̸�:");
		String name=input.next();
		this.setName(name);
		System.out.println("������� ����:");
		int age=input.nextInt();
		this.setAge(age);
		System.out.println("����(feet):");
		double height=input.nextDouble();
		this.setHeight(height);
		System.out.println("������(lb):");
		double weight=input.nextDouble();
		this.setWeight(weight);
	}
	public void printinfo() {
		System.out.println(name +" ������� ����: " + age + " ����(feet/inch): "+ height + " ������(lb): "+ weight);
		System.out.println("���� ��緮: " +(66.47+(13.75*weight*0.453) +5*height*30.48-(6.76*age)));
	}
}
