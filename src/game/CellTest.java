package game;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

class CellTest {
	

	@Test
	void testCell() {
		
		Cell testCell = new Cell();
		
		assertEquals("vertical inline is not 0!", testCell.getInLine("vertical"), 0);
		assertEquals("horizontal inline is not 0!", testCell.getInLine("horizontal"), 0);
		assertEquals("diag-up inline is not 0!", testCell.getInLine("diag-up"), 0);
		assertEquals("diag-down inline is not 0!", testCell.getInLine("diag-down"), 0);
		
	}

	@Test
	void testGetOwner() {
		
		Cell testCell1 = new Cell();
		Cell testCell2 = new Cell();
		Cell nullCell = new Cell();
		
		Player pl1 = new Player("Max");
		Player pl2 = new Player("Peter");
		
		testCell1.setOwner(pl1);
		testCell2.setOwner(pl2);
		
		assertNull("owner should be null", nullCell.getOwner());
		assertEquals("pl1 should be the owner!", testCell1.getOwner(), pl1);
		assertEquals("pl2 should be the owner!", testCell2.getOwner(), pl2);
		
		
	}

	@Test
	void testSetOwner() {
		Cell testCell1 = new Cell();
		Cell testCell2 = new Cell();
		Player pl1 = new Player("Max");
		Player pl2 = new Player("Peter");
		
		testCell1.setOwner(pl1);
		testCell2.setOwner(pl2);
		
		assertEquals("pl1 should be the owner!", testCell1.getOwner(), pl1);
		assertEquals("pl2 should be the owner!", testCell2.getOwner(), pl2);
		
		testCell1.setOwner(pl2);
		testCell2.setOwner(pl1);
		
		assertEquals("pl2 should be the owner!", testCell1.getOwner(), pl2);
		assertEquals("pl1 should be the owner!", testCell2.getOwner(), pl1);
		
	}

	@Test
	void testGetInLine() {

		Cell testCell = new Cell();
		
		testCell.setInLine("vertical", 1);
		testCell.setInLine("horizontal", 2);
		testCell.setInLine("diag-up", 3);
		testCell.setInLine("diag-down", 4);
		
		assertEquals("vertical inline should be 1.", testCell.getInLine("vertical"), 1);
		assertEquals("horizontal inline should be 2.", testCell.getInLine("horizontal"), 2);
		assertEquals("diag-up should be 3.", testCell.getInLine("diag-up"), 3);
		assertEquals("diag-down should be 4.", testCell.getInLine("diag-down"), 4);
		
	}

	@Test
	void testSetInLine() {
		
Cell testCell = new Cell();
		
		testCell.setInLine("vertical", 1);
		testCell.setInLine("horizontal", 2);
		testCell.setInLine("diag-up", 3);
		testCell.setInLine("diag-down", 4);
		
		assertEquals("vertical inline should be 1.", testCell.getInLine("vertical"), 1);
		assertEquals("horizontal inline should be 2.", testCell.getInLine("horizontal"), 2);
		assertEquals("diag-up should be 3.", testCell.getInLine("diag-up"), 3);
		assertEquals("diag-down should be 4.", testCell.getInLine("diag-down"), 4);
		
		// reassign the fields
		testCell.setInLine("vertical", 20);
		testCell.setInLine("horizontal", 22);
		testCell.setInLine("diag-up", 38);
		testCell.setInLine("diag-down", 49);
		
		assertEquals("vertical inline should be 20.", testCell.getInLine("vertical"), 20);
		assertEquals("horizontal inline should be 22.", testCell.getInLine("horizontal"), 22);
		assertEquals("diag-up should be 38.", testCell.getInLine("diag-up"), 38);
		assertEquals("diag-down should be 49.", testCell.getInLine("diag-down"), 49);
		
	}

}
