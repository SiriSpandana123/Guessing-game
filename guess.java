import java.util.Scanner;

public class NumberGuessingGame {
	public static void
	NumberGuessingGame()
	{
		Scanner sc = new Scanner(System.in);
		int number = 1 + (int)(100
							* Math.random());
		int j = 7;
		int i, guess;
		System.out.println("Choose a number of your choice"
		+ " between 1 to 100."+ "Guess the number"+ " within 3 trials.");
		for (i = 0; i < j; i++) 
		{
			System.out.println(
				"Guess the  Correct number:");
			guess = sc.nextInt();
			if (number == guess) 
			{
				System.out.println("Wondrafull!"+ " You Successfully guessed the number.");
				break;
			}
			else if (number > guess && i != j - 1) 
			{
				System.out.println("The number is "+ "greater than " + guess);
			}
			else if (number < guess && i != j - 1) 
			{
				System.out.println("The number is"+ " less than " 
				+ guess);
			}
		}
        if (i == j) 
		{
			System.out.println("The number we selected was " 
			+ number);
		}
	}
	public static void
	main(String arg[])
	{
		NumberGuessingGame();
	}
}
