import java.util.Random;
import java.util.Scanner;
public class gameLauncher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("I'm thinking of a number between 0 to 9...");
		Random a=new Random();
		int guess=a.nextInt(10);
		System.out.println("Correct Guess is: "+ guess);
		startGame(guess);
	}
	static public void startGame(int guess)
	{
		Scanner input=new Scanner(System.in);
		Players p1=new Players();
		Players p2=new Players();
		Players p3=new Players();
		do 
		{	System.out.print("I'm Guessing ");
			p1.setGuess(input.nextInt());
			System.out.print("I'm Guessing ");
			p2.setGuess(input.nextInt());
			System.out.print("I'm Guessing ");
			p3.setGuess(input.nextInt());
			p1.display();
			p2.display();
			p3.display();
			if(p1.check(guess)||p1.check(guess)||p1.check(guess))
				break;
			else
				System.out.println("Players Have to try again");
		}while(true);
		System.out.println("We have a Winner!");
		p1.result(guess);
		p2.result(guess);
		p3.result(guess);
		System.out.println("Game Over!!");
	}

}
