package ProjecteProblemas;

public class Board extends MockBoard {
	
	public int size;
	public int nMines;
	private int difficulty;
	private long score;
	public Square squares[][];

	Board() {
		 size = 0;
		 difficulty= 1;
		 score=0;
		 squares= new Square[size][size];
		 for(int i = 0; i < size; i++) {
			 for(int j = 0; j < size; j++) {
				 squares[i][j]=new Square();
			 }
		 }
	 }
	 
	 public void setBoard(int difficult) {
		difficulty = difficult;
		switch (difficult) {
		case(1): //easy
			size=10;
			nMines=10;
			break;
		case(2): //normal
			size=16;
			nMines=40;
			break;
		case(3): //hard
			size=20;
			nMines=100;
			break;
		default:
		}
		
		restartBoard();
		
	 }
	 
	 public void restartBoard() {
		 squares = new Square[this.size][this.size];
		 for(int i = 0; i < this.size; i++) {
			 for(int j = 0; j < this.size; j++) {
				 squares[i][j]=new Square(); //0=normal number
			 }
		 }
		 
		 //generateRandomMines();
	 }
	 
	 public void generateRandomMines() {
		 
	 }
}
