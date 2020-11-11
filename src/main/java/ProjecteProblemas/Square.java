package ProjecteProblemas;

public class Square 
{
	public boolean open;
	public String value; //0,1,2,3,4,5,6,7 y 8
	public boolean bomb;
	public boolean flag;
	
	Square()
	{
		this.open=false;
		this.value=" ";
		this.bomb=false;
		this.flag=false;
	}
	
	public void makeBomb()
	{
		this.value="X";
		this.bomb=true;
	}

}
