package game;

import userInterface.*;

public class Application {

	public static void main(String[] args) {

		System.out.println("This is 4-Gewinnt ...");
		
		// CONSTANTS
		// Player names
		String name1 = "Christian";
		String name2 = "Victor";
		// Board size
		int xsize = 7;
		int ysize = 7;
		
		// BUILDING DATA STRUCTURES
		Player player1 = new Player(name1);
		Player player2 = new Player(name2);		
		GameBoard gameBoard = new GameBoard(xsize, ysize);
		
		
		
	}

}
