package test;

import java.util.Scanner;

public class StatAmeric extends Stat {
	public StatAmeric(Statunit unit){
		this.unit = unit;
	}
	public void getUserInput(Scanner input) {
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
	public void getUserInput2(Scanner input) {
		System.out.println("사용자의 이름:");
		String name=input.next();
		this.setName(name);
		System.out.println("사용자의 나이:");
		int age=input.nextInt();
		this.setAge(age);
		System.out.println("신장(feet):");
		double height=input.nextDouble();
		this.setHeight(height);
		System.out.println("몸무게(pound):");
		double weight=input.nextDouble();
		this.setWeight(weight);
	}
	
	
	
}
