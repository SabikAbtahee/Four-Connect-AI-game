package main;

public class Board {
	private int row=6,column=7;
	
	private char board[][] = new char[row][column];		//The board where the game will be played
	
	
	public Board() {
		createBoard();
	}
	
	public void createBoard() {						// Initializes the board with dots
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				board[i][j]='.';
			}
		}
		
	}
	
	public void showBoard() {
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(board[i][j]);
				System.out.print("  ");
			}
			System.out.println("\n");
		}
	}
	
	public void setX(int x,int y) {
		board[x][y]='X';
	}
	public void setO(int x,int y) {
		board[x][y]='O';
	}
	public char getSymbol(int x,int y) {
		return board[x][y];
	}
	public int getRowNumber(){
		return row;
	}
	public int getColumnNumber() {
		return column;
	}
	
	
	
	
	
	
	
	
	
}
