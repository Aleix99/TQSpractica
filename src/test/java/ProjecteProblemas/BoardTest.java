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
		Square[][] squares;
		squares = new Square[10][10];
		boolean check = true;
		Board b = new Board();
		
		b.setBoard(1);
		
		
		assertEquals(test_1, b.size);
		
		
		//Check si se ha inizializado bien (todas las casillas = 0)
		for(int i =0 ; i<test_1;i++) {
			for(int j =0 ; j<test_1;j++) {
				squares[i][j] = new Square();
			}
		}
		
		int i=0;
		int j=0;
		while(check && i < test_1)
		{
			while(check && j < test_1)
			{
				if (squares[i][j].value != b.squares[i][j].value)
					check=false;
				j++;
			}
			j=0;
			i++;
		}
		
		//Comprobamos que las matrices se han inicializado correctamente
		assertTrue(check);
		
		/*
		
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
		
		b_3.setBoard(0);*/
		
	}

	@Test
	public void testRestartBoard() {
		Board b = new Board();
		
		
		
		
	}

	
	@Test
	public void testGenerateRandomMines() {
		//Veremos si se ha puesto alguna bomba, con el check
		boolean check=false;
		int test_1=10;
		Board board_1 = new Board();
		board_1.setBoard(1);
		board_1.generateRandomMines();
		
		int i=0;
		int j=0;
		while(!check && i < test_1)
		{
			while(!check && j < test_1)
			{
				if (board_1.squares[i][j].value.equals("X"))
					check=true;
				j++;
			}
			j=0;
			i++;
		}
		
		assertTrue(check);
		
		board_1.drawBoard();
	}
	
	@Test
	public void testOpenSquare()
	{
		//Test para verificar si el método cambia el valor de un Square
		boolean check=false;
		int test_1=10;
		Board board_1 = new Board();
		board_1.setBoard(1);
		board_1.openSquare(0, 0);
		
		check=board_1.squares[0][0].open;
		
		assertTrue(check);
		
		//Como el Test anterior pero provando el nuevo diseño del código 
		boolean check_2=false;
		int test_2=10;
		Board board_2 = new Board();
		board_2.setBoard(2);
		
		assertTrue(board_2.openSquare(1, 1));
		
	}
	

}
