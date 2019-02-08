package game;

public class GameLogic {
	/*
	 * This class handles all the logic of the game.
	 */
	
	// ATTRIBUTES
	private Player player1, player2, winner;
	private GameBoard gameBoard;
	
	// CONSTRUCTOR
	public GameLogic(Player p1, Player p2, GameBoard gb) {
		
		this.player1 = p1;
		this.player2 = p2;
		this.winner = null;
		this.gameBoard = gb;

	}
	
	
	// METHODS
	// -- Access
	public boolean hasWinner() {
		return this.winner != null;
	}
	
	public Player getWinner() {
		assert this.winner != null : "There is no winner so far!";
		return this.winner;
	}
	
	// -- Implementation
	
	

}
