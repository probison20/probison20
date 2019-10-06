//Patrick Robison ID: 1212987774

package cse360assign2;

import java.util.Arrays;

public class AddingMachine 
{
	private int total;
	private String operator[] = new String[100];	//Array of size 100 consisting of +s or -s accordingly. I assume input won't be above 100.
	private int valueHistory[] = new int[100];		//Array consisting of 100 ints.
	private int totalActions = 0;					//Integer used to count the total number of actions the user takes.
	private int loopIncrement;						//Used to go through a while loop.
	private String returnString = "";				//String used for toString output.
	
	public AddingMachine () 
	{
		total = 0;  								//Needed.
		valueHistory[0] = total;					//Initialize the first value to 0.
		totalActions++;								//Increment.
	}

	public int getTotal () 
	{
		return total;
	}
	public void add (int value) 
	{
		total += value;								//Add value to total.
		operator[totalActions] = "+";				//Stores operator used.
		valueHistory[totalActions] = value;			//Stores value used.
		totalActions++;								//Increment.
	}

	public void subtract (int value) 
	{
		total -= value;								//Subtracts value to total.
		operator[totalActions] = "-";				//Stores operator used.
		valueHistory[totalActions] = value;			//Stores value used.
		totalActions++;								//Increment.
	}
	
	public String toString () 
	{
		returnString = "" + valueHistory[0];		//Resets returnString.
		loopIncrement = 1;							//Resets loopIncrement.
		while(loopIncrement < totalActions)			//While loop based on totalActions - 1.
		{	//The return string shall return all the operators followed by their respective value.
			returnString += " " + operator[loopIncrement] + " " + valueHistory[loopIncrement];
			loopIncrement++;	//Increment loop end condition.
		}
		return returnString;	//Return.
	}

	public void clear() 
	{
		total = 0;				//Reset total and totalActions.
		totalActions = 1;		//The values in the arrays won't matter as they will be soon overridden or not appear due to totalActions
	}							//not going that high.
}