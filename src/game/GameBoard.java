package game;

public class GameBoard {
	/*
	 * This class represents the game board.
	 */
	
	// ATTRIBUTES
	private Cell table[][];
	private int xsize, ysize;
	
	// CONSTRUCTOR
	public GameBoard(int xsize_, int ysize_) {
		if(xsize_<4 || ysize_<4) {
			throw new IllegalArgumentException("Invalid board size!");
		}
		
		this.xsize = xsize_;
		this.ysize = ysize_;
		
		this.table = new Cell[xsize_][ysize_];
		// initialize the cells
		for(int i=0;i<xsize_;i++) {
			for(int j=0;j<ysize_;j++) {
				this.table[i][j] = new Cell();
			}
		}
		
	}
	
	
	// METHODS
	// -- Access
	public Player at(int xpos, int ypos) {
		return this.table[xpos-1][ypos-1].getOwner();
	}
	
	public int getXsize() {
		return this.xsize;
	}
	
	public int getYsize() {
		return this.ysize;
	}
	
	public void throwAt(Player pl, int pos) {
		/*
		 * Player 'pl' throws his chip at 'pos' into the board.
		 * The position must initially not be full!
		 */
		
		// PRECONDITION
		if(this.isFullAt(pos)) {
			throw new IllegalArgumentException();
		}
		
		int y = 0;
		while(this.table[pos-1][y].getOwner() != null) { // no need to check y<ysize since table at 'pos' is not full
			y++;
		}
		
		table[pos-1][y].setOwner(pl);
		this.updateInLineAt(pos, y+1);
		
	}
	
	public boolean isFullAt(int pos) {
		/*
		 * Returns true iff GameBoard at position 'pos' is full. (first index is 1)
		 */
		if(pos<1 || pos>this.xsize) {
			throw new IllegalArgumentException();
		}
		
		return this.table[pos-1][this.ysize-1].getOwner() != null;
	}
	
	// -- Implementation
	private void updateInLineAt(int xpos, int ypos) {
		
		// TODO!!!!
		
		/*
		 * This method updates the 'inline' property of the cell at (xpos,ypos). (Indices start with 1!)
		 */
	}

}
