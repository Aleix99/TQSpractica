package ProjecteProblemas;

import static org.junit.Assert.*;
import org.junit.Test;

public class GameTest {
	
	@Test
	public void testGameStart() 
	{
		//Hacemos un test de una una jugada (el jugador pone bandera en casilla 0,0) - Path Coverage
		Game mainGame = new Game();
		MockKeyboard mockKeyboard = new MockKeyboard();
		MockBoard mockBoard = new MockBoard();
		randomMock rMock = new randomMock();
		
		Pair[] pairs=new Pair[1];
		pairs[0]=new Pair(0,0);
		mockBoard.setBoard(1);
		rMock.setMinesPosition(pairs,mockBoard.size);
		
		mainGame.setBoard(mockBoard);
		mainGame.setKeyboard(mockKeyboard);
		mockBoard.setBoard(1);
		
		int[] input_1= new int[1];
		input_1[0]=1;
		mockBoard.game_over=false;
		mockBoard.lose_game=false;
		
		
		mockKeyboard.setGametype(input_1);
		mockKeyboard.setPositions(pairs);
		
		mainGame.gameStart(0);
		
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
		//Usuario pone una bandera en el 0,0 ( el input se restará i-1, j-1)
			MockKeyboard keymock = new MockKeyboard();
			Game maingame = new Game();
			Board board_1= new Board();
			int[] input_1= new int[1];
			input_1[0]=2;
			board_1.setBoard(1);
			
			Pair[] pairs=new Pair[1];
			pairs[0]=new Pair(1,1);
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
			pairs_2[0]=new Pair(1,1);
			keymock.setGametype(input_2);
			keymock.setPositions(pairs_2);
			maingame.playSquare();
			
		assertEquals(false,board_1.squares[0][0].flag);
		
		//Usuario pone abre una casilla (0,0)
			int[] input_3= new int[1];
			input_3[0]=1; //Abrir casilla
			Pair[] pairs_3=new Pair[1];
			pairs_3[0]=new Pair(1,1);
			keymock.setGametype(input_3);
			keymock.setPositions(pairs_3);
			maingame.playSquare();
			
		assertEquals(true,board_1.squares[0][0].open);
		
	}
	
}
