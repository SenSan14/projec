package game;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Board {
	
	//constructor
	public Board() {
		JFrame board = new JFrame("Nice Memory game");
	    board.setSize(400, 400);
	    board.setLocation(300,200);
	    board.setResizable(false); 
	    board.setVisible(true);
	}
}

