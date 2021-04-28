package graficSite;
import trabajoentornos.Matriz;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainScreen extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	protected static Matriz personas= new Matriz();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen frame = new MainScreen();
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
	public MainScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 578, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel tittle = new JLabel("Macth Finder");
		tittle.setBounds(5, 5, 552, 41);
		tittle.setHorizontalAlignment(SwingConstants.CENTER);
		tittle.setFont(new Font("Tahoma", Font.PLAIN, 34));
		contentPane.add(tittle);
		
		JLabel personasHolder = new JLabel("Escribe aqui las personas");
		personasHolder.setFont(new Font("Tahoma", Font.PLAIN, 24));
		personasHolder.setBounds(150, 38, 281, 70);
		contentPane.add(personasHolder);
		
		textField = new JTextField();
		textField.setBounds(86, 119, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(86, 163, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(86, 213, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(86, 260, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(249, 119, 86, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(249, 163, 86, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(249, 213, 86, 20);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(249, 260, 86, 20);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(412, 119, 86, 20);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(412, 163, 86, 20);
		contentPane.add(textField_9);
		
		JLabel persona1Holder = new JLabel("Persona 1");
		persona1Holder.setBounds(10, 122, 66, 14);
		contentPane.add(persona1Holder);
		
		JLabel persona2Holder = new JLabel("Persona 2");
		persona2Holder.setBounds(10, 166, 66, 14);
		contentPane.add(persona2Holder);
		
		JLabel persona3Holder = new JLabel("Persona 3");
		persona3Holder.setBounds(10, 216, 66, 14);
		contentPane.add(persona3Holder);
		
		JLabel persona4Holder = new JLabel("Persona 4");
		persona4Holder.setBounds(10, 263, 66, 14);
		contentPane.add(persona4Holder);
		
		JLabel persona5Holder = new JLabel("Persona 5");
		persona5Holder.setBounds(184, 122, 66, 14);
		contentPane.add(persona5Holder);
		
		JLabel persona6Holder_5 = new JLabel("Persona 6");
		persona6Holder_5.setBounds(184, 166, 66, 14);
		contentPane.add(persona6Holder_5);
		
		JLabel persona7Holder = new JLabel("Persona 7");
		persona7Holder.setBounds(182, 216, 66, 14);
		contentPane.add(persona7Holder);
		
		JLabel persona8Holder = new JLabel("Persona 8");
		persona8Holder.setBounds(184, 263, 66, 14);
		contentPane.add(persona8Holder);
		
		JLabel persona9Holder = new JLabel("Persona 9");
		persona9Holder.setBounds(346, 122, 66, 14);
		contentPane.add(persona9Holder);
		
		JLabel persona10Holder = new JLabel("Persona 10");
		persona10Holder.setBounds(346, 166, 66, 14);
		contentPane.add(persona10Holder);
		
		JButton sendButtonPersonas = new JButton("Send");
		sendButtonPersonas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String[] people= {textField.getText(), textField_1.getText(), textField_2.getText(), 
						textField_3.getText(), textField_4.getText(), textField_5.getText(), textField_6.getText()};
				MainScreen.personas.setPersonas(people);
				
			}
		});
		sendButtonPersonas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		sendButtonPersonas.setBounds(378, 233, 89, 23);
		contentPane.add(sendButtonPersonas);
	}
}
