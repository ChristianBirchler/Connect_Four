package game;
import java.util.ArrayList;

public class Cell {
	/*
	 * This class represents the cells of the game board and stores information about
	 * the connections of the cells.
	 */
	
	// ATTRIBUTES
	private Player owner; // 'player' has occupied this cell
	
	// stores the number of connected cells of player (updated by insertion)	
	private int[] inline; // same indices like 'positions'
	private ArrayList<String> positions; // stores the possible postition strings in a list
	
	// CONSTRUCTOR
	public Cell() {
		this.owner = null;
		
		this.inline = new int[4];
		for(int i=0;i<4;i++) {
			this.inline[i] = 0;
		}
		
		this.positions = new ArrayList<String>();
		this.positions.add("vertical");
		this.positions.add("horizontal");
		this.positions.add("diag-up");
		this.positions.add("diag-down");
		
		
	}
	
	// MEHTODS
	// -- Access
	public Player getOwner() {
		return this.owner;
	}
	
	public void setOwner(Player pl) {
		this.owner = pl;
	}
	
	public int getInLine(String pos) {
		
		// PRECONDITION: check if 'pos' is a valid position
		if(!this.positions.contains(pos)) {
			throw new Error("The position is invalid!");
		}
		
		int posIndex = this.positions.indexOf(pos);
		return this.inline[posIndex];
	}
	
	public void setInLine(String pos, int val) {
		// PRECONDITION: check if 'pos' is a valid position
		if(!this.positions.contains(pos)) {
			throw new Error("The position is invalid!");
		}
		
		int posIndex = this.positions.indexOf(pos);
		this.inline[posIndex] = val;
	}
	
}
