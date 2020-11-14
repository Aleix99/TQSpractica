package ProjecteProblemas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Board extends MockBoard {
	
	public int size;
	public int nMines;
	private int difficulty;
	private long score;
	public Square squares[][];
	List<Pair> mines_position = new ArrayList<Pair>();
	Random rand = new Random();

	Board() {
		 size = 0;
		 difficulty= 1;
		 score=0;
		 squares= new Square[size][size];
	 }
	
	 public void setRandom(Random random)
	 {
		 rand=random;
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
		 
		 //generateRandomMines(); NO lo llamaremos directamente
	 }
	 
	 public void generateRandomMines() {
		int num_minas_aux=0;
		nMines =((size-2)*(size-2));
		for(int i = 0; i < size; i++)
		   {
		      for(int j = 0; j < size; j++)
		      {
		    	   if ((rand.nextInt(2)==1)  && (num_minas_aux<nMines))
		    	   {
		    		   Pair e = new Pair(i,j);
		    		   mines_position.add(e);
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
				if(this.squares[i][j].open) 
				{
					if(!this.squares[i][j].bomb)
						System.out.print(" "+this.squares[i][j].value+" ");
					else
						System.out.print(" "+"X"+" ");
				}
				//else if(this.squares[i][j].flag) BANDERAS ESTO NO ESTABA
					//System.out.print(" "+"P"+" ");
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
						 if(this.squares[i-1][j-1].bomb) // Si detectamos hay mina (1)
						 {
							 this.squares[i][j].value++;
						 }
					 }
					 
					 if(this.squares[i-1][j].bomb) // Si detectamos hay mina (2)
					 {
						 this.squares[i][j].value++;
					 }
					 
					 if(j+1<this.size) 
					 {
						 if(this.squares[i-1][j+1].bomb) // Si detectamos hay mina (3)
						 {
							 this.squares[i][j].value++;
						 }
					 }
				 }
				 if(j-1>=0) //Fila de en medio(4,6)
				 {
					 if(this.squares[i][j-1].bomb) // Si detectamos hay mina (4)
					 {
						 this.squares[i][j].value++;
					 }
				 }
				 
				 if(j+1<this.size) //Fila de en medio(4,6)
				 {
					 if(this.squares[i][j+1].bomb) // Si detectamos hay mina (6)
					 {
						 this.squares[i][j].value++;
					 }
				 }
				 
				 
				 if(i+1<this.size) //Fila de abajo (7,8,9)
				 {
					 if(j-1>=0) {
						 if(this.squares[i+1][j-1].bomb) // Si detectamos hay mina (6)
						 {
							 this.squares[i][j].value++;
						 }
					 }
					 if(this.squares[i+1][j].bomb) // Si detectamos hay mina (7)
					 { 
						 this.squares[i][j].value++;
					 }
					 if(j+1<this.size) {
						 if(this.squares[i+1][j+1].bomb) // Si detectamos hay mina (6)
						 {
							 this.squares[i][j].value++;
						 }
					 }
					 
				 }
			 }
		 }
	 }
	 
	 
	 public boolean putFlag(int i, int j)
	 {
		 if((i>=0 && i<this.size) && (j>=0 && j<this.size))
		 {
			 this.squares[i][j].makeFlag();
			 return true;
		 }
		 else
			 return false;
	 }
	 
	 public boolean loseGame()
	 {
		 boolean check=false;
		 int i=0;
		 while (!check && i<mines_position.size())
		 {
			if(this.squares[this.mines_position.get(i).x][this.mines_position.get(i).y].open)
			{
				check=true;
			}
			else
			{
				i++;
			}
		 }
		 
		 return check;
	 }
	 
	 public boolean gameOver() //Añadimos caso abre mina
	 {
		 boolean check=true;
		 int i=0;
		 while (check && i<this.size)
		 {
			if(!this.squares[this.mines_position.get(i).x][this.mines_position.get(i).y].flag)
			{
				check=false;
			}
			else
			{
				i++;
			}
		 }
		 
		 return check;
	 }
	 
	 
	 public void recursiveOpenSquare(int i, int j)
	 {
		 if(i>=0 && i<this.size && j>=0 && j<this.size)
		 {
			 if(this.squares[i][j].value==0)
			 {
			 /*if(j-1>=0 && i-1>=0) // arriba izq 
				{
					if((!this.squares[i-1][j-1].bomb && !this.squares[i-1][j-1].open)) 
					{
						this.squares[i-1][j-1].open=true;
						recursiveOpenSquare(i-1,j-1);
					}
				}*/
				if(j>=0 && i-1>=0) // arriba 
				{
					if(!this.squares[i-1][j].bomb && !this.squares[i-1][j].open) 
					{
						this.squares[i-1][j].open=true;
						recursiveOpenSquare(i-1,j);
					}
				}
				/*if((j+1>=0 && j+1 < this.size) && i-1>=0) // arriba derecha 
				{
					if(!this.squares[i-1][j+1].bomb &&  !this.squares[i-1][j+1].open)
					{
						this.squares[i-1][j+1].open=true;
						recursiveOpenSquare(i-1,j+1);
					}
				}*/
				if(j-1>=0 && i>=0) // izq 
				{
					if(!this.squares[i][j-1].bomb && !this.squares[i][j-1].open) 
					{
						this.squares[i][j-1].open=true;
						recursiveOpenSquare(i,j-1);
					}
				}
				if((j+1>=0 && j+1 <this.size) && i>=0) // derecha 
				{
					if(!this.squares[i][j+1].bomb && !this.squares[i][j+1].open) 
					{
						this.squares[i][j+1].open=true;
						recursiveOpenSquare(i,j+1);
					}
				}
				/*if(j-1>=0 && (i+1>=0 && i+1 <this.size)) // abajo izq
				{
					if(!this.squares[i+1][j-1].bomb && !this.squares[i+1][j-1].open) 
					{
						this.squares[i+1][j-1].open=true;
						recursiveOpenSquare(i+1,j-1);
					}
				}*/
				if(j>=0 && (i+1>=0 && i+1 <this.size)) // abajo
				{
					if(!this.squares[i+1][j].bomb && !this.squares[i+1][j].open) 
					{
						this.squares[i+1][j].open=true;
						recursiveOpenSquare(i+1,j);
					}
				}
				/*if((j+1>=0 && j+1<this.size) && (i+1>=0 && i+1<this.size)) // abajo izq
				{
					if(!this.squares[i+1][j+1].bomb && !this.squares[i+1][j+1].open) 
					{
						this.squares[i+1][j+1].open=true;
						recursiveOpenSquare(i+1,j+1);
					}
				}*/
			 }
		 }
	 }
	 
	
}
