package game;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;



public class Cell extends JButton  {

	 // instance variables
	private boolean matched = false;
	private boolean selected = false;
	private JButton button;
	private String name;
	private Icon icon;
	private Board board;
	 

	//constructor
	 public Cell(String name, Board board) {
		System.out.println("create cell with name: " + name);
		this.name = name;
		this.button= new JButton(name);
		
	}

	 public JButton getButton() {
		 return this.button;
	 }

}


