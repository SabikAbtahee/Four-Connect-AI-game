package main;

import java.util.Scanner;

public class Game {
	private Scanner input;
	private Board board;
	private Computer computer;
	
	
	
	
	public Game(Board board,Computer computer,Scanner input) {
		
		this.board=board;
		this.computer=computer;
		this.input=input;
		
	}
	
	public void homeScreen() {						//Gives the option for one player and two player
		
		System.out.println("Homescreen");
		int option=onePlayerOrTwoPlayerOption();
		runGame(option);
		
	}
	public int onePlayerOrTwoPlayerOption() {		//Takes input from user to proceed game to one player or two player
		int option;
		while(true) {
			System.out.println("Press 1 for One player AI match\nPress 2 for two player\n");
			option=input.nextInt();
			if(option==1 || option==2) {
				return option;
			}
			else {
				System.out.println("Wrong input try again\n");
			}
		}
		
	}
	public void runGame(int option) {
		if(option==1) {
			computer.AIMatch();
		}
		else {
			computer.twoPlayerMatch();
		}
	}
	
	public void checkWinner() {
		
	}
	
}
