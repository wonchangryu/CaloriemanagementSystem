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
	protected Statunit unit=Statunit.Kor;
	protected double weight,height;
	protected int age;
	protected String name;
	protected String gender;
	
	public void getUserInput(Scanner input) {
		System.out.println("사용자의 이름:");
		String name=input.next();
		this.setName(name);
		System.out.println("사용자의 나이:");
		int age=input.nextInt();
		this.setAge(age);
		System.out.println("신장(cm):");
		double height=input.nextDouble();
		this.setHeight(height);
		System.out.println("몸무게(kg):");
		double weight=input.nextDouble();
		this.setWeight(weight);
	}
	public void printinfo() { 
		String unit ="none";
		switch(this.unit) {
		case Kor:
			unit="한국식단위";
			System.out.println("단위: "+unit+" 이름: " + name + " 사용자의 나이: " + age + " 신장(cm): "+ height + " 몸무게(kg): "+ weight);
			System.out.println("기초 대사량: " +(66.47+(13.75*weight) +5*height-(6.76*age))+" kcal");
			break; 
		case Americ:
			unit="미국식단위";
			System.out.println("단위: "+unit+ " 이름: "+ name + " 사용자의 나이: " + age + " 신장(feet): "+ height + " 몸무게(lb): "+ weight);
			System.out.println("기초 대사량: " +(66.47+(13.75*weight*0.453) +5*height*30.48-(6.76*age)));
			break;
		default:
		}
		
		
	}
}
