package GE;

public class RandomWordManagement {
import java.util.Random;

   public static void getRandomWord() 
    {

    String[] word = {"Artichoke", "Bearskin", "Cuttlefish", "Digital", "Earwax", "Fluter", "Goatsbeard", "Huckleberry", "Imposter", "Juniper", "Knobbly", "Lantern", "Mammoth", "Nightmare", "Origami", "Playwright", "Quartzrose", "Racoon", "Sorcerer", "Tablespoon", "Ultrasound", "Vessel", "Yesterday", "Zesty"};

    System.out.println( word[new Random().nextInt(word.length)]);
      	public static void hang(String guess) {
		String newasterisk = "";
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == guess.charAt(0)) {
				newasterisk += guess.charAt(0);
			} else if (asterisk.charAt(i) != '*') {
				newasterisk += word.charAt(i);
			} else {
				newasterisk += "*";
			}
		}

		if (asterisk.equals(newasterisk)) {
			count++;
			hangmanImage();
		} else {
			asterisk = newasterisk;
		}
		if (asterisk.equals(word)) {
			System.out.println("Correct! You win! The word was " + word);
		}

    }
}
