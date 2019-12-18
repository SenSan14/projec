package gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import game.Board;

public class Home extends JFrame {
	
	private JLabel difficulty = new  JLabel("Set difficulty level: ");
	private JLabel opponent = new JLabel("Select oponent: ");
	private JLabel time = new JLabel("time allowed: ");
	private JLabel rows = new JLabel("Number of rows: ");
	private JLabel colums = new JLabel("Number of colums");
	
	//creating buttons
	private JButton about = new JButton("About");
	private JButton theme = new JButton("Theme");
	private JButton start = new JButton("Start");
	private JButton exit = new JButton("Exit");
	private JButton highscore = new JButton("Highscore");
	
	// creating radio buttons and enforcing only 1 is selected
	private JRadioButton easyLevel = new JRadioButton("Easy");
	private JRadioButton  mediumLevel = new JRadioButton("Medium");
	private JRadioButton hardLevel = new JRadioButton("Hard");
	
	//declaration and initialization of combobox
	private JComboBox selectOpponent = new JComboBox<String>(new String[] {"Another Player", "AI"});
	
	//declaration and initialization of timeslider
	private JSlider timeSlider = new JSlider();
	
	//row and column spinner without negative values
	SpinnerModel sModel = new SpinnerNumberModel(1, 1, 20, 1);
	private JSpinner rowSpinner = new JSpinner(sModel);
	private JSpinner columnSpinner = new JSpinner(sModel);
	
	private Board board;
	
	public Home()  {

		//setting up the JPanel with GridBagLayout manager
		JPanel panel = new JPanel(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.insets = new Insets(10, 10, 10, 10);
		
		//add all the components to the panel
		constraints.gridx = 0;
		constraints.gridy = 0;
		panel.add(about,constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 1;
		panel.add(difficulty, constraints);
		
		constraints.gridx = 1;
		panel.add(easyLevel, constraints);
		
		constraints.gridx = 2;
		panel.add(mediumLevel, constraints);
		
		constraints.gridx= 3;
		panel.add(hardLevel, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 2;
		panel.add(opponent, constraints);
		
		constraints.gridx = 1;
		panel.add(selectOpponent, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 3;
		panel.add(time, constraints);
		
		constraints.gridx = 1;
		panel.add(timeSlider, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 4;
		panel.add(rows, constraints);
		
		constraints.gridx = 1;
		panel.add(rowSpinner, constraints);
		
		constraints.gridx = 2;
		panel.add(colums, constraints);
		
		constraints.gridx = 3;
		panel.add(columnSpinner, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 5;
		panel.add(theme, constraints);
		
		constraints.gridx = 1;
		panel.add(start, constraints);
		
		constraints.gridx = 2;
		panel.add(exit, constraints);
		
		constraints.gridx = 3;
		panel.add(highscore, constraints);
		
		
		panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(), "Memory game menu"));
		
		//grouping the buttons
		ButtonGroup bGroup = new ButtonGroup();
		bGroup.add(easyLevel);
		bGroup.add(mediumLevel);
		bGroup.add(hardLevel);
		
		//adding labels to the slider
		Hashtable<Integer, JLabel> labelTable = new Hashtable<Integer, JLabel>();	     
		labelTable.put(new Integer( 0 ),new JLabel("Slow") );
		labelTable.put(new Integer( 50 ),new JLabel("Medium") ); 
		labelTable.put(new Integer( 100 ),new JLabel("Fast") );
		timeSlider.setLabelTable(labelTable);
		timeSlider.setPaintLabels(true);
		
		// add panel to frame
		add(panel);
		
		//centering and pack of frame
		pack();
		setLocationRelativeTo(null);
		
		//Listener on startbutton
		this.start.addActionListener(new ActionListener() {
            private Board board;

			public void actionPerformed(ActionEvent e) {
                this.board = new Board(4,4);
            }
        });
			  
			
	}
	 	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Home().setVisible(true);
			}
		});
	}
}
