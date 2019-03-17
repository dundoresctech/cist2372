package Menus;
//Created by Terry Dorsey//
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class StartMenu extends JFrame
{
	static OptionsMenu someOptionsMenu;
	private static final long serialVersionUID = 1L;//suggested code by eclipse. 
	
	JButton playGameButton,
			optionsButton;
	private JLabel mainLabel;

	public StartMenu(int xLocation, int yLocation)
	{
		this.setSize(800,700);//doesn't really matter because this.pack, but changes spawn location
		this.setLocation(xLocation, yLocation);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("geekTechnique Hangman");
		this.setResizable(false);
		
		playGameButton = new JButton("Start Game");
		optionsButton = new JButton("Options");
		mainLabel = new JLabel();
		
		mainLabel.setIcon
		(
			new ImageIcon(getClass().getResource("/ImageAssets/hangman8.png"))
		);
		
		JPanel somePanel = new JPanel();
		somePanel.setLayout(new BorderLayout());
		somePanel.add(playGameButton, BorderLayout.WEST);
		somePanel.add(optionsButton, BorderLayout.EAST);
		somePanel.add(mainLabel, BorderLayout.CENTER);
		
		this.add(somePanel);
		this.pack();
		this.validate();//perhaps unnecessary
		
		ListenForButton someButtonListener = new ListenForButton();
		
		playGameButton.addActionListener(someButtonListener);
		optionsButton.addActionListener(someButtonListener);
	}
	
	private class ListenForButton implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			if(e.getSource() == playGameButton)
			{
				int xLocation = StartMenu.super.getX();
				int yLocation = StartMenu.super.getY();
				new GamePlay(xLocation, yLocation);
				StartMenu.super.dispose();
				
			}
			else if(e.getSource() == optionsButton)
			{
				int xLocation = StartMenu.super.getX();
				int yLocation = StartMenu.super.getY();
				someOptionsMenu = new OptionsMenu(xLocation - 28, yLocation - 200);
				StartMenu.super.dispose();
			}
		}
	}
	
	public static OptionsMenu getOptionsMenuRef()
	{
		return someOptionsMenu;
	}
}