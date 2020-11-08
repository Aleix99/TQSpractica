package ProjecteProblemas;

public class Square 
{
	public boolean open;
	public String value;
	
	Square()
	{
		open=false;
		value="O";
	}
	
	public void makeBomb()
	{
		this.value="X";
	}

}
