import game.*;
import userInterface.*;

public class VierGewinnt {

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
		
		// gameLogic acts as observer of userInterface!!!
		GameLogic gameLogic = new GameLogic(player1, player2, gameBoard);
		UI userInterface = new CUI(gameLogic);
		
		// Start game
		userInterface.printGameBoard();
		
		// Game loop
		while(!gameLogic.hasWinner()) {
			
			userInterface.takeUserInput();			
			userInterface.printGameBoard();
		}
		
		System.out.println(gameLogic.getWinner() + " is the winner!");
		
		
	}

}
