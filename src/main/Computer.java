package main;

import java.util.Scanner;

public class Computer {
	private Scanner input;
	private Board board;
	
	public Computer(Board board,Scanner input) {
		this.board=board;
		this.input=input;
	}
	
	
	public void AIMatch() {
		
	}
	
	public void twoPlayerMatch() {
		
	}
	
	public void checkWinner() {
		char checkH,checkV,checkD;
		checkH=checkHorizontal();
		checkV=checkVertical();
		checkD=checkDiagonal();
	}
	public char checkHorizontal() {
		int count=0;
		char X='X',O='O';
		for(int i=0;i<board.getRowNumber();i++) {
			for(int j=0;j<board.getColumnNumber();j++) {
				if(board.getSymbol(i, j)=='X') {
					if(X=='X') {
						count++;
						O='X';
						X='X';
					}
					else {
						count=1;
						X='X';
						O='X';
					}
				}
				else if(board.getSymbol(i, j)=='O'){
					if(O=='O') {
						count++;
						X='O';
						O='O';
					}
					else {
						count=1;
						X='O';
						O='O';
					}
					
				}
				if(count>=4) {
					return X;							// Same if O is sent too
				}
			}
		}
		return '.';
	}
	public char checkVertical() {
		int count=0;
		char X='X',O='O';
		for(int i=0;i<board.getRowNumber();i++) {
			for(int j=board.getColumnNumber()-1;j>=0;j--) {
				if(board.getSymbol(i, j)=='X') {
					if(X=='X') {
						count++;
						O='X';
						X='X';
					}
					else {
						count=1;
						X='X';
						O='X';
					}
				}
				if(board.getSymbol(i, j)=='O'){
					if(O=='O') {
						count++;
						X='O';
						O='O';
					}
					else {
						count=1;
						X='O';
						O='O';
					}
					
				}
				
				if(count>=4) {
					return X;							// Same if O is sent too
				}
				if(board.getSymbol(i, j)=='.') {
					return '.';
				}
			}
		}
		return '.';
	}
	public char checkDiagonal() {
		int count=0;
		char X='X',O='O';
		for(int j=0;j<board.getColumnNumber()-3;j++) {
			for(int i=board.getRowNumber()-3,k=j;i>=0 && k<board.getRowNumber();i--,k++) {
				
			}
		}
		
		
		
		
	}
}
