package test;
import java.util.Scanner;
public abstract class Stat implements UserInput{
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
	public abstract void printinfo();
	public void setAmeric(Scanner input) {
		this.unit=Statunit.Americ;
		System.out.println("����(cm):");
		double height=input.nextDouble();
		this.setHeight(height*0.0328);
		System.out.println("������(kg):");
		double weight=input.nextDouble();
		this.setWeight(weight*2.204);
		System.out.println(" height(feet)= "+ height*0.0328 + " weight(lb)= "+weight*2.204);
	}
	public void setKor(Scanner input) {
		this.unit=Statunit.Kor;
		System.out.println("����:");
		double height=input.nextDouble();
		this.setHeight(height);
		System.out.println("������:");
		double weight=input.nextDouble();
		this.setWeight(weight);
		System.out.println(" height(cm)= "+ height + " weight(kg)= "+weight);
	}
	public String getUnitString() {
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
		return unit;
	}
	public void setNameAge(Scanner input){
		System.out.println("������� �̸�:");
		String name=input.next();
		this.setName(name);
		System.out.println("������� ����:");
		int age=input.nextInt();
		this.setAge(age);
	}
	
}
