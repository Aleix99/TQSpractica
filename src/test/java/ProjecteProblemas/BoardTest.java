package ProjecteProblemas;

import static org.junit.Assert.*;

import org.junit.Test;


public class BoardTest {

	@Test
	public void testBoard() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetBoard() {
		int test_1=10;
		
		Board b = new Board();
		b.setBoard(1);
		
		assertEquals(test_1, b.size);
		
	}

	@Test
	public void testRestartBoard() {
		Board b = new Board();
		
		
		
		
	}

	@Test
	public void testGenerateRandomMines() {
		fail("Not yet implemented");
	}

}
