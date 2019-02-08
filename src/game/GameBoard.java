package game;

public class GameBoard {
	/*
	 * This class represents the game board.
	 */
	
	// ATTRIBUTES
	Player table[][];
	private int xsize, ysize;
	
	// CONSTRUCTOR
	public GameBoard(int xsize_, int ysize_) {
		assert xsize_>=4 && ysize_>=4 : "Invalid board size!";
		
		this.xsize = xsize_;
		this.ysize = ysize_;
		
		this.table = new Player[xsize_][ysize_];
		
	}
	
	
	// METHODS
	// -- Access
	public int getXsize() {
		return this.xsize;
	}
	
	public int getYsize() {
		return this.ysize;
	}
	
	public boolean isFullAt(int pos) {
		/*
		 * Returns true iff GameBoard at position 'pos' is full. (first index is 1)
		 */
		
		return this.table[pos-1][this.ysize-1] != null;
	}
	
	// -- Implementation
	

}
