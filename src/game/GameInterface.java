package game;

public interface GameInterface {

	public void putAt(int pos);
	public Player getCurrentPlayer();
	public int getXsize();
	public int getYsize();
	public boolean isFullAt(int pos);
	
}
