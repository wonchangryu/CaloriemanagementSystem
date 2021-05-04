package test;
import java.util.Scanner;
public class Stat {
	public Stat() {
	}
	public Stat(Statunit unit){
		this.unit = unit;
	}
	public Stat(String name,int age,double height ,double weight) {
		this.name = name;
		this.weight=weight;
		this.height=height;
		this.age=age;
	}
	public Stat(Statunit unit,String name,int age,double height ,double weight) {
		this.unit =unit;
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
	protected Statunit unit;
	protected double weight,height;
	protected int age;
	protected String name;
	protected String gender;
	
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
	public void printinfo() { 
		String unit ="none";
		switch(this.unit) {
		case Kor:
			unit="�ѱ��Ĵ���";
			System.out.println("����: "+unit+" �̸�: " + name + " ������� ����: " + age + " ����(cm): "+ height + " ������(kg): "+ weight);
			System.out.println("���� ��緮: " +(66.47+(13.75*weight) +5*height-(6.76*age))+" kcal");
			break; 
		case Americ:
			unit="�̱��Ĵ���";
			System.out.println("����: "+unit+ " �̸�: "+ name + " ������� ����: " + age + " ����(feet): "+ height + " ������(lb): "+ weight);
			System.out.println("���� ��緮: " +(66.47+(13.75*weight*0.453) +5*height*30.48-(6.76*age)));
			break;
		default:
		}
		
		
	}
}
