package test;

import java.util.Scanner;

public class Stat {
	public Stat() {

	}

	public Stat(String name,int age,double height ,double weight) {
		this.name = name;
		this.weight=weight;
		this.height=height;
		this.age=age;
	}

	public Statunit getUnit() {
		return unit;
	}

	public void setUnit(Statunit unit) {
		this.unit = unit;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	protected Statunit unit = Statunit.Kor;
	protected double weight,height;
	protected int age;
	protected String name;

	public void printinfo() {
		System.out.println(name +" ������� ����: " + age + " ����(cm): "+ height + " ������(kg): "+ weight);
		System.out.println("���� ��緮: " +(66.47+(13.75*weight) +5*height-(6.76*age)));
	}
	public void getUserInput(Scanner input) {
		System.out.println("������� �̸�:");
		String name=input.next();
		this.setName(name);
		System.out.println("������� ����:");
		int age=input.nextInt();
		this.setAge(age);
		System.out.println("����(cm):");
		double height=input.nextDouble();
		this.setHeight(height);
		System.out.println("������(kg):");
		double weight=input.nextDouble();
		this.setWeight(weight);
	}
}
