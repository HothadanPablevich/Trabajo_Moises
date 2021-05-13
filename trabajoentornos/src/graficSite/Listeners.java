package graficSite;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

public class Listeners extends FocusAdapter{
	private String[] compare;
	public String[] getCompare() {
		return compare;
	}
	public void setCompare(String[] compare) {
		this.compare = compare;
	}
	
	public FocusAdapter textAreaListener = new FocusAdapter() {
		public void focusLost(FocusEvent e, JTextField[] textFieldArray) {
			javax.swing.text.Document textField=((JTextComponent) e.getComponent()).getDocument();
			int index = (int) textField.getProperty("index");
			for(int i=0; i<compare.length;i++) {
				compare[i]= textFieldArray[i].getText();
			}
			if(controlNoRepeatStringInArray(index,compare)) {
				textFieldArray[index].setText("");
				}
		}
	};
	private boolean controlNoRepeatStringInArray(int actualperson, String[]compare) {
		boolean namerep = false;
		int arrayLength = compare.length;
		for (int i = 0; i < arrayLength; i++) {
			// if para comparar un nombre con otro siempre y cuando i no sea igual a j para
			// evitar errores
			if (compare[actualperson].equals(compare[i]) && actualperson != i && !compare[actualperson].isEmpty()) {
				JOptionPane.showMessageDialog(null,"El nombre "+compare[i]+" ya está elegido, escriba uno diferente","Error",JOptionPane.ERROR_MESSAGE);
				namerep = true;
			}
		}
		if(namerep) {
			System.out.println( actualperson );
			
		}
		
		return namerep;
	}
	
}
