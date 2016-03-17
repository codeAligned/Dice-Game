
public class Dealer {
	
	private int die1Value; //The value of die #1
	private int die2Value; //The value of die #2
	
	// Dealer Constructor
	public Dealer()
	{
		die1Value = 0;
		die2Value = 0;
	}
	
	// Rolling the dice method
	public void rollDice()
	{
		final int SIDES = 6; // Number of sides for the dice
		
		//Create the two dice. This will also roll the dice
		Die die1 = new Die(SIDES);
		Die die2 = new Die(SIDES);
		
		//Record their values
		die1Value = die1.getValue();
		die2Value = die2.getValue();
	}
	
	// This method returns the result of the roll. If the sum of the dice is even, the method returns "Cho (even)". Otherwise, it returns "Han (odd)".
	public String getChoOrHan()
	{
		String result; // To hold the result
		
		// Get the sum of the dice.
		int sum = die1Value + die2Value;
		
		// Determine even or odd.
		if (sum % 2 == 0)
			result = "Cho (even)";
		else
			result = "Han (odd)";
		
		//Return result.
		return result;
	}
	
	// This method returns value of die #1
	public int getDie1Value()
	{
		return die1Value;
	}
	
	// This method returns value of die #2
	public int getDie2Value()
	{
		return die2Value;
	}
}
