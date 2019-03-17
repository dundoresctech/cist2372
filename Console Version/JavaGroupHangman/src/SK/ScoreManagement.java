package SK;

public class ScoreManagement {
    private static int howManyWrongGuesses = 0;
    public static int howManyWrongGuesses(String updatedAstWord, String astWord){
        if(updatedAstWord == astWord) {
            howManyWrongGuesses++;
        }
        return howManyWrongGuesses;

    }
    public static boolean didPlayerWin(){
        boolean winOrLoose = true;
        //if they used all there guesses they lost
        if (howManyWrongGuesses >= 6) {
            winOrLoose = false;
        }
        return winOrLoose;
    }
    public static boolean isGameRunning(int howManyWrongGuesses)
    {

        if(howManyWrongGuesses == 6)
        {
              return false;
        }
        else
        {
            return true;
        } 
    }
}
