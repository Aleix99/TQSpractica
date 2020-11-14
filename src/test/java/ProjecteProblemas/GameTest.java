package ProjecteProblemas;

import static org.junit.Assert.*;
import org.junit.Test;

public class GameTest {
	
	
	@Test
	public void testMain() {
		/*
		Game game1=new Game();
		Board board = new Board();
		MockKeyboard mKeyboard = new MockKeyboard();
		game1.setKeyboard(mKeyboard);
		
		//input del usuario para introducir la dificultad
		mKeyboard.input=1;
		
		//supuestos inputs del usuario para seleccionar la casilla que quiere abrir
		/*mKeyboard.position = new Pair[10]; //10 = #casillas que abrir�
		mKeyboard.position[0]=new Pair(1,2); 
		mKeyboard.position[1]=new Pair(3,7);
		mKeyboard.position[2]=new Pair(1,1);
		mKeyboard.position[3]=new Pair(2,2);
		mKeyboard.position[4]=new Pair(3,2); 
		mKeyboard.position[5]=new Pair(3,5);
		mKeyboard.position[6]=new Pair(6,2);
		mKeyboard.position[7]=new Pair(1,7);
		mKeyboard.position[8]=new Pair(8,2); 
		mKeyboard.position[9]=new Pair(3,9);
		*/
		
		/*
		board.generateRandomMines();
		
		board.calculateValue();
		
		
		int i=0;
		boolean playing=true;
		*/
		/*
		
		
		//while(i<10) {
		board.drawBoard();
		//TimeUnit.SECONDS.sleep(1);
		
		
		//USER INPUTS x AND y
		if (board.openSquare(mk.position.x, mk.position.y)) { 
			board.recursiveOpenSquare(mk.position.x, mk.position.y);
		}
		else
			System.out.print("Square " + mk.position.x + "," + mk.position.y + " already open \n");

		playing=board.gameOver();			
		
		i++;
		//}
		
		assert(playing);
		*/
		
		
	}
	
	@Test 
	public void testInitializeBoard()
	{
		Game maingame = new Game();
		Board d = new Board();
		maingame.setBoard(d);
		maingame.initializeBoard(1);
		
		assertEquals(10,d.size);
	}
	
	@Test
	public void testPlaySquare()
	{
		//Usuario pone una bandera en el 0,0
			MockKeyboard keymock = new MockKeyboard();
			Game maingame = new Game();
			Board board_1= new Board();
			int[] input_1= new int[1];
			input_1[0]=2;
			board_1.setBoard(1);
			
			Pair[] pairs=new Pair[1];
			pairs[0]=new Pair(0,0);
			keymock.setGametype(input_1);
			keymock.setPositions(pairs);
			
			maingame.setBoard(board_1);
			maingame.setKeyboard(keymock);
			maingame.playSquare();

		assertEquals(true,board_1.squares[0][0].flag);
		
		//Usuario quitamos bandera (Volvemos a poner la bandera en el 0,0)
			int[] input_2= new int[1];
			input_2[0]=2;
			Pair[] pairs_2=new Pair[1];
			pairs_2[0]=new Pair(0,0);
			keymock.setGametype(input_2);
			keymock.setPositions(pairs_2);
			maingame.playSquare();
			
		assertEquals(false,board_1.squares[0][0].flag);
		
		//Usuario pone abre una casilla (0,0)
			int[] input_3= new int[1];
			input_3[0]=1; //Abrir casilla
			Pair[] pairs_3=new Pair[1];
			pairs_3[0]=new Pair(0,0);
			keymock.setGametype(input_3);
			keymock.setPositions(pairs_3);
			maingame.playSquare();
			
		assertEquals(true,board_1.squares[0][0].open);
		
	}
	
}
