package test;

import java.util.Scanner;

public interface UserInput {
	public void getUserInput(Scanner input);
	public String getName();
	public void printinfo();
	public void setName(String name);
	public void setHeight(double height);
	public void setWeight(double weight);
	public Statunit getUnit();
}
