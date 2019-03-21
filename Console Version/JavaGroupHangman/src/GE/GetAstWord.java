/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import java.util.Scanner;
import static javax.management.Query.GE;

/**
 *
 * @author Gr01stu211
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    

import java.util.Scanner;

public class UserGuessManagement 
{
	public static String takeUserGuess(String astWord, String wordToGuess)
	{
		boolean keepLooping = true;
		boolean[] isArrayRight;
		String letterEntered;
		String newAstWord; 
		String upperCaseCurretWord;
		char guessedLetter = 0;
		char[] astWordArr = astWord.toCharArray();
		char[] currentWordArray;

		System.out.println("Enter a letter to guess.");
		Scanner someScanner = new Scanner(System.in);
		
		while(keepLooping == true)//loops until input is validated
		{
			letterEntered = someScanner.nextLine();
			if(letterEntered.length() != 1)
			{
				System.out.println("Enter just one letter.\n Try again.");
			}
			else if(!(letterEntered.matches("[a-zA-Z]")))
			{
				System.out.println("Only use the Alphabet!\n Try again.");
			}
			else
			{
				letterEntered = letterEntered.toUpperCase();
				guessedLetter = letterEntered.charAt(0);
				keepLooping = false;
				someScanner.close();
			}
		}
		
		isArrayRight = checkArrayForMatches(wordToGuess, guessedLetter);
		upperCaseCurretWord = wordToGuess.toUpperCase();
		currentWordArray = upperCaseCurretWord.toCharArray();
		
		
		for(int x = 0; x < isArrayRight.length; x++)
		{
			if(isArrayRight[x] == true)
			{
				astWordArr[x] = currentWordArray[x];
			}
		}
		
		newAstWord = new String(astWordArr);
		return newAstWord;
	}

	public static boolean[] checkArrayForMatches(String currentWord, char charToTest)//this generates a boolean array in response to the user's guess against the current word
	{
		String upperCaseCurretWord = currentWord.toUpperCase();
		char[] currentWordArray = upperCaseCurretWord.toCharArray();
		boolean[] returnArray = new boolean[currentWordArray.length];
		
		for(int x = 0; x < returnArray.length; x++)
		{
			char characterInArray = currentWordArray[x];
			if(characterInArray == charToTest)
			{
				returnArray[x] = true;
			}
			else 
			{
				returnArray[x] = false;
			}		
		}
 		return returnArray;
	}

    }
    
}
