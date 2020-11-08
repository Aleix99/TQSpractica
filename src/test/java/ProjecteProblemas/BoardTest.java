package ProjecteProblemas;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;


public class BoardTest {

	/*
	@Test
	public void testBoard() {
		fail("Not yet implemented");
	}
	*/

	//Prueba
	@Test
	public void testSetBoard() {
		int test_1=10;
		int test_2=16;
		int test_3=20;
		int test_4=1;
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
		
		//Comprobamos que las matrices se han inicializado correctamente
		assertTrue(Arrays.deepEquals(b.squares,squares));
		
		//Comprobamos en el caso de dificultad 2
		int[][] squares_2;
		squares_2 = new int[test_2][test_2];
		Board b_2 = new Board();
		
		b_2.setBoard(2);
		
		
		assertEquals(test_2, b_2.size);
		
		for(int i =0 ; i<test_2;i++) {
			for(int j =0 ; j<test_2;j++) {
				squares_2[i][j] = 0;
			}
		}
		
		assertTrue(Arrays.deepEquals(b_2.squares,squares_2));
		
		
		//Comprobamos en el caso de dificultad 3
		int[][] squares_3;
		squares_3 = new int[test_3][test_3];
		Board b_3 = new Board();
		
		b_3.setBoard(3);
		
		
		assertEquals(test_3, b_3.size);
		
		for(int i =0 ; i<test_3;i++) {
			for(int j =0 ; j<test_3;j++) {
				squares_3[i][j] = 0;
			}
		}
		
		assertTrue(Arrays.deepEquals(b_3.squares,squares_3));
				
				
		//Caso default
		int[][] squares_4;
		squares_4 = new int[test_4][test_4];
		Board b_4 = new Board();
		
		b_3.setBoard(0);
		
				
		
		
	}

	@Test
	public void testRestartBoard() {
		Board b = new Board();
		
		
		
		
	}

	
	/*@Test
	public void testGenerateRandomMines() {
		fail("Not yet implemented");
	}
	*/

}
