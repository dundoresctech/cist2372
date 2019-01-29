package UI;

public class GameStartManagement {

public class GameStartManagement {
	public static void printGameStartInfo() {
		System.out.println("HANGMAN \n");
		System.out.println("How To Play:\n"
				+ " 	A random word will automatically be chosen and presented to you \n"
				+ " in encrypted format. Your goal is to figure out the word by guessing \n"
				+ " a single alphabetical character. If you guess a correct letter,\n"
				+ " then it will be displayed to you. If you guess all the letters,\n"
				+ " then you win. If you guess wrong, then part of a hangman will\n"
				+ " be drawn. Once the entire hangman is draw it is game over.");
	}
}
