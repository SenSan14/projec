package game;

import java.awt.Component;
import java.lang.reflect.Array;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import game.Cell;



public class CellFactory {
	
	private Cell[][] cells;
	private String path;
	
	public CellFactory (int rows, int columns, Board board){
		System.out.println("created factory for cells");
		this.newCells(rows, columns, board);
	}
	
	
	private void newCells (int rows, int columns, Board board) {
		System.out.println("create new cells");
		Cell [][] cells = new Cell[rows][columns];
		for(int i = 0; i < rows; i++) {
			for(int j = 0; columns < j; j++)
				
				//Icon image = new Icon;
				//
				cells [i][j] =  new Cell("naam", board );
		}
		this.cells = cells;
		this.ShuffleMatrix();
	}

		
	
	//in deze class constructor cell aanroepen en afbeeldingen per cell meegeven
	
	private void ShuffleMatrix() {
		
	}

	public Cell[][] getCells() {
		return this.cells;
	}
	


}
