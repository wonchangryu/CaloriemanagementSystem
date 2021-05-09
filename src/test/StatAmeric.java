package test;

import java.util.Scanner;

public class StatAmeric extends Stat implements UserInput{
	public StatAmeric(Statunit unit){
		this.unit = unit;
	}
	public StatAmeric(){
	
	}
	public void getUserInput2(Scanner input) {
		System.out.println("사용자의 이름:");
		String name=input.next();
		this.setName(name);
		System.out.println("사용자의 나이:");
		int age=input.nextInt();
		this.setAge(age);
		System.out.println("신장(cm)로 입력해주세요:");
		double height=(input.nextDouble())*0.0328;
		System.out.println("단위변환된 신장(feet): "+height);
		this.setHeight(height);
		System.out.println("몸무게(kg)로 입력해주세요:");
		double weight=(input.nextDouble())*2.204;
		System.out.println("단위변환된 몸무게(lb): "+weight);
		this.setWeight(weight);
	}
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
