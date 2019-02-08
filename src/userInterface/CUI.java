package userInterface;
import java.util.Scanner;

import game.*;

public class CUI extends UI {
	/*
	 * This class implements an user interface for the console.
	 */
	
	
	// ATTRIBUTES
	
	
	// CONSTRUCTOR
	public CUI(GameLogic gl) {
		super(gl);
	}
	
	// METHODS
	// -- Access
	public void printGameBoard() {
	
		/*
		 * This method prints the board into the console according to the current game state.
		 */
		
		// TODO add the current state to the printed table!
		
		GameBoard gb = this.gameLogic.getGameBoard();
		int xsize = gb.getXsize();
		int ysize = gb.getYsize();
		
		for(int row=ysize;row>0;row--) {
			System.out.print("|");
			for(int col=0;col<xsize;col++) {
				System.out.print("_|");
			}
			System.out.print("\n");
		}
		
		for(int i=1;i<xsize+1;i++) {
			System.out.print(" " + i);
		}
		
		System.out.print("\n");
		
	}
	
	
	
	public void takeUserInput() {
		int choice = -1;
		Player currentTurn = this.gameLogic.getTurn();
		
		System.out.println(currentTurn + " enter a position: ");
		choice = this.input();
		
		while(!this.validInput(choice)) {
			System.out.println("Invalid input!\nEnter a position: ");
			choice = this.input();
		}
		
		// TODO Do action according to the valid input.
		
	}
	
	// -- Implementation
	private int input() {
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		int n = reader.nextInt(); // Scans the next token of the input as an int.
	
		return n;
	}
	
	private boolean validInput(int n) {
		/*
		 * This methods checks if 'n' is a valid position to throw a chip into the board.
		 * If 0<'n'<=xsize then true else false.
		 */
		
		int xsize = this.gameLogic.getGameBoard().getXsize();
		GameBoard gb = this.gameLogic.getGameBoard();
		
		return 0<n && n<=xsize && !gb.isFullAt(n);
	}
}







