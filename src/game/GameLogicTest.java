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
		
		Player pl1 = new Player("Me");
		Player pl2 = new Player("You");
		GameBoard gb = new GameBoard(5, 5);
		
		GameLogic gl = new GameLogic(pl1,pl2,gb);
		
		// initial current player
		assertEquals(pl1, gl.getCurrentPlayer(), "Player 1 should be the initial current player!");
		
		// normal case
		gl.putAt(1);
		assertEquals(pl2, gl.getCurrentPlayer(), "Player 2 should be the current player!");
		gl.putAt(3);
		assertEquals(pl1, gl.getCurrentPlayer(), "Player 1 should be the current player!");
		
		// full column case
		gl.putAt(1);
		gl.putAt(1);
		gl.putAt(1);
		gl.putAt(1);
		
		try {
		gl.putAt(1); // should be invalid since column is already full
		}catch(IllegalArgumentException e) {
			System.out.println("IllegalArgumentException during test: " + e.getMessage());
		}finally {
		// the player should be the same after an invalid input
		assertEquals(pl1, gl.getCurrentPlayer(),
		"If column is full then the player 1 should be still the current player!");
		}
		
		try {
			gl.putAt(0);
		}catch(IllegalArgumentException e) {
			System.out.println("IllegalArgumentException during test: " + e.getMessage());
		}finally {
			assertEquals(pl1, gl.getCurrentPlayer(),
			"If the argument is 0 then the current player should be still player 1!");
		}
		
		
		try {
			gl.putAt(-2);
		}catch(IllegalArgumentException e) {
			System.out.println("IllegalArgumentException during test: " + e.getMessage());
		}finally {
			assertEquals(pl1, gl.getCurrentPlayer(),
			"If the argument is -2 then the current player should be still player 1!");
		}
		
		try {
			gl.putAt(7);
		}catch(IllegalArgumentException e) {
			System.out.println("IllegalArgumentException during test: " + e.getMessage());
		}finally {
			assertEquals(pl1, gl.getCurrentPlayer(),
			"If the argument is 7 then the current player should be still player 1!");
		}
	
		
		
		
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
	void testValidInput() {
		fail("Not yet implemented");
	}



	@Test
	void testGetPlayerAt() {
		fail("Not yet implemented");
	}

}
