package game;

public class Cell {
	/*
	 * This class represents the cells of the game board and stores information about the status.
	 */
	
	// ATTRIBUTES
	private Player owner; // 'player' has occupied this cell
	private int inLine; // stores the number of connected cells of player (updated by insertion)
	
	// CONSTRUCTOR
	public Cell() {
		this.owner = null;
		this.inLine = 0;
	}
	
	// MEHTODS
	// -- Access
	public Player getOwner() {
		return this.owner;
	}
	
	public void setOwner(Player pl) {
		this.owner = pl;
	}
	
	public int getInLine() {
		return this.inLine;
	}
	
	public void incrInLine() {
		this.inLine++;
	}
	
}
