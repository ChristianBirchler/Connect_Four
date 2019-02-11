package userInterface;
import java.util.Scanner;
import game.*;

public class CUI extends UI {
	/*
	 * This class implements an user interface for the console.
	 */
	
	
	// ATTRIBUTES
	private String pl1, pl2, empty;
	
	// CONSTRUCTOR
	public CUI(GameInterface gi) {
		super(gi);
		this.pl1 = "X";
		this.pl2 = "O";
		this.empty = " ";
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
		String ch = "";
		
		// print the actual game board with nested loops
		for(int row=ysize;row>0;row--) {
			System.out.print("|");
			for(int col=1;col<=xsize;col++) {
				ch = this.getChar(col, row); // use setChar to determine the right character
				System.out.print(ch);
				System.out.print("|");
			}
			System.out.print("\n");
		}
		
			
		// print the slot numbers
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
	
	private String getChar(int xpos, int ypos) {
		/*
		 * This method determine and returns the character for the current cell.
		 */
		Player one = this.game.getPlayer1();
		Player two = this.game.getPlayer2();
		Player cell = this.game.getPlayerAt(xpos, ypos);
		
		if(cell == null) {
			return this.empty;
		}else if(cell == one) {
			return this.pl1;
		}else if(cell == two) {
			return this.pl2;
		}else {
			throw new Error("The character could not be determined!");
		}
		
		
	}
	
	
	
}







