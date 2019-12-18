package game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;

import game.CellFactory;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class Board {
	
	static int numberOfRows;
	static int numberOfColums;
	
	private Cell[][] cells ;
	private String boardCells ;
	
	private CellFactory cellFactory;
	
	//constructor of the board
	public Board(int rows, int columns) {
		System.out.println("show board");
		this.cellFactory = new CellFactory(rows, columns, this);
		this.cells = this.cellFactory.getCells();
		
		JFrame f = new JFrame("Window containing a matrix");
	    JPanel p = new JPanel();
	    p.setLayout(new GridLayout(rows, columns));

	    f.add(p);
	    f.pack();
	    f.setVisible(true);
	    f.setSize(500, 500);
	    
	    //todo alle cells hun buttons oproepen en die buttons op panel p laten zien op juiste locatie

	    
	    JButton button = new JButton();
	    try {
	      
	      button.setIcon(new ImageIcon("EricCartman.png"));
	    } catch (Exception ex) {
	      System.out.println(ex);
	    }
	    
	    p.add(button);
	    f.add(p);
	}
	


	
}

