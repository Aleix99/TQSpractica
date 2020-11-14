package ProjecteProblemas;

//MockKeyboard se pone en el TestX donde deberia ir un objeto tipo Keyboard. Pero como es algo dinamico que depende del
//usuario, ponemos el mock. El mock solo devuelve estructuras y estas estructuras toman los valores entrados en el mismo TestX

public class MockKeyboard extends Keyboard {

	Pair[] position;
	int input;
	
	public MockKeyboard(){
		
	}
	
	public Pair[] getPositions()
	{
		return position;
	}
	
	public int getInput()
	{
		return input;
	}
}
