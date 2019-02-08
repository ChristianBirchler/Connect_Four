package game;

public class GameLogic {
	/*
	 * This class handles all the logic of the game.
	 */
	
	// ATTRIBUTES
	private Player player1, player2, winner, turn;
	private GameBoard gameBoard;
	
	// CONSTRUCTOR
	public GameLogic(Player p1, Player p2, GameBoard gb) {
		
		this.player1 = p1;
		this.player2 = p2;
		this.winner = null;
		this.gameBoard = gb;
		this.turn = p1;

	}
	
	
	// METHODS
	// -- Access
	public boolean hasWinner() {
		return false; // TODO implement such that no infinite loop occur
	}
	
	public Player getWinner() {
		// PRECONDITIOM
//		if(this.winner == null) {
//			throw new NullPointerException("Winner is not properly set!");
//		}
		
		return this.winner;
	}
	
	// -- Implementation
	
	

}
