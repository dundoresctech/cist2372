//Created by Terry Dorsey//
package Menus;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GamePlay extends JFrame
{
	private static final long serialVersionUID = 1L; //recommended by eclipse
	
	char[] currentWordArray;
	char[] toBeBlankArray;
	int failCounter = 1;
	
	//define a random word somewhere here
	String whichHangmanPath = "/ImageAssets/hangman" + failCounter + ".png";
	
	JPanel entireGameBoard;
	JLabel wordToGuess;
	JLabel hangmanHolder;
	JButton butA, butB, butC, butD, butE, butF, butG, butH, butI, butJ,
	butK, butL, butM, butN, butO, butP, butQ, butR, butS, butT, butU, butV,
	butW, butX, butY, butZ;
	
	public GamePlay(int xLocation, int yLocation)
	{
		butA = new JButton("A");
		butB = new JButton("B");
		butC = new JButton("C");
		butD = new JButton("D");
		butE = new JButton("E");
		butF = new JButton("F");
		butG = new JButton("G");
		butH = new JButton("H");
		butI = new JButton("I");
		butJ = new JButton("J");
		butK = new JButton("K");
		butL = new JButton("L");
		butM = new JButton("M");
		butN = new JButton("N");
		butO = new JButton("O");
		butP = new JButton("P");
		butQ = new JButton("Q");
		butR = new JButton("R");
		butS = new JButton("S");
		butT = new JButton("T");
		butU = new JButton("U");
		butV = new JButton("V");
		butW = new JButton("W");
		butX = new JButton("X");
		butY = new JButton("Y");
		butZ = new JButton("Z");
		
		this.setVisible(true);//setting up the window
		this.setSize(500,900);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(xLocation + 75, yLocation - 100); //set equal to other window and offset. I'm sure there's a better way
		this.setResizable(false);
		this.setTitle("Hangman");
		
		Font fontForGuess = new Font("Algerian", Font.PLAIN, 30);
		
		//defining new JPanels
		entireGameBoard = new JPanel(); //field so I can call it on listener action
		JPanel keyboardHolder = new JPanel();
		JPanel gridForRows = new JPanel();
		JPanel topRow  = new JPanel();
		JPanel medRow = new JPanel();
		JPanel bottomRow = new JPanel();
		
		//JLabels
		hangmanHolder = new JLabel();
		wordToGuess = new JLabel();
		
		hangmanHolder.setIcon//draws the first image in the set
		(
			new ImageIcon(getClass().getResource("/ImageAssets/hangman1.png"))
		);
			
		//sets up layouts for JPanels
		gridForRows.setLayout(new GridLayout(3, 0, 3, 3)); //(rows, cols(0 means auto), xpadding, ypadding)
		topRow.setLayout(new FlowLayout());
		medRow.setLayout(new FlowLayout());
		bottomRow.setLayout(new FlowLayout());
		entireGameBoard.setLayout(new FlowLayout());
				
		//make an array that contains blanks the length of the currentWord @getAstWord()
		
		String wordToDisplay = new String(toBeBlankArray);//toBeBlankArray.toString(); wasn't working, so String Constructor
		
		wordToGuess.setText(wordToDisplay);
		wordToGuess.setFont(fontForGuess);                             
		
		//sets up keyboard
		topRow.add(butQ);
		topRow.add(butW);
		topRow.add(butE);
		topRow.add(butR);
		topRow.add(butT);
		topRow.add(butY);
		topRow.add(butU);
		topRow.add(butI);
		topRow.add(butO);
		topRow.add(butP);

		medRow.add(butA);
		medRow.add(butS);
		medRow.add(butD);
		medRow.add(butF);
		medRow.add(butG);
		medRow.add(butH);
		medRow.add(butJ);
		medRow.add(butK);
		medRow.add(butL);
		
		bottomRow.add(butZ);
		bottomRow.add(butX);
		bottomRow.add(butC);
		bottomRow.add(butV);
		bottomRow.add(butB);
		bottomRow.add(butN);
		bottomRow.add(butM);
		
		//adding all my layouts together
		gridForRows.add(topRow);
		gridForRows.add(medRow);
		gridForRows.add(bottomRow);
		keyboardHolder.add(gridForRows);
		entireGameBoard.add(hangmanHolder);
		entireGameBoard.add(wordToGuess);
		entireGameBoard.add(keyboardHolder);
		
		this.add(entireGameBoard);//adding everything to current obj
		
		//setting up Listener
		ListenForKeyboard keyboardListener = new ListenForKeyboard();
		
		//wrote this using my ButtonPrinter
		butA.addActionListener(keyboardListener);
		butB.addActionListener(keyboardListener);
		butC.addActionListener(keyboardListener);
		butD.addActionListener(keyboardListener);
		butE.addActionListener(keyboardListener);
		butF.addActionListener(keyboardListener);
		butG.addActionListener(keyboardListener);
		butH.addActionListener(keyboardListener);
		butI.addActionListener(keyboardListener);
		butJ.addActionListener(keyboardListener);
		butK.addActionListener(keyboardListener);
		butL.addActionListener(keyboardListener);
		butM.addActionListener(keyboardListener);
		butN.addActionListener(keyboardListener);
		butO.addActionListener(keyboardListener);
		butP.addActionListener(keyboardListener);
		butQ.addActionListener(keyboardListener);
		butR.addActionListener(keyboardListener);
		butS.addActionListener(keyboardListener);
		butT.addActionListener(keyboardListener);
		butU.addActionListener(keyboardListener);
		butV.addActionListener(keyboardListener);
		butW.addActionListener(keyboardListener);
		butX.addActionListener(keyboardListener);
		butY.addActionListener(keyboardListener);
		butZ.addActionListener(keyboardListener);	
	}//end of constructor
	
	private class ListenForKeyboard implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) //every time a Letter is tried, this is fired
		{	
			String buttonPressed = ((JButton) e.getSource()).getText();//gets the button that was pressed
			
			//takes the blanks and fills in the letter if guess was correct

			//update the word to guess label
			
			//disable pressed buttons
			}	
		}
	}
}