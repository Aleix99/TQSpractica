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
		System.out.print(b.mines_position.size());
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
		System.out.println("Choose: 1 -> Open Square || 2 -> Put/Remove Flag");
		int typeMove = k.getInput_Gametype(b.size);
		System.out.println("Enter coordinates");
		Pair e = k.getPositions(b.size);
		
		if(typeMove==1) // Open Square
		{
			b.openSquare(e.x-1, e.y-1);
			b.recursiveOpenSquare(e.x-1, e.y-1);
		}
		else //	Put/Remove Flag
		{
			b.putFlag(e.x-1, e.y-1);
		}

	}
	
	public void initializeBoard(int difficult)
	{
		
		b.setBoard(difficult);
		
	}
	
	

}
