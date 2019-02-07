package game;

import userInterface.*;

public class GameLogic {
	/*
	 * This class handles all the logic of the game.
	 */
	
	// ATTRIBUTES
	private Player player1, player2;
	private UI userInterface;
	
	// CONSTRUCTOR
	public GameLogic(Player p1, Player p2, String ui) {
		assert ui == "GUI" || ui == "CUI" : "Invalid user interface declaration!";
		
		this.player1 = p1;
		this.player2 = p2;
		
		if(ui == "GUI") {
			this.userInterface = new GUI();
		}else if(ui == "CUI") {
			this.userInterface = new CUI();
		}
	}
	
	
	// METHODS
	// -- Access
	
	
	// -- Implementation
	
	

}
