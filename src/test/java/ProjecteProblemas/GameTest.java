package ProjecteProblemas;

import static org.junit.Assert.*;
import java.util.concurrent.TimeUnit;
import org.junit.Test;

public class GameTest {

	Board b = new Board();
	MockKeyboard mk = new MockKeyboard();
	
	@Test
	void testSetBoard(Board board) {
		b=board;
	}

	@Test
	void testSetKeyboard(MockKeyboard mkeyboard) {
		mk=mkeyboard;
	}
	
	
	@Test
	public void testMain() throws InterruptedException {

		Board board = new Board();
		
		MockKeyboard mKeyboard = new MockKeyboard();
		
		//input del usuario para introducir la dificultad
		mKeyboard.input=1;
		mKeyboard.position = new Pair(2,5);
		
		
		//supuestos inputs del usuario para seleccionar la casilla que quiere abrir
		/*mKeyboard.position = new Pair[10]; //10 = #casillas que abrirá
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
		testSetKeyboard(mKeyboard);
		
		board.setBoard(mk.input);
		
		board.generateRandomMines();
		
		board.calculateValue();
		
		
		int i=0;
		boolean playing=true;
		
		//while(i<10) {
		board.drawBoard();
		TimeUnit.SECONDS.sleep(1);
		
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
		
		
	}
}
