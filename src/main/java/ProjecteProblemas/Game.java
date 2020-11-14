package ProjecteProblemas;

public class Game {

	Board b = new Board();
	Keyboard k = new Keyboard();

	void setBoard(Board board) {
		b=board;
	}

	void setKeyboard(Keyboard keyboard) {
		k=keyboard;
	}
	
	/*
	public static void main(String[] args) {
		Board b = new Board();
	}
	*/
	
	public void gameStart(int i)
	{
		b.generateRandomMines();
		b.calculateValue();
		b.drawBoard();
		while(!b.gameOver() && !b.loseGame())
		{
			playSquare();
			b.drawBoard();
		}
		
	}
	
	public void playSquare()
	{
		System.out.println("Introduce la accion que que deseas realizar 1 -> Abrir casilla || 2 -> Poner o quitar bandera");
		int typeMove = k.getInput_Gametype(b.size);
		Pair e = k.getPositions(b.size);
		
		if(typeMove==1) // Open Square
		{
			b.openSquare(e.x, e.y);
		}
		else //	Put/Remove Flag
		{
			b.putFlag(e.x, e.y);
		}

	}
	
	public void initializeBoard(int difficult)
	{
		
		b.setBoard(difficult);
		
	}
	
	

}
