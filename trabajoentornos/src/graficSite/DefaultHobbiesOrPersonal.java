package graficSite;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Logic.MatchFinderLogic;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class DefaultHobbiesOrPersonal extends JFrame {

	private JPanel contentPane;
	private MatchFinderLogic persona= MainScreen.personas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DefaultHobbiesOrPersonal frame = new DefaultHobbiesOrPersonal();
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
	public DefaultHobbiesOrPersonal() {
		setTitle("Match Finder");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 683, 444);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel tittle = new JLabel("Macth Finder");
		tittle.setBounds(5, 5, 657, 41);
		tittle.setHorizontalAlignment(SwingConstants.CENTER);
		tittle.setFont(new Font("Tahoma", Font.PLAIN, 34));
		contentPane.add(tittle);
		
		JLabel selectHolder = new JLabel("\u00BFPrefieres los hobbies por defecto o los tuyos propios?");
		selectHolder.setHorizontalAlignment(SwingConstants.CENTER);
		selectHolder.setFont(new Font("Tahoma", Font.PLAIN, 20));
		selectHolder.setBounds(79, 151, 501, 66);
		contentPane.add(selectHolder);
		
		JButton defaultButton = new JButton("Por defecto");
		
		defaultButton.setBounds(191, 264, 103, 23);
		contentPane.add(defaultButton);
		
		JButton persButton = new JButton("Personalizar");
		
		persButton.setBounds(348, 264, 113, 23);
		contentPane.add(persButton);
		String[] hobbies = persona.getHobbies();
		String hobbiesText="";
		for(String hobby : hobbies) {
			hobbiesText += "|"+hobby+"|";
		}
		JLabel defaultHobbies = new JLabel(hobbiesText);
		defaultHobbies.setBounds(155, 108, 400, 14);
		defaultHobbies.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(defaultHobbies);
		defaultButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GustosPersonas pagInsertHobbies = new GustosPersonas();
				pagInsertHobbies.setVisible(true);
				dispose();
				System.out.println(MainScreen.personas.toString());
			}
		});
		persButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HobbiesInput pagInsertHobbies = new HobbiesInput();
				pagInsertHobbies.setVisible(true);
				dispose();
				System.out.println(MainScreen.personas.toString());
			}
		});
	}

}
