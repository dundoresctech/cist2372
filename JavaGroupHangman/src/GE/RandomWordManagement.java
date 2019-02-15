package GE;

import java.util.Random;

public class RandomWordManagement {


   public static String getRandomWord() 
    {

    String[] word = {"Earthquake", "Prisoner", "Communication", "Potato", "Computer Science", "Kamikaze", "Pistol", "Deoxyribonucleic Acid", "Armageddon", "Caricature", "Philosophy"};
    System.out.println( word[new Random().nextInt(word.length)]);

    Random rand = new Random();
    String randWord = new String(word[rand.nextInt(word.length)]);   
    return randWord;
    }
}
