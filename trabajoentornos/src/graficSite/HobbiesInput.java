package graficSite;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBox;

public class HobbiesInput extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HobbiesInput frame = new HobbiesInput();
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
	public HobbiesInput() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 585, 402);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBounds(0, 0, 569, 363);
		contentPane.add(contentPane_1);
		
		JLabel tittle = new JLabel("Macth Finder");
		tittle.setHorizontalAlignment(SwingConstants.CENTER);
		tittle.setFont(new Font("Tahoma", Font.PLAIN, 34));
		tittle.setBounds(5, 5, 552, 41);
		contentPane_1.add(tittle);
		
		JLabel personasHolder = new JLabel("Escribe aqui los Hobbies");
		personasHolder.setFont(new Font("Tahoma", Font.PLAIN, 24));
		personasHolder.setBounds(150, 38, 281, 70);
		contentPane_1.add(personasHolder);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(204, 119, 86, 20);
		contentPane_1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(204, 163, 86, 20);
		contentPane_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(204, 213, 86, 20);
		contentPane_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(204, 260, 86, 20);
		contentPane_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(367, 119, 86, 20);
		contentPane_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(367, 163, 86, 20);
		contentPane_1.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(367, 213, 86, 20);
		contentPane_1.add(textField_6);
		
		JLabel hobbie1Holder = new JLabel("Hobbie 1");
		hobbie1Holder.setBounds(128, 122, 66, 14);
		contentPane_1.add(hobbie1Holder);
		
		JLabel hobbie2Holder = new JLabel("Hobbie 2");
		hobbie2Holder.setBounds(128, 166, 66, 14);
		contentPane_1.add(hobbie2Holder);
		
		JLabel hobbie3Holder = new JLabel("Hobbie 3");
		hobbie3Holder.setBounds(128, 216, 66, 14);
		contentPane_1.add(hobbie3Holder);
		
		JLabel hobbie4Holder = new JLabel("Hobbie 4");
		hobbie4Holder.setBounds(128, 263, 66, 14);
		contentPane_1.add(hobbie4Holder);
		
		JLabel hobbie5Holder = new JLabel("Hobbie 5");
		hobbie5Holder.setBounds(302, 122, 66, 14);
		contentPane_1.add(hobbie5Holder);
		
		JLabel hobbie6Holder_5 = new JLabel("Hobbie 6");
		hobbie6Holder_5.setBounds(302, 166, 66, 14);
		contentPane_1.add(hobbie6Holder_5);
		
		JLabel hobbie7Holder = new JLabel("Hobbie 7");
		hobbie7Holder.setBounds(300, 216, 66, 14);
		contentPane_1.add(hobbie7Holder);
		
		JButton sendButtonHobbie = new JButton("Send");
		sendButtonHobbie.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String[] hobbies= {textField.getText(), textField_1.getText(), textField_2.getText(), 
						textField_3.getText(), textField_4.getText(), textField_5.getText(), textField_6.getText()};
				MainScreen.personas.setHobbies(hobbies);
			}
		});
		sendButtonHobbie.setBounds(364, 259, 89, 23);
		contentPane_1.add(sendButtonHobbie);
	}
}
