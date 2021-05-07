package graficSite;
import trabajoentornos.Matriz;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;

public class MainScreen extends JFrame {

	private JPanel contentPane;
	private JTextField[] textFieldArray = new JTextField[10]; 
	protected static Matriz personas= new Matriz();
	private DocumentListener textListen = new DocumentListener(){

		@Override
		public void insertUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			JOptionPane.showMessageDialog(contentPane,e.getClass(),"Error",JOptionPane.ERROR_MESSAGE);
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			JOptionPane.showMessageDialog(contentPane,e.getClass(),"Error",JOptionPane.ERROR_MESSAGE);
		}

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			JOptionPane.showMessageDialog(contentPane,e.getClass(),"Error",JOptionPane.ERROR_MESSAGE);
		}
		
	};
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
		/////Text fields array////
		
			textFieldArray[0] =  new JTextField();
			textFieldArray[0].setBounds(86, 119, 86, 20);
			contentPane.add(textFieldArray[0]);
			textFieldArray[0].setColumns(10);
		
			textFieldArray[1] =  new JTextField();
			textFieldArray[1].setBounds(86, 163, 86, 20);
			contentPane.add(textFieldArray[1]);
			textFieldArray[1].setColumns(10);
	
			textFieldArray[2] =  new JTextField();
			textFieldArray[2].setBounds(86, 213, 86, 20);
			contentPane.add(textFieldArray[2]);
			textFieldArray[2].setColumns(10);
			
			textFieldArray[3] =  new JTextField();
			textFieldArray[3].setBounds(86, 260, 86, 20);
			contentPane.add(textFieldArray[3]);
			textFieldArray[3].setColumns(10);
			
			textFieldArray[4] =  new JTextField();
			textFieldArray[4].setBounds(249, 119, 86, 20);
			contentPane.add(textFieldArray[4]);
			textFieldArray[4].setColumns(10);
			
			textFieldArray[5] =  new JTextField();
			textFieldArray[5].setBounds(249, 163, 86, 20);
			contentPane.add(textFieldArray[5]);
			textFieldArray[5].setColumns(10);
			
			textFieldArray[6] =  new JTextField();
			textFieldArray[6].setBounds(249, 213, 86, 20);
			contentPane.add(textFieldArray[6]);
			textFieldArray[6].setColumns(10);
			
			textFieldArray[7] =  new JTextField();
			textFieldArray[7].setBounds(249, 260, 86, 20);
			contentPane.add(textFieldArray[7]);
			textFieldArray[7].setColumns(10);
		
			textFieldArray[8] =  new JTextField();
			textFieldArray[8].setBounds(412, 119, 86, 20);
			contentPane.add(textFieldArray[8]);
			textFieldArray[8].setColumns(10);
			
			textFieldArray[9] =  new JTextField();
			textFieldArray[9].setBounds(412, 163, 86, 20);
			contentPane.add(textFieldArray[9]);
			textFieldArray[9].setColumns(10);
		/////Fin text Array///
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
		sendButtonPersonas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int textArrayLength = textFieldArray.length;
				String[] people= new String[textArrayLength];
				for(int i=0; i < textArrayLength; i++) {
					people[i]=textFieldArray[i].getText();
				}
				JOptionPane.showMessageDialog(contentPane,e.getSource(),"Error",JOptionPane.ERROR_MESSAGE);
				MainScreen.personas.setPersonas(people);
				DefaultHobbiesOrPersonal pag2 = new DefaultHobbiesOrPersonal();
				pag2.setVisible(true);
			}
		});
		
		sendButtonPersonas.setBounds(378, 233, 89, 23);
		contentPane.add(sendButtonPersonas);
		for(int i =0 ; i< textFieldArray.length;i++) {
			textFieldArray[i].getDocument().addDocumentListener(textListen);
		}
		
		
	}
}
