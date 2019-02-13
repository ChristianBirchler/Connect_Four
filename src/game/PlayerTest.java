package game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PlayerTest {

	@Test
	void testToString() {
		
		Player pl = new Player("Me");
		Player pl2 = new Player("You");
		assertEquals(pl.toString(), "Me", "The string repr of pl should be <Me>");
		assertEquals(pl2.toString(), "You", "The string repr of pl should be <You>");

		
	}

}
