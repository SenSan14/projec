package game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;

import game.CellFactory;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class Board {
	
	static int numberOfRows;
	static int numberOfColums;
	
	private Cell[][] cell ;
	private String boardCells ;
	
	
	//constructor of the board
	public Board(int rows, int columns) {
		JFrame f = new JFrame("Window containing a matrix");
	    JPanel p = new JPanel();
	    p.setLayout(new GridLayout(rows, columns));
	    
	    for (int i = 0; i < 10; i++) {
	        for (int j = 0; j < 10; j++) {
	            cell[i][j] = (Cell) new JButton();
	            cell[i][j].setBackground(Color.black);
	            p.add(cell[i][j]);
	        }
	    }
	       
	    
	    f.add(p);
	    f.pack();
	    f.setVisible(true);
	}
	
	public static void main(String[] args) {
		Board boardtest = new Board(10,10);
		
	}

	
}

