package main;

import java.util.Scanner;

public class Cords {
	private String mInX;
	private String mInY;
	private Scanner mScanner;
	private int mX;
	private int mY;
	
	public Cords() {
		mScanner = new Scanner(System.in);
	}
	
	public void getInput() {
		System.out.println("Please enter array width");
		mInX = mScanner.nextLine();
		System.out.println("Please enter array height");
		mInY = mScanner.nextLine();
	}
	
	public void parseInput() {
		try {
			mX = Integer.parseInt(mInX);
			mY = Integer.parseInt(mInY);
		} catch (NumberFormatException nfe){
			close("you entered a non valid input. System shutdown, Have a nice day");
		}
	}
	
	public void printCoords() {
		String[][] cords = new String[mX][mY];
				
		for(int i = 0; i < mX; i++) {
			for(int j = 0; j < mY; j++) {
				cords[i][j] = "(" + Integer.toString(i) + "," + Integer.toString(j) + ")";
				System.out.print(cords[i][j]);
			}
			System.out.println();
		}
	}
	
	public void testExit() {
		if(mInX.equalsIgnoreCase("exit")||
		   mInX.equalsIgnoreCase("stop")||
	       mInX.equalsIgnoreCase("stop")||
		   mInX.equalsIgnoreCase("bye")||
		   mInY.equalsIgnoreCase("exit")||
		   mInY.equalsIgnoreCase("stop")||
	       mInY.equalsIgnoreCase("stop")||
		   mInY.equalsIgnoreCase("bye")) {
		   close("System Shutdown. Have a nice day.");
		}
	}
	
	public void close(String error) {
		System.out.println(error);
		mScanner.close();
		System.exit(0);
	}
	
}