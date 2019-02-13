package game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GameLogicTest {

	@Test
	void testGameLogic() {

		Player pl1 = new Player("Me");
		Player pl2 = new Player("You");
		GameBoard gb = new GameBoard(5, 5);
		
		GameLogic gl = new GameLogic(pl1,pl2,gb);
		
		assertEquals(pl1, gl.getPlayer1(), "Player 1 is not properly set!");
		assertEquals(pl2, gl.getPlayer2(), "Player 2 is not properly set!");
		assertEquals(pl1, gl.getCurrentPlayer(), "Player 1 should be the current player!");
		assertNull(gl.getWinner(), "There must not be a winner by creation!");
	}

	@Test
	void testPutAt() {

		Player pl1 = new Player("Me");
		Player pl2 = new Player("You");
		GameBoard gb = new GameBoard(5, 5);
		
		GameLogic gl = new GameLogic(pl1,pl2,gb);
		
		gl.putAt(1);
		assertEquals(pl1, gl.getGameBoard().at(1, 1), "Player 1 should be at (1,1)!");
		gl.putAt(1);
		assertEquals(pl2, gl.getGameBoard().at(1, 2), "Player 2 should be at (1,2)!");
		gl.putAt(3);
		assertEquals(pl1, gl.getGameBoard().at(3, 1), "Player 1 should be at (3,1)!");
		
		// illegal arguments
		assertThrows(IllegalArgumentException.class, () -> {
			gl.putAt(0);
		}, "0 should be an illegal argument!");
		
		assertThrows(IllegalArgumentException.class, () -> {
			gl.putAt(-2);
		}, "-2 should be an illegal argument!");
		
		assertThrows(IllegalArgumentException.class, () -> {
			gl.putAt(6);
		}, "6 should be an illegal argument!");
		
	}

	@Test
	void testGetCurrentPlayer() {
		fail("Not yet implemented");
	}

	@Test
	void testGetGameBoard() {
		fail("Not yet implemented");
	}

	@Test
	void testHasWinner() {
		fail("Not yet implemented");
	}

	@Test
	void testGetWinner() {
		fail("Not yet implemented");
	}

	@Test
	void testGetXsize() {
		fail("Not yet implemented");
	}

	@Test
	void testGetYsize() {
		fail("Not yet implemented");
	}

	@Test
	void testValidInput() {
		fail("Not yet implemented");
	}

	@Test
	void testGetPlayer1() {
		fail("Not yet implemented");
	}

	@Test
	void testGetPlayer2() {
		fail("Not yet implemented");
	}

	@Test
	void testGetPlayerAt() {
		fail("Not yet implemented");
	}

}
