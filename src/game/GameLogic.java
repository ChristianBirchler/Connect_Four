package game;

public class GameLogic implements GameInterface {
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
	public void putAt(int pos) {
		this.gameBoard.throwAt(this.turn, pos);
	}
	
	public Player getCurrentPlayer() {
		return this.turn;
	}
	
	public GameBoard getGameBoard() {
		return this.gameBoard;
	}
	
	public boolean hasWinner() {
		/*
		 * TODO Returns true if the game has a winner else returns false. 
		 */
		
		return false;
	}
	
	public Player getWinner() {
		// PRECONDITIOM
//		if(this.winner == null) {
//			throw new NullPointerException("Winner is not properly set!");
//		}
		
		return this.winner;
	}


	
	public int getXsize() {
		return this.gameBoard.getXsize();
	}


	
	public int getYsize() {
		return this.gameBoard.getYsize();
	}


	
	public boolean isFullAt(int pos) {
		return this.gameBoard.isFullAt(pos);
	}
	
	// -- Implementation
	
	

}
