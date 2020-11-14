package ProjecteProblemas;

public class Client 
{
	static Keyboard generalkeyboard = new Keyboard();
	
	
	public static void main(String [] args) 
	{
		Game generalGame = new Game();
		
		//Menu
		System.out.println("   MINE FINDER :  ");
		System.out.println("Choose an option:");
		System.out.println("1 : Play ");
		System.out.println("2 : Exit :C");
		
		int number= generalkeyboard.getInput_Gametype(0);
		switch(number)
		 {
		 case 1:
			 System.out.println("Choose difficult:");
			 System.out.println("1 - Easy");
			 System.out.println("2 - Medium");
			 System.out.println("3 - Hard");
			 number= generalkeyboard.getInput_Gametype(0);
			 generalGame.initializeBoard(number);
			 generalGame.gameStart(0);
			 break;
		 case 2:
			   System.out.println("Bye!");
		       //System.exit(1); //non zero value to exit says abnormal termination of JVM
			 break;
		 }
		return;
		
		
	}

}
