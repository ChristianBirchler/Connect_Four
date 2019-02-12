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
		fail("Not yet implemented");
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
