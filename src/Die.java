import java.util.Random;

public class Die {
	
	private int sides; // Number of sides
	private int value; // The die's value
	
	//Die Constructor
	public Die(int numSides)
	{
		sides = numSides;
		roll();
	}
	
	// The roll method simulates the rolling of the dice
	public void roll()
	{
		//Creating a random object.
		Random rand = new Random();
		
		// Get a random value for the die.
		value = rand.nextInt(sides) + 1;
	}
	
	// This method returns the number of sides for the die.
	public int getSides()
	{
		return sides;
	}
	
	//This method returns the value of the die.
	public int getValue()
	{
		return value;
	}
}
