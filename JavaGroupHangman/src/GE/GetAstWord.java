package GE;

public class GetAstWord 
{
	//Creates an asterisk character array from a random word entered into the function and returns it as a string value.
	
	public static String getAstWord(String randWord) 
	{
		char[] astWord = new char[randWord.length()];
		int i = 0;
		while(i < randWord.length())
		{
			astWord[i] = '*';
			if(randWord.charAt(i) == ' ')
			{
				astWord[i] = ' ';
			}
			i++;
		}
		String newAstWord = new String(astWord);
		return newAstWord;
	}
}
