package graficSite;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import Logic.MatchFinderLogic;
import Logic.Functions;


import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class EsAfin extends JFrame {

	private JPanel contentPane;
	protected static MatchFinderLogic personas= MainScreen.personas;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EsAfin frame = new EsAfin();
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
	public EsAfin() {
		setTitle("Match Finder");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 416, 295);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Comprobar si dos personas son afines");
		lblNewLabel_1.setBounds(83, 27, 241, 26);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(personas.getPersonas()));
		comboBox.setBounds(37, 84, 107, 22);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(personas.getPersonas()));
		comboBox_1.setSelectedIndex(1);
		comboBox_1.setBounds(237, 84, 107, 22);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel = new JLabel("Es Afin con");
		lblNewLabel.setBounds(161, 88, 66, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("?");
		lblNewLabel_2.setBounds(354, 88, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel result_label = new JLabel("");
		result_label.setHorizontalAlignment(SwingConstants.CENTER);
		result_label.setBounds(73, 151, 225, 61);
		contentPane.add(result_label);

		JButton btnNewButton = new JButton("Comprobar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (Functions.esAfin(comboBox.getSelectedIndex(), comboBox_1.getSelectedIndex(),personas)) {
					result_label.setText("Son afines");
				}else {
					result_label.setText("No son afines");
				}
				
			}
		});
		btnNewButton.setBounds(129, 117, 114, 23);
		contentPane.add(btnNewButton);
		
	}
}
