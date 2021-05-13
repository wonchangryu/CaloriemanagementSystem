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
		 getUnitString();
	}
	
}
