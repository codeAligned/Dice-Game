import java.util.Scanner;

public class ChoHan {
	
	public static void main(String[] args)
	{
		final int MAX_ROUNDS = 5; // Number of rounds
		String player1Name;       // First player's name
		String player2Name;		  // Second player's name
		
		//Creating the scanner
		Scanner kbd = new Scanner(System.in);
		
		//Get the players names
		System.out.print("Enter the first players name: ");
		player1Name = kbd.nextLine();
		System.out.print("Enter the second player's name: ");
		player2Name = kbd.nextLine();
		
		//Creating the dealer
		Dealer dealer = new Dealer();
		
		// Create the two players
		Player player1 = new Player(player1Name);
		Player player2 = new Player(player2Name);
		
		//Player the rounds
		for (int round = 0; round < MAX_ROUNDS; round++)
		{
			System.out.println("----------------------------");
			System.out.printf("Now playing round %d.\n", round + 1);
			
			// Roll the dice
			dealer.rollDice();
			
			// The players make their guesses
			player1.makeGuess();
			player2.makeGuess();
			
			//Determining the winner of the round
			roundResults(dealer, player1, player2);
		}
		
		// Display the grand winner
		displayGrandWinner(player1, player2);
	}
	
	// The roundResults method determines the results of the current round. 
	public static void roundResults(Dealer dealer, Player player1, Player player2)
	{
		// Show the dice values
		System.out.printf("The dealer rolled %d and %d.\n", dealer.getDie1Value(), dealer.getDie2Value());
		System.out.printf("Result: %s\n", dealer.getChoOrHan());
		
		// Check each player's guess and award points.
		checkGuess(player1, dealer);
		checkGuess(player2, dealer);
	}
	
	// The checkGuess method checks a player's guess against the dealers result.
	public static void checkGuess(Player player, Dealer dealer)
	{
		final int POINTS_TO_ADD = 1; // Points to award winner
		String guess = player.getGuess();
		String choHanResult = dealer.getChoOrHan();
		
		//Display the player's guess
		System.out.printf("The player %s guessed %s.\n", player.getName(), player.getGuess());
		
		// Award points if the player guessed correctly.
		if (guess.equalsIgnoreCase(choHanResult))
		{
			player.addPoints(POINTS_TO_ADD);
			System.out.printf("Awarding %d points(s) to %s.\n", POINTS_TO_ADD, player.getName());
		}
	}
	
	// displayGrandWinner method displays the game's grand winner.
	public static void displayGrandWinner(Player player1, Player player2)
	{
		System.out.println("--------------------------------------");
		System.out.println("Game over. Here are the results: ");
		System.out.printf("%s: %d points.\n", player1.getName(), player1.getPoints());
		System.out.printf("%s: %d points.\n", player2.getName(), player2.getPoints());
		
		if (player1.getPoints() > player2.getPoints())
			System.out.println(player1.getName() + " is the grand winner!");
		else if (player2.getPoints() > player1.getPoints())
			System.out.println(player2.getName() + " is the grand winner!");
		else
			System.out.println("Both players are tied!");
	}
}
