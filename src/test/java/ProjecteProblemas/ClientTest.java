package ProjecteProblemas;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClientTest {
	
	//En esta clase juntaremos todos los test realizado
	//Coverage completo en las clases creadas del juego

	@Test
	public void testClient()
	{
		//Test de Coverage
		Client mainClient = new Client();
		MockKeyboard mKey = new MockKeyboard();
		
		
		//Inicializamos el juego y salimos (Ponemos opción2)
		int[] input_1= new int[1];
		input_1[0]=2;		
		mKey.setGametype(input_1);
		mainClient.setKeyboard(mKey);
		mainClient.main(null);
		testGame();
		
		//Test de Coverage
		//Ahora le damos a play y configuramos un tablero que nos devuelva un game over.
		MockBoard mBoard = new MockBoard();
		mBoard.game_over=true;
		Game game1= new Game();
		game1.setBoard(mBoard);
		
		int[] input_2= new int[2];
		input_2[0]=1;
		input_2[1]=1;
		mKey.setGametype(input_2);
		mainClient.setKeyboard(mKey);
		mainClient.setGame(game1);
		mainClient.main(null);
		
	}
	
	
	@Test
	public void testGame() //Test principal del juego
	{
		GameTest mainGameTest = new GameTest();
		mainGameTest.testInitializeBoard();
		mainGameTest.testPlaySquare();
		mainGameTest.testGameStart();
	}
	
	@Test
	public void testBoard()
	{
		BoardTest mainBoard = new BoardTest();
		mainBoard.testSetBoard();
		mainBoard.testRestartBoard();
		mainBoard.testGenerateRandomMines();
		mainBoard.testOpenSquare();
		mainBoard.testCalculateValue();
		mainBoard.testPutFlag();
		mainBoard.testgameOver();
		mainBoard.testRecursiveOpenSquare();
		mainBoard.testLoseGame();
		mainBoard.testDrawBoard();
		
	}

}
