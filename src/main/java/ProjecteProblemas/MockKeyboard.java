package ProjecteProblemas;

//MockKeyboard se pone en el TestX donde deberia ir un objeto tipo Keyboard. Pero como es algo dinamico que depende del
//usuario, ponemos el mock. El mock solo devuelve estructuras y estas estructuras toman los valores entrados en el mismo TestX

public class MockKeyboard extends Keyboard {

	Pair[] position;
	int[] input;
	int gametype_index; //1-Open Square 2-Put/Remove Flag
	int positions_index;
	
	public MockKeyboard(){
		
	}
	
	public void setGametype(int[] inputs)
	{
		input=inputs;
	}
	
	public void setPositions(Pair[] potitions)
	{
		position=potitions;
	}
	
	
	public Pair[] getPositions()
	{
		return position;
	}
	
	public int[] getInput_Gametype()
	{
		return input;
	}
	
	public Pair[] getInput_positions()
	{
		return position;
	}
}
