
/*Author of Main.java: Jacob Mitchell
 * Date of Creation: 1/20/2019
 * Purpose: Review Java 1 information in a class Project environment.
 * Class: CIST 2372 Java 2
 * 
 */
public class MainClass {
	
	public static void main(String[] args) {
		boolean gameRestart = true;
		while(gameRestart == true){//UX is handling gameRestart variable. 
	
			//Initialize variables and reset variables for when restarting game.
			int howManyWrongGuesses = 0;
			String astWord = null;
			boolean isGameRunning = true;
			String wordToGuess = GE.RandomWordManagement.getRandomWord();//GE
			
			UI.GameStartManagement.printGameStartInfo();//UX
				
				while (isGameRunning == SK.ScoreManagement.isGameRunning()){//isGameRunning value controlled by SK
				
					astWord = GE.RandomWordManagement.getAstWord(wordToGuess);//GE
					System.out.println(astWord);
					UI.DrawHangman.drawCurrentHangman(howManyWrongGuesses);//UX	
					//takes input. validates it. then returns the astword.
					String variableToPassToSK = GE.UserGuessManagement.takeUserGuess( astWord, wordToGuess);//this will return the new astWord basically. If it is the same as the current astWord, the guess was wrong. SK will use an if to determine this
					// need to check guessedChar=word function goes here managed by SK
					howManyWrongGuesses = SK.ScoreManagement.howManyWrongGuesses(variableToPassToSK, astWord);//SK
					UI.DrawHangman.drawCurrentHangman(howManyWrongGuesses);//UX
					
				}//end of isGameRunning loop
			
			boolean winOrLoose = SK.ScoreManagement.didPlayerWin();
			UI.GameOverManagement.printGameOverInfo(winOrLoose);//UX
			UI.GameOverManagement.playAgain();//UX
		}//end of gameRestart loop
		System.exit(0);
	}
}

