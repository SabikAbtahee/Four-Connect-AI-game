package main;
import java.util.Scanner;
public class Driver {
	
	
	public Driver() {
		Scanner input = new Scanner(System.in);
		
		Board board = new Board();
		
		Computer computer = new Computer(board,input);
		Game game = new Game(board,computer,input);
		
		
		
		
		game.homeScreen();
		
		
	}
}
