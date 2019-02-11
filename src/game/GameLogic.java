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
		this.changeCurrentPlayer();
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



	public boolean validInput(int n) {
		/*
		 * This methods checks if 'n' is a valid position to throw a chip into the board.
		 * If 0<'n'<=xsize then true else false.
		 */
		
		int xsize = this.getXsize();
		
		return 0<n && n<=xsize && !this.gameBoard.isFullAt(n);
	}
	
	
	public Player getPlayer1() {
		return this.player1;
	}


	public Player getPlayer2() {
		return this.player2;
	}
	
	
	public Player getPlayerAt(int xpos, int ypos) {
		return this.gameBoard.at(xpos, ypos);
	}
	
	
	
	// -- Implementation
	private void changeCurrentPlayer() {
		/*
		 * This method simply change the current player.
		 */
		
		if(this.turn == this.player1) {
			this.turn = this.player2;
		}else if(this.turn == this.player2) {
			this.turn = this.player1;
		}else {
			throw new Error("Change of player does not work properly!");
		}
	}


	

}
