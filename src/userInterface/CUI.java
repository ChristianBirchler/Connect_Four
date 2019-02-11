package userInterface;
import java.util.Scanner;

import game.*;

public class CUI extends UI {
	/*
	 * This class implements an user interface for the console.
	 */
	
	
	// ATTRIBUTES
	// TODO add symbols (chip representations) as attributes
	
	// CONSTRUCTOR
	public CUI(GameInterface gi) {
		super(gi);
	}
	
	// METHODS
	// -- Access
	public void printGameBoard() {
	
		/*
		 * This method prints the board into the console according to the current game state.
		 */
		
		// TODO add the current state to the printed table!
		
		int xsize = this.game.getXsize();
		int ysize = this.game.getYsize();
		
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
		Player currentPl = this.game.getCurrentPlayer();
		
		System.out.println(currentPl + " enter a position: ");
		choice = this.input();
		
		while(!this.game.validInput(choice)) {
			System.out.println("Invalid input!\n" + currentPl + " enter a position: ");
			choice = this.input();
		}
		
		// 'choice' is a valid position to throw a chip
		this.game.putAt(choice);
		
	}
	
	// -- Implementation
	private int input() {
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		int n = reader.nextInt(); // Scans the next token of the input as an int.
		//reader.close();
		
		return n;
	}
	
	
}







