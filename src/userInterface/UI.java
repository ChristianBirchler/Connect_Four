package userInterface;
import game.*;

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
		
	}
	
}
