import java.util.Random;

public class Player {
	
	private String name; // The player's name
	private String guess; // The player's guess
	private int points; // The player's points
	
	//Constructor of player that includes the players name
	public Player(String playerName)
	{
		name = playerName;
		guess = "";
		points = 0;
	}
	
	// Causes the players to guess either even or odd
	public void makeGuess()
	{
		// Creating the random object
		Random rand = new Random();
		
		// Get a random number, either 0 or 1
		int guessNumber = rand.nextInt(2);
		
		//Convert the random number to a guess of either even or odd
		if (guessNumber == 0)
			guess = "Cho (even)";
		else
			guess = "Han (odd)";
	}
	
	// This method adds a specific number of points to the players current balance. The number of points is passed as an argument
	public void addPoints(int newPoints)
	{
		points += newPoints;
	}
	
	// This method returns the player's name
	public String getName()
	{
		return name;
	}
	
	// This method returns the players guess
	public String getGuess()
	{
		return guess;
	}
	
	// This method returns the player's points
	public int getPoints()
	{
		return points;
	}

}
