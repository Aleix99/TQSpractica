package ProjecteProblemas;

public class Square 
{
	public boolean open;
	public String value;
	
	Square()
	{
		open=false;
		value="";
	}
	
	public void makeBomb()
	{
		this.value="X";
	}

}
