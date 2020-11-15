package ProjecteProblemas;

import java.util.Scanner;

public class Keyboard {
	private Scanner scanner;
	Pair[] position;
	int input;
	
	public Keyboard(){
	}
	
	public Pair getPositions(int size)
	{
		boolean check=false;
		int first=0;
		int second=0;
		while(!check)
		{
			Scanner sc = new Scanner(System.in);
			first = (int) sc.nextInt();
			second = (int) sc.nextInt();
			if(first>=1 && first<=size && second>=1 && second<=size)
				check=true;
			else
				System.out.print("Coordinates are wrong. Retry again");
		}
		Pair e =new Pair(first, second);
		return e;
	}
	
	public int getInput_Gametype(int size) // 1,2
	{
		boolean check=false;
		int x=0;
		while(!check)
		{
			Scanner sc = new Scanner(System.in);
			x = (int) sc.next().charAt(0) - 48;
			if(x>=1 && x<=2)
				check=true;
			else
				System.out.print("Inválido.Introduce el valor");
		}
		return x;
	}
	
	public int getInput_GameDifficult() // 1,2,3
	{
		boolean check=false;
		int x=0;
		while(!check)
		{
			Scanner sc = new Scanner(System.in);
			x = (int) sc.next().charAt(0) - 48;
			if(x>=1 && x<=3)
				check=true;
			else
				System.out.print("Inválido.Introduce el valor");
		}
		return x;
	}
	
	
	
}
