package test;

import java.util.Scanner;

import Exception.HeightException;

public interface UserInput {
	public void getUserInput(Scanner input);
	public String getName();
	public void printinfo();
	public void setName(String name);
	public void setHeight(double height) throws HeightException ;
	public void setWeight(double weight);
	public Statunit getUnit();
	public void setKor(Scanner input);
	public void setAmeric(Scanner input);
}
