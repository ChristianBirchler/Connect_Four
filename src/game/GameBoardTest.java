package game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GameBoardTest {

	@Test
	void testGameBoard() {
		
		GameBoard gb = new GameBoard(5, 5);
		
		for(int i=0; i<5;i++) {
			for(int j=0; j<5; j++) {
			
				assertNull(gb.at(i+1, j+1), "some cells should not have an owner");
				
			}
		}
		
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
		fail("Not yet implemented");
	}

	@Test
	void testIsFullAt() {
		fail("Not yet implemented");
	}

}
