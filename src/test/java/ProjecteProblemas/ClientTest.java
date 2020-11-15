package ProjecteProblemas;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClientTest {

	@Test
	public void testGame() //Test principal del juego
	{
		GameTest mainGameTest = new GameTest();
		mainGameTest.testInitializeBoard();
		mainGameTest.testPlaySquare();
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
		
	}

}
