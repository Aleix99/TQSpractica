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
	
	public static void main(String[] args) {
		Board b = new Board();
	}
	
	public void startGame()
	{
		tab.initablero(tab.getmida());
		System.out.println(" ");
		tab.initminas();
		tab.distNum();
		System.out.println("	GAME  START!  ");
		System.out.println(" ");
		while(tab.getBanderas()!=tab.getnumMinas() && playing)
		{
		tab.dibujar_user();
		jugada();
		}
		if(tab.getBanderas()==tab.getnumMinas())
		{
			tab.dibujar_user();
			tab.felicitar();
		}
		
	}

}
