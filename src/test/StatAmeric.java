package test;

import java.util.Scanner;

public class StatAmeric extends Stat {
	public void getUserInput(Scanner input) {
		System.out.println("사용자의 이름:");
		String name=input.next();
		this.setName(name);
		System.out.println("사용자의 나이:");
		int age=input.nextInt();
		this.setAge(age);
		System.out.println("신장(feet):");
		double height=input.nextDouble();
		this.setHeight(height);
		System.out.println("몸무게(lb):");
		double weight=input.nextDouble();
		this.setWeight(weight);
	}
	public void printinfo() {
		System.out.println(name +" 사용자의 나이: " + age + " 신장(feet/inch): "+ height + " 몸무게(lb): "+ weight);
		System.out.println("기초 대사량: " +(66.47+(13.75*weight*0.453) +5*height*30.48-(6.76*age)));
	}
}
