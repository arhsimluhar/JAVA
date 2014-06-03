
public class Players {
	
	static int number;
	int guess;
	int playerNumber;
	Players()
	{
		++number;
		playerNumber=number;
	}
   public void setGuess(int n)
   {
	   guess=n;
   }
   public boolean check(int a)
	{
		return a==guess;
	}
   public void display()
   {
	   System.out.println("Player " + playerNumber + " Guessed " + guess);
   }
   public void result(int a)
   {
	   System.out.println("The Player " + playerNumber + " Guessed right??" + check(a));
   }

}
