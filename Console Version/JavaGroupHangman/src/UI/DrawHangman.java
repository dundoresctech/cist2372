/*Author of DrawHangman.java: William Blaine Young
 * Date of creation: 1/20/2019
 * Purpose: Review Java 1 information in a class project environment.
 * 
 */
package UI;

public class DrawHangman {

	public static void main(String[] args) {
		for(int i = 0; i < 7; i++) {
			int howManyWrongGuesses = i;
			drawCurrentHangman(howManyWrongGuesses);
		}
	}	
	
	
	public static void drawCurrentHangman(int howManyWrongGuesses) {
		   if(howManyWrongGuesses == 0) {
		  	    System.out.println("------------");
			    System.out.println("|           ");
			    System.out.println("|           ");
			    System.out.println("|           ");
			    System.out.println("|           ");
			    System.out.println("|           ");
			    System.out.println("|           ");
			    System.out.println("|           ");
			    System.out.println("|           ");
			    System.out.println("|           ");
			    System.out.println("-------------");
		   }else if(howManyWrongGuesses == 1) {
				System.out.println("------------");
				System.out.println("|           |");
				System.out.println("|           |");
				System.out.println("|           0");
				System.out.println("|           ");
				System.out.println("|           ");
				System.out.println("|           ");
				System.out.println("|           ");
				System.out.println("|           ");
				System.out.println("|           ");
				System.out.println("-------------");
			} else if(howManyWrongGuesses == 2) {
				System.out.println("------------");
				System.out.println("|           |");
				System.out.println("|           |");
				System.out.println("|           0");
				System.out.println("|          -+-");
				System.out.println("|           ");
				System.out.println("|           ");
				System.out.println("|           ");
				System.out.println("|           ");
				System.out.println("|           ");
				System.out.println("-------------");
			} else if(howManyWrongGuesses == 3) {
				System.out.println("------------");
				System.out.println("|           |");
				System.out.println("|           |");
				System.out.println("|           0");
				System.out.println("|         /-+-\\ ");
				System.out.println("|           ");
				System.out.println("|           ");
				System.out.println("|           ");
				System.out.println("|           ");
				System.out.println("|           ");
				System.out.println("-------------");
			} else if(howManyWrongGuesses == 4) {
				System.out.println("------------");
				System.out.println("|           |");
				System.out.println("|           |");
				System.out.println("|           0");
				System.out.println("|         /-+-\\ ");
				System.out.println("|           |");
				System.out.println("|           |");
				System.out.println("|           ");
				System.out.println("|           ");
				System.out.println("|           ");
				System.out.println("-------------");
			} else if(howManyWrongGuesses == 5) {
				System.out.println("------------");
				System.out.println("|           |");
				System.out.println("|           |");
				System.out.println("|           0");
				System.out.println("|         /-+-\\ ");
				System.out.println("|           |");
				System.out.println("|           |");
				System.out.println("|          | ");
				System.out.println("|          | ");
				System.out.println("|           ");
				System.out.println("-------------");
			} else if(howManyWrongGuesses == 6) {
				System.out.println("------------");
				System.out.println("|           |");
				System.out.println("|           |");
				System.out.println("|           0");
				System.out.println("|         /-+-\\ ");
				System.out.println("|           |  ");
				System.out.println("|           |  ");
				System.out.println("|          | |");
				System.out.println("|          | |");
				System.out.println("|             ");
				System.out.println("-------------");
			}
		}
}


