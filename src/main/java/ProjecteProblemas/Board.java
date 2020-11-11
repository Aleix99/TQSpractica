package ProjecteProblemas;

import java.util.Random;

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
	 }
	 
	 public void setBoard(int difficult) {
		difficulty = difficult;
		switch (difficult) {
		case(1): //easy
			this.size=10;
			this.nMines=10;
			break;
		case(2): //normal
			this.size=16;
			this.nMines=40;
			break;
		case(3): //hard
			this.size=20;
			this.nMines=70;
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
	 
		Random rand = new Random();
		int num_minas_aux=0;
		nMines =((size-2)*(size-2));
		for(int i = 0; i < size; i++)
		   {
		      for(int j = 0; j < size; j++)
		      {
		    	   if ((rand.nextInt(2)==1)  && (num_minas_aux<nMines))
		    	   {
		    		   squares[i][j].makeBomb();
		    		   num_minas_aux++;
		    	   }
		      }  
		   }
	 }
	 
	 public void drawBoard()
	 {
	 System.out.print("[F|C]");
		for(int i=0; i<this.size; i++)
			System.out.print("["+(i+1)+"]");
		System.out.println();
		for(int i = 0; i < this.size; i++)
		{
			if(i>=9) {
				System.out.print("["+(i+1)+"] ");
			}else {
				System.out.print("["+(i+1)+"]  ");}
			for(int j = 0; j < this.size; j++)
		    {
		    	// 0 casilla vacia, 1 mina
				if(this.squares[i][j].open) {
					System.out.print(" "+this.squares[i][j].value+" ");
				}
				else
					System.out.print(" "+"O"+" ");
		    }
			
		    System.out.println();
		}
		System.out.println(" ");
		 
	 }
	 
	 public boolean openSquare(int i,int j)
	 {
		 if(!this.squares[i][j].open) {
			 this.squares[i][j].open=true;
			 return true;
		 }
		 else
			 return false;
	 }
	 
	 public void calculateValue() //Recursiva
	 {
		 for (int i=0 ; i<this.size;i++)
		 {
			 for( int j=0; j<this.size; j++)
			 {
				 if(i-1>=0) //Fila de arriba (1,2,3)
				 {
					 if(j-1>=0) 
					 {
						 if(this.squares[i][j].bomb) // Si detectamos hay mina
						 {
							 
						 }
					 }
					 
					 if(this.squares[i][j].bomb) // Si detectamos hay mina
					 {
						 
					 }
					 
					 if(j+1<this.size) 
					 {
						 if(this.squares[i][j].bomb) // Si detectamos hay mina
						 {
							 
						 }
					 }
				 }
				 if(i-1>=0) //Fila de en medio(4,6)
				 {
					 if(this.squares[i][j].bomb) // Si detectamos hay mina
					 {
						 
					 }
				 }
				 if(i-1>=0) //Fila de abajo (7,8,9)
				 {
					 if(this.squares[i][j].bomb) // Si detectamos hay mina
					 { 
						 
					 }
				 }
			 }
		 }
	 }
	
}
