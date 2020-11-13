package ProjecteProblemas;

public class MockKeyboard {

	Pair[] position;
	int[] input;
	
	public MockKeyboard(){
		position[0]=new Pair(1,2); //MockKeyboard se pone en el TestX donde deberia ir un objeto tipo Keyboard. Pero como es algo dinamico que depende del
		//usuario, ponemos el mock. El mock solo devuelve estructuras y estas estructuras toman los valores entrados en el mismo TestX
		position[1]=new Pair(3,7);
		position[2]=new Pair(1,2);
		position[3]=new Pair(1,2);
		
		
		input = new int[1];
		
		
	}
	
	public Pair[] getPositions()
	{

		
		return position;
	}
}
