package game;

import java.awt.BorderLayout;
import game.CellFactory;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class Board {
	
	int numberOfRows;
	int numberOfColums;
	
	private CellFactory cellFactory = new CellFactory();
	private Cell[] boardCells = null;
	
	//constructor of the board
	public Board(int rows, int columns) {
		
		this.boardCells = this.cellFactory.generateCells(rows, columns);
		
		//creating the frame of the actual game
		JFrame board = new JFrame("Nice Memory game");
	    board.setSize(400, 400);
	    board.setLocation(300,200);
	    board.setResizable(false); 
	    board.setVisible(true);
	    board.setLayout(new GridLayout());
	    
	    JPanel gamefield = new JPanel();
	    JPanel scoreboard = new JPanel();
	    board.add(gamefield);
	    board.add(scoreboard);
	    
	    
	    
	    //cells neerzetten in juiste panel
	    //elke cell heeft listener
	    
	}
	
	public static void main(String[] args) {
	}


	
	
}

