package GE;

public class RandomWordManagement {
import java.util.Random;

   public static void getRandomWord() 
    {

    String[] word = {"Artichoke", "Bearskin", "Cuttlefish", "Digital", "Earwax", "Fluter", "Goatsbeard", "Huckleberry", "Imposter", "Juniper", "Knobbly", "Lantern", "Mammoth", "Nightmare", "Origami", "Playwright", "Quartzrose", "Racoon", "Sorcerer", "Tablespoon", "Ultrasound", "Vessel", "Yesterday", "Zesty"};

    System.out.println( word[new Random().nextInt(word.length)]);

    }
}
