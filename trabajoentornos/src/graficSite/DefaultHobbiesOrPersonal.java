package graficSite;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import trabajoentornos.Matriz;
public class DefaultHobbiesOrPersonal extends JFrame {

	private JPanel contentPane;
	private Matriz persona= MainScreen.personas;

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
		selectHolder.setFont(new Font("Tahoma", Font.PLAIN, 20));
		selectHolder.setBounds(79, 151, 501, 66);
		contentPane.add(selectHolder);
		
		JButton btnNewButton = new JButton("Por defecto");
		btnNewButton.setBounds(191, 264, 103, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Personalizar");
		btnNewButton_1.setBounds(348, 264, 113, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel defaultHobbies = new JLabel(persona.getHobbies());
		defaultHobbies.setBounds(155, 108, 335, 14);
		contentPane.add(defaultHobbies);
	}

}
