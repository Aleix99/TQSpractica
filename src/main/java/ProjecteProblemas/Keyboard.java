package ProjecteProblemas;

import java.util.Scanner;

public class Keyboard {
	private Scanner scanner;
	Pair[] position;
	int input;
	
	public Keyboard(){
		
	}
	
	public Pair getPositions()
	{
		Pair e=new Pair(0,0);
		return e;
	}
	
	public int getInput_Gametype()
	{
		Scanner sc = new Scanner(System.in);
		int x = (int) sc.next().charAt(0) - 48;
		return x;
	}
	
}
