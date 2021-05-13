package graficSite;

import javax.swing.JOptionPane;

public class Functions {
	public static boolean controlNoRepeatStringInArray(int actualperson, String[]compare) {
		boolean namerep = false;
		int arrayLength = compare.length;
		for (int i = 0; i < arrayLength; i++) {
			// if para comparar un nombre con otro siempre y cuando i no sea igual a j para
			// evitar errores
			if (compare[actualperson].equals(compare[i]) && actualperson != i && !compare[actualperson].isEmpty()) {
				namerep = true;
			}
		}
		if(namerep) {
			//System.out.println( actualperson );
			
		}
		
		return namerep;
	}
}
