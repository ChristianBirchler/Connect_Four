package game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GameBoardTest {

	@Test
	void testGameBoard() {
		
		GameBoard gb1 = new GameBoard(5, 5);
		
		for(int i=0; i<5;i++) {
			for(int j=0; j<5; j++) {
			
				assertNull(gb1.at(i+1, j+1), "some cells should not have an owner");
				
			}
		}
		
		assertThrows(IllegalArgumentException.class, () -> {
			GameBoard gb2 = new GameBoard(2,3);
		}, "Board size must be at least 4x4!");
		
		assertThrows(IllegalArgumentException.class, () -> {
			GameBoard gb3 = new GameBoard(2,-3);
		}, "Board size must be at least 4x4!");
		
		assertThrows(IllegalArgumentException.class, () -> {
			GameBoard gb4 = new GameBoard(1,8);
		}, "Board size must be at least 4x4!");
		
		
	}

	@Test
	void testAt() {
		
		Player pl1 = new Player("Me");
		Player pl2 = new Player("You");
		GameBoard gb = new GameBoard(5, 5);
		
		gb.throwAt(pl1, 1);
		assertEquals(pl1, gb.at(1, 1), "pl1 should be at (1,1).");
		
		gb.throwAt(pl1, 1);
		gb.throwAt(pl1, 1);
		gb.throwAt(pl1, 1);
		gb.throwAt(pl2, 1);
		assertEquals(pl2, gb.at(1, 5), "pl2 should be at (1,5)");
		
		gb.throwAt(pl2, 5);
		gb.throwAt(pl2, 5);
		gb.throwAt(pl2, 5);
		gb.throwAt(pl2, 5);
		gb.throwAt(pl2, 5);
		assertEquals(pl2, gb.at(5, 5), "pl2 should be at (5,5)");
		
		assertThrows(IllegalArgumentException.class, () -> {gb.throwAt(pl2, 1);});
		assertThrows(IllegalArgumentException.class, () -> {gb.throwAt(pl2, 5);});
			
		
				
	}

	@Test
	void testThrowAt() {
		
		GameBoard gb = new GameBoard(5,5);
		Player pl1 = new Player("Me");
		Player pl2 = new Player("You");
		
		gb.throwAt(pl1, 2);
		assertEquals(pl1, gb.at(2, 1), "pl1 should be at (2,1)");
		gb.throwAt(pl2, 2);
		assertEquals(pl2, gb.at(2, 2), "pl2 sould be at (2,2)");
		
		gb.throwAt(pl1, 1);
		gb.throwAt(pl1, 3);
		gb.throwAt(pl2, 5);
		gb.throwAt(pl1, 1);
		gb.throwAt(pl1, 3);
		gb.throwAt(pl2, 5);
		gb.throwAt(pl1, 1);
		gb.throwAt(pl1, 3);
		gb.throwAt(pl2, 5);
		gb.throwAt(pl1, 1);
		gb.throwAt(pl1, 3);
		gb.throwAt(pl2, 5);
		gb.throwAt(pl1, 1);
		gb.throwAt(pl1, 3);
		gb.throwAt(pl2, 5);
		
		assertThrows(IllegalArgumentException.class, () -> {gb.throwAt(pl2, 1);}
		, "Yous should not be able to throw at 1 since the column is full!");
		assertThrows(IllegalArgumentException.class, () -> {gb.throwAt(pl2, 3);}
		, "Yous should not be able to throw at 3 since the column is full!");
		assertThrows(IllegalArgumentException.class, () -> {gb.throwAt(pl2, 5);}
		, "Yous should not be able to throw at 5 since the column is full!");

		
	}

	@Test
	void testIsFullAt() {

		GameBoard gb = new GameBoard(5, 5);
		Player pl1 = new Player("Me");
		
		gb.throwAt(pl1, 1);
		gb.throwAt(pl1, 1);
		gb.throwAt(pl1, 1);
		gb.throwAt(pl1, 1);
		gb.throwAt(pl1, 1);
		
		gb.throwAt(pl1, 2);
		gb.throwAt(pl1, 2);
		
		assertTrue(gb.isFullAt(1), "Game board should be full at pos=1.");
		assertFalse(gb.isFullAt(2), "Game board must not be full at pos=2");
		assertFalse(gb.isFullAt(3), "Game board must not be full at pos=3");
		assertFalse(gb.isFullAt(4), "Game board must not be full at pos=4");
		assertFalse(gb.isFullAt(5), "Game board must not be full at pos=5");
		
		assertThrows(IllegalArgumentException.class, () -> {gb.isFullAt(0);}
		, "0 should be an illegal argument!");
		assertThrows(IllegalArgumentException.class, () -> {gb.isFullAt(6);}
		, "6 should be an illegal argument!");
		assertThrows(IllegalArgumentException.class, () -> {gb.isFullAt(-2);}
		, "-2 should be an illegal argument!");
	
	}

}








