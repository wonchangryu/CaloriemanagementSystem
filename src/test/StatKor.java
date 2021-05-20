package test;

import java.util.Scanner;

public class StatKor extends Stat {
	public StatKor(Statunit unit){
		super(unit);
	}
	public StatKor(){
	
	}

	public void getUserInput(Scanner input) {
		setNameAge(input);
		setKor(input);
	}
	
	public void printinfo() { 
		 getUnitString();
	}
}
	