package graficSite;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GustosPersonas extends JFrame {

	private JPanel contentPane;
	private String[] personas= MainScreen.personas.getPersonas();
	private String[] hobbies = MainScreen.personas.getHobbies();
	private JLabel[] personasLabels = new JLabel[personas.length];
	private JLabel[] hobbiesLabels = new JLabel[hobbies.length];
	private GridBagConstraints[] personasGrid= new GridBagConstraints[personasLabels.length];
	private GridBagConstraints[] hobbiesGrid= new GridBagConstraints[hobbiesLabels.length];
	private JCheckBox[][] gustosCheckBoxes= new JCheckBox[personasLabels.length][hobbiesLabels.length];
	private GridBagConstraints[] gustosGrid= new GridBagConstraints[personasLabels.length*hobbiesLabels.length];
	private boolean[][] gustosBooleanMatriz = new boolean[personasLabels.length][hobbiesLabels.length];
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GustosPersonas frame = new GustosPersonas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GustosPersonas() {
		setTitle("Match Finder");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 503, 323);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JButton sendGustosButton = new JButton("Send");
		
		GridBagConstraints gbc_sendGustosButton = new GridBagConstraints();
		gbc_sendGustosButton.insets = new Insets(0, 0, 5, 0);
		gbc_sendGustosButton.gridx = 14;
		gbc_sendGustosButton.gridy = 9;
		contentPane.add(sendGustosButton, gbc_sendGustosButton);
		sendGustosButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i =0; i<gustosCheckBoxes.length;i++) {
					for(int j=0; j<gustosCheckBoxes[i].length;j++) {
						if(gustosCheckBoxes[i][j].isSelected()) {
							gustosBooleanMatriz[i][j]=true;
						}
						else {
							gustosBooleanMatriz[i][j]=false;
						}
					}
				}
				System.out.println(gustosBooleanMatriz[0][0]);
				MainScreen.personas.setMatriz(gustosBooleanMatriz);
				EsAfin afin = new EsAfin();
				dispose();
				afin.setDefaultCloseOperation(HIDE_ON_CLOSE);
				afin.setVisible(true);
			}
		});
		//////Check box Matrix////
		for(int i=0; i<personasLabels.length;i++) {
			
			for(int j=0; j<hobbiesLabels.length;j++) {
				gustosCheckBoxes[i][j]= new JCheckBox("");
				gustosGrid[i] = new GridBagConstraints();
				gustosGrid[i].insets= new Insets(0, 0, 5, 5);
				gustosGrid[i].gridx = j+1;
				gustosGrid[i].gridy = i+1;
				contentPane.add(gustosCheckBoxes[i][j], gustosGrid[i]);
			}
		}
		/////Jlabel Array Hobbies/////
		for(int i=0; i<hobbiesLabels.length;i++) {
			hobbiesLabels[i]= new JLabel(hobbies[i]);
			hobbiesGrid[i]= new GridBagConstraints();
			hobbiesGrid[i].insets = new Insets(0, 0, 5, 5);
			hobbiesGrid[i].gridx = i+1;
			hobbiesGrid[i].gridy = 0;
			contentPane.add(hobbiesLabels[i], hobbiesGrid[i]);
		}
		///////Jlabel array Personas////
		for(int i=0; i<personasLabels.length;i++) {
			personasLabels[i]= new JLabel(personas[i]);
			personasGrid[i]= new GridBagConstraints();
			personasGrid[i].insets = new Insets(0, 0, 5, 5);
			personasGrid[i].gridx = 0;
			personasGrid[i].gridy = i+1;
			contentPane.add(personasLabels[i], personasGrid[i]);
		}
		gustosCheckBoxes[1][1].isSelected();
		
	}

}
