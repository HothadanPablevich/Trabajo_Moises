package graficSite;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.JTextComponent;

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
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionEvent;

public class HobbiesInput extends JFrame {

	private JPanel contentPane;
	private JTextField[] textFieldArray = new JTextField[7];
	JButton sendButtonHobbie = new JButton("Send");
	protected static Matriz personas = MainScreen.personas;
	private String[] compare= new String[personas.getHobbies().length];
	private FocusAdapter textAreaListener = new FocusAdapter() {
		@Override
		public void focusLost(FocusEvent e) {
			javax.swing.text.Document textField=((JTextComponent) e.getComponent()).getDocument();
			int index = (int) textField.getProperty("index");
			int comapareLength= compare.length;
			for(int i=0; i<comapareLength;i++) {
				compare[i] = textFieldArray[i].getText();
			}
			if(Functions.controlNoRepeatStringInArray(index,compare)) {
				JOptionPane.showMessageDialog(contentPane,"El nombre "+compare[index]+
						" ya está elegido, escriba uno diferente","Error",JOptionPane.ERROR_MESSAGE);
				textFieldArray[index].setText("");
				}
		}
	};
	private DocumentListener textAreaListenerKeys = new DocumentListener() {

		@Override
		public void insertUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			int index= (int) e.getDocument().getProperty("index");
			compare[index]= textFieldArray[index].getText();
			if(Functions.controlNoRepeatStringInArray(index,compare)) {
				textFieldArray[index].setForeground(new Color(255, 255, 255));
				textFieldArray[index].setBackground(Color.RED);
				sendButtonHobbie.setEnabled(false);
			}
			else {
				textFieldArray[index].setForeground(new Color(0, 0, 0));
				textFieldArray[index].setBackground(Color.WHITE);
				sendButtonHobbie.setEnabled(true);
			}
			int cont=0;
			for (String name: compare) {
				if(name!=null) {
					if(name.isBlank()||name.isEmpty()) {
						cont++;
					}
				}
				else if(name==null) {
					cont++;
				}
				System.out.println(cont);
			}
			if (cont>0) {
				sendButtonHobbie.setEnabled(false);
			}
			else {
				sendButtonHobbie.setEnabled(true);
			}
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}

	};

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

		
		sendButtonHobbie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int length = textFieldArray.length;

				String[] hobbies = new String[length];

				for (int i = 0; i < length; i++) {

					hobbies[i] = textFieldArray[i].getText();

				}
				GustosPersonas pag2 = new GustosPersonas();
				dispose();
				pag2.setDefaultCloseOperation(HIDE_ON_CLOSE);
				pag2.setVisible(true);
			}
		});

		sendButtonHobbie.setBounds(364, 259, 89, 23);
		contentPane_1.add(sendButtonHobbie);

		for (int i = 0; i < textFieldArray.length; i++) {

			textFieldArray[i].getDocument().putProperty("index", i);
			textFieldArray[i].addFocusListener(textAreaListener);
			textFieldArray[i].getDocument().addDocumentListener(textAreaListenerKeys);

		}

	}
}