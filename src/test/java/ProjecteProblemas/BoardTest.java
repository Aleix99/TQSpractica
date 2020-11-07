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
		int[][] squares;
		squares = new int[10][10];
		boolean check = true;
		Board b = new Board();
		
		b.setBoard(1);
		
		assertEquals(test_1, b.size);
		
		
		//Check si se ha inizializado bien (todas las casillas = 0)
		for(int i =0 ; i<test_1;i++) {
			for(int j =0 ; j<test_1;j++) {
				squares[i][j] = 0;
			}
		}
		for(int i =0 ; i<test_1;i++) {
			for(int j =0 ; j<test_1;j++) {
				System.out.print(b.squares[1][1]);
				System.out.print(squares[i][j]);

				if(b.squares[i][j] != squares[i][j]) {
					check=false;
				}
			}
		}
		assertTrue(check);
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
