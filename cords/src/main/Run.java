package main;

public class Run {
	
	public static void main(String args[]) {
		Cords cords = new Cords();
		cords.getInput();
		cords.testExit();
		cords.parseInput();
		cords.printCoords();
		cords.close("Program compleate. Have a nice day.");
	}
}