package graficSite;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import trabajoentornos.Matriz;

import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Iterator;

import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HobbiesInput extends JFrame {

	private JPanel contentPane;
	private JTextField[] textFieldArray = new JTextField[7]; 
	protected static Matriz personas= MainScreen.personas;
	private DocumentListener textListen = new DocumentListener(){

		@Override
		public void insertUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			int index=(int) e.getDocument().getProperty("index");
			String[] compare=new String[textFieldArray.length];
			for (int i = 0; i < compare.length; i++) {
				compare[i]=textFieldArray[i].getText();
			}
			if(controlNoRepeatStringInArray(index,compare)) {
				
	
			}
			
			
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}};

	

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
	private boolean controlNoRepeatStringInArray(int actualperson, String[]things) {
		boolean namerep = false;
		int arrayLength = things.length;
		for (int j = 0; j < arrayLength; j++) {
			// if para comparar un nombre con otro siempre y cuando i no sea igual a j para
			// evitar errores
			if (things[actualperson].equals(things[j]) && actualperson != j && things[actualperson]!=null) {
				JOptionPane.showMessageDialog(contentPane,"Sos puto","Error",JOptionPane.ERROR_MESSAGE);
				namerep = true;
			}
		}
		return namerep;
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
		
		textFieldArray[0] = new JTextField();
		textFieldArray[0].setColumns(10);
		textFieldArray[0].setBounds(204, 119, 86, 20);
		contentPane_1.add(textFieldArray[0]);
		
		textFieldArray[1] = new JTextField();
		textFieldArray[1].setColumns(10);
		textFieldArray[1].setBounds(204, 163, 86, 20);
		contentPane_1.add(textFieldArray[1]);
		
		textFieldArray[2] = new JTextField();
		textFieldArray[2].setColumns(10);
		textFieldArray[2].setBounds(204, 213, 86, 20);
		contentPane_1.add(textFieldArray[2]);
		
		textFieldArray[3] = new JTextField();
		textFieldArray[3].setColumns(10);
		textFieldArray[3].setBounds(204, 260, 86, 20);
		contentPane_1.add(textFieldArray[3]);
		
		textFieldArray[4] = new JTextField();
		textFieldArray[4].setColumns(10);
		textFieldArray[4].setBounds(367, 119, 86, 20);
		contentPane_1.add(textFieldArray[4]);
		
		textFieldArray[5] = new JTextField();
		textFieldArray[5].setColumns(10);
		textFieldArray[5].setBounds(367, 163, 86, 20);
		contentPane_1.add(textFieldArray[5]);
		
		textFieldArray[6] = new JTextField();
		textFieldArray[6].setColumns(10);
		textFieldArray[6].setBounds(367, 213, 86, 20);
		contentPane_1.add(textFieldArray[6]);
		
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
		sendButtonHobbie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int length=textFieldArray.length;
				
				String [] hobbies=new String [length];
				
				for (int i = 0; i <length ; i++) {
					
				hobbies[i]=textFieldArray[i].getText();
					
				}
				dispose();
				
				
			}
		});
	
		sendButtonHobbie.setBounds(364, 259, 89, 23);
		contentPane_1.add(sendButtonHobbie);
		
		for (int i = 0; i < textFieldArray.length; i++) {
			
			textFieldArray[i].getDocument().putProperty("index", i);
			textFieldArray[i].getDocument().addDocumentListener(textListen);
			
		}
		
	}
}
