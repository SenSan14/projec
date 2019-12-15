package gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
 
import javax.swing.BorderFactory;
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
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import game.Board;

public class Home {
	
	private JLabel difficulty = new  JLabel("Set difficulty level: ");
	private JLabel opponent = new JLabel("Select oponent: ");
	private JLabel time = new JLabel("time allowed: ");
	private JLabel rows = new JLabel("Number of rows: ");
	private JLabel colums = new JLabel("Number of colums");
	private JButton about = new JButton("About");
	private JButton theme = new JButton("Theme");
	private JButton exit = new JButton("Exit");
	private JButton highscore = new JButton("Highscore");
	private JRadioButton easyLevel = new JRadioButton("Easy");
	private JRadioButton  mediumLevel = new JRadioButton("Medium");
	private JRadioButton hardLevel = new JRadioButton("Hard");
	private JComboBox selectOpponent = new JComboBox<String>(new String[] {"Another Player", "AI"});
	private JSlider timeSlider = new JSlider();
	private JSpinner rowSpinner = new JSpinner();
	private JSpinner columnSpinner = new JSpinner();
	
	 
}
