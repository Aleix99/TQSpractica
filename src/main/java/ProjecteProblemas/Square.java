package ProjecteProblemas;

import java.util.ArrayList;
import java.util.List;

public class Square
{
	public boolean open;
	public int value; //0,1,2,3,4,5,6,7 y 8
	public boolean bomb;
	public boolean flag;
	
	Square()
	{
		this.open=false;
		this.value=0;
		this.bomb=false;
		this.flag=false;
	}
	
	public void makeBomb()
	{
		this.bomb=true;
	}
	
	public void makeFlag()
	{
		if(this.flag)
			this.flag=false;
		else
			this.flag=true;
	}
	

}
