package userInterface;
import game.*;
import java.util.Scanner;

public abstract class UI {
	
	// ATTRIBUTES
	protected GameInterface game;
	
	// CONSTRUCTORS
	public UI(GameInterface gi) {
		this.game = gi;
	}
	
	// METHODS
	public abstract void printGameBoard();
	
	public abstract void takeUserInput();
		
		
	
	
	// -- Implementation
	
	
}
