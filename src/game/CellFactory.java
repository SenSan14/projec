package game;

import java.awt.Component;
import java.lang.reflect.Array;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import game.Cell;



public class CellFactory {
	
	private JButton[][] buttons;
	public int i,j;
	

	public Cell[][] newCells (int rows, int columns) {
		Cell [][] buttonPanel = new Cell[rows][columns];
		for(int i = 0; i < rows; i++) {
			for(int j = 0; columns < j; j++)
				buttonPanel [i][j] =  new Cell();
		}
		return buttonPanel;
	}

		
	
	//in deze class constructor cell aanroepen en afbeeldingen per cell meegeven
	
	private void ShuffledMatrix() {
		
	}
	

	public static void main(String[] args) {
		JPanel test = new JPanel()
	}

}
