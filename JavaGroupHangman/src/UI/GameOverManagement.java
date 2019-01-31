import java.util.Scanner;
public class GameOverManagement 
{
	public static void printGameOverinfo(boolean WinOrLose) //base method to print the game over/ you won message then ask if the player wants to play again.
	{
		if(WinOrLose == true) //simply checks the WinOrLose variable and then changes the message based off the results true = win, false = lose.
		{
			System.out.println("You guessed the word! Great job, You Win!");
		}
		else
		{
			System.out.println("You are out of tries! Game Over! Would you like to play again? Type Yes to play again, or No to close the Program");	
		}	
	}
	
	public static void playAgain() 
	{
		Boolean isValid = false;//used by the while loop that checks the user input - Silas
		while(!isValid) //while loop to handle exception handling - Silas
		{					Scanner reader = new Scanner(System.in);//new scanner - Silas
			System.out.println("Would you like to play again? Type Yes to play again, or No to close the Program");
			String input = reader.next();//input
				if (input.equalsIgnoreCase("Yes"))//sets the return variable for the method to true if the player types in yes - Silas
				{	
					System.out.println("Okay, Let's play again!");
					break;
				}
				else if (input.equalsIgnoreCase("No"))//sets the return variable to false if the player types in no - Silas
				{	
					System.out.println("That's to bad, see you next time!");
					reader.close();
					System.exit(0);//This variable (playAgain) should be added to main method to be used for the while loop the check if the game should run - Silas
				}
				else//if neither yes or no are entered, tells the player they didn't enter a proper input - Silas
				{
					System.out.println("Invalid input. You did not enter Yes or No. Please type Yes to continue, or No to end the program");
					isValid = false;//sets the while loop to false so it asks the player for input again - Silas
					reader.nextLine();
					continue;
				}
		}
	}	
}
