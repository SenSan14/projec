package game;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;



public class Cell extends JButton  {
	
	private String name;
	private int image;
	
	private boolean matched = false;
	private boolean selected = false;
	
	private JButton button;

	//constructor
	 public Cell() {
		this.button= new JButton("test");
	 }

	 public String getName() {
		 return this.name;
	 }
	 
	 public void setImage() {
		 Icon icon = new ImageIcon("C:\\Users\\Senne\\Pictures\\Memory Game.PNG");
		 
	 }
	 
	 public void setMatched() {
		 
	 }
	 
	 public JButton getButton() {
		 return this.button;
	 }
}


