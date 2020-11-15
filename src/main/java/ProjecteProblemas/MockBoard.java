package ProjecteProblemas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MockBoard extends Board {
	//Este tablero servirá para simular una partida
	//Por eso solo lo utilizaremos en la clase Client
	boolean game_over=false;
	boolean lose_game=false;
	
	public int nFlag_max;
	public int nFlag_put;
	public int size;
	public int nMines;
	private int difficulty;
	private long score;
	public Square squares[][];
	List<Pair> mines_position = new ArrayList<Pair>();
	Random rand = new Random();

	MockBoard() { //Testeado entero
		 size = 0;
		 difficulty= 1;
		 score=0;
		 squares= new Square[size][size];
	 }
	
	
	public void setRandom(Random random)
	 {
		 rand=random;
	 }
	
	
	public void generateRandomMines()
	{
		
	}
	public void calculateValue() {}
	
	public void drawBoard() {}
	 public boolean gameOver() //Añadimos caso abre mina
	 {
		 return game_over;
	 }
	 public boolean loseGame()
	 {
		 return lose_game;
	 }
	 public boolean putFlag(int i, int j)
	 {
		 game_over=true;
		 return false;
	 }
	 public boolean openSquare(int i,int j)
	 {
		 game_over=true;
		 return false;
	 }
	 public void recursiveOpenSquare(int i, int j)
	 {
		 
	 }
	
	
	
}
