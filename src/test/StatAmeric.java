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
		System.out.println("����(cm)�� �Է����ּ���:");
		double height=(input.nextDouble())*0.0328;
		System.out.println("������ȯ�� ����(feet): "+height);
		this.setHeight(height);
		System.out.println("������(kg)�� �Է����ּ���:");
		double weight=(input.nextDouble())*2.204;
		System.out.println("������ȯ�� ������(lb): "+weight);
		this.setWeight(weight);
	}
	public void getUserInput2(Scanner input) {
		System.out.println("������� �̸�:");
		String name=input.next();
		this.setName(name);
		System.out.println("������� ����:");
		int age=input.nextInt();
		this.setAge(age);
		System.out.println("����(feet):");
		double height=input.nextDouble();
		this.setHeight(height);
		System.out.println("������(pound):");
		double weight=input.nextDouble();
		this.setWeight(weight);
	}
	
	
	
}
