package test;

import java.util.Scanner;

public class StatAmeric extends Stat {
	public StatAmeric(Statunit unit){
		super(unit);
	}
	public StatAmeric(){
	
	}
	public void getUserInput(Scanner input) { 
		setNameAge(input);
		setAmeric(input);
	}
	
	public void printinfo() { 
		this.unit=Statunit.Americ;
		System.out.println("단위: "+unit+" 이름: " + name + " 사용자의 나이: " + age + " 신장(cm): "+ height + " 몸무게(kg): "+ weight);
		System.out.println("기초 대사량: " +(66.47+(13.75*weight) +5*height-(6.76*age))+" kcal");
	}
	
}
