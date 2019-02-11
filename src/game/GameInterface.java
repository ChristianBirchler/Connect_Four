package game;

public interface GameInterface {

	public void putAt(int pos);
	public Player getCurrentPlayer();
	public Player getPlayer1();
	public Player getPlayer2();
	public Player getPlayerAt(int xpos, int ypos);
	public int getXsize();
	public int getYsize();
	public boolean validInput(int pos);
	
}
