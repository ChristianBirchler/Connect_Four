package userInterface;
import game.*;
import java.util.Scanner;

public abstract class UI {
	
	// ATTRIBUTES
	private GameLogic gameLogic;
	
	// CONSTRUCTORS
	public UI(GameLogic gl) {
		this.gameLogic = gl;
	}
	
	// METHODS
	public abstract void printGameBoard();
	
	public void takeUserInput() {
		int choice = -1;
		
		System.out.println("Enter a position: ");
		choice = this.input();
		
		while(!this.validInput(choice)) {
			System.out.println("Invalid input!\nEnter a position: ");
			choice = this.input();
		}
		
		
	}
	
	// -- Implementation
	private int input() {
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		int n = reader.nextInt(); // Scans the next token of the input as an int.
	
		return n;
	}
	
	private boolean validInput(int n) {
		return false;
	}
	
}
