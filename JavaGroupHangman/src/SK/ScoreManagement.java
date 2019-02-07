package SK;

public class ScoreManagement {
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package howmanywrongguesses;

import java.util.Scanner;

/**
 *
 * @author Gr01stu211
 */
public class HowManyWrongGuesses {
    private static final String[] words = {string, AstWord, String};
private static String word = words[(int) (Math.random() * words.length)];
private static String asterisk = new String(new char[word.length()]).replace("\0", "*");

public static void HowManyWrongGuesses(){
	Scanner sc = new Scanner(System.in);
        int count = 6;
while (count < 6 && asterisk.contains("*")) {
System.out.println("How Many Wrong Guesses");
			System.out.println(asterisk);
			String guess = sc.next();
			hang(guess); 
if (count == 1) {
}
			System.out.println("Wrong guess, try again");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
    
if (count == 2) {
			System.out.println("Wrong guess, try again");
}
		if (count == 3) {
			System.out.println("Wrong guess, try again");
}
		if (count == 4) {
			System.out.println("Wrong guess, try again");
}
		if (count == 5) {
			System.out.println("Wrong guess, try again");
if (count == 6) {
			System.out.println("The Game Is Over");



   


}
