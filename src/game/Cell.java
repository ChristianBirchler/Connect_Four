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
	// meaning: ul = "upper-left" ll = "lower-left"
	
	private int[] inline; // orientation: first item is upper-left then clock-wise
	private ArrayList<String> posistions; // inline and positions have the same indices
	
	// CONSTRUCTOR
	public Cell() {
		this.owner = null;
		
		this.inline = new int[8];
		for(int i=0;i<8;i++) {
			this.inline[i] = 0;
		}
		
		this.posistions = new ArrayList<String>();
		this.posistions.add("upper-left");
		this.posistions.add("upper");
		this.posistions.add("upper-right");
		this.posistions.add("right");
		this.posistions.add("lower-right");
		this.posistions.add("lower");
		this.posistions.add("lower-left");
		this.posistions.add("left");
		
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
		if(!this.posistions.contains(pos)) {
			throw new Error("The position is invalid!");
		}
		
		int posIndex = this.posistions.indexOf(pos);
		return this.inline[posIndex];
	}
	
	public void setInLine(String pos, int val) {
		// PRECONDITION: check if 'pos' is a valid position
		if(!this.posistions.contains(pos)) {
			throw new Error("The position is invalid!");
		}
		
		int posIndex = this.posistions.indexOf(pos);
		this.inline[posIndex] = val;
	}
	
}
