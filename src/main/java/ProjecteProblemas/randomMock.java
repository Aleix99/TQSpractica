package ProjecteProblemas;

import java.util.Random;

public class randomMock extends Random {
	
	int index;
	int[] num_random_mines;
	int[] num_random;
	
	
	randomMock()
	{
		index=0;
	}
	
	public void setMinesPosition(Pair[] positions,int boardSize) //Este método es solo para test
	{
		int lenght=positions.length;
		int index_positions=0;
		int o=0;
		num_random_mines = new int [boardSize*boardSize];
		for( int i=0;i<boardSize;i++)
		{
			for (int j=0; j<boardSize; j++)
			{
				if(index_positions<lenght)
				{
					if(positions[index_positions].x==i && positions[index_positions].y==j)
					{
						num_random_mines[o]=1;
						o++;
						index_positions++;
					}
					else
					{
						num_random_mines[o]=0;
						o++;
					}
				}
				else
				{
					num_random_mines[o]=0;
					o++;
				}
			}
		}
	}
	
	
	public int nextInt(int i)
	{
		int pass=num_random_mines[index];
		index++;
		return pass;
	}
	

}
