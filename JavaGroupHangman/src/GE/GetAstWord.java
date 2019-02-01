package GE;

public class GetAstWord 
{

	public static string getAstWord(String randWord) 
	{
		char[] astWord = new char[randWord.length()];
		int i = 0;
		while(i < randWord.length())
		{
			astWord[i] = '*';
			if(randWord.charAt(i) ==' ')
			{
				astWord[i] = ' ';
			}
			i++;
		}
	}

}
