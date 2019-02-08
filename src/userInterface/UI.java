package userInterface;
import game.*;
import java.util.Scanner;

public abstract class UI {
	
	// ATTRIBUTES
	protected GameLogic gameLogic;
	
	// CONSTRUCTORS
	public UI(GameLogic gl) {
		this.gameLogic = gl;
	}
	
	// METHODS
	public abstract void printGameBoard();
	
	public abstract void takeUserInput();
		
		
	
	
	// -- Implementation
	
	
}
