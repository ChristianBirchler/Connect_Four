package game;

public class Player {
	/*
	 * This class is stores stores information about players.
	 */
	
	
	// ATTRIBUTES
	private String name;
	private int points;
	
	
	// CONSTRUCTOR
	public Player(String name_) {
		this.name = name_;
		this.points = 0;
	}
	
	
	// METHODS
	// -- Access
	public String toString() {
		return this.name;
	}

}
