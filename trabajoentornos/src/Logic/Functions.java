package Logic;

import java.util.ArrayList;

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

public static boolean controlNoRepeatStringInArray(int arrayLength , int actualperson, String[]things) {
	boolean namerep = false;
	for (int j = 0; j < arrayLength; j++) {
		// if para comparar un nombre con otro siempre y cuando i no sea igual a j para
		// evitar errores
		if (things[actualperson].equals(things[j]) && actualperson != j) {
			System.out.println("Write a non-repeated name");
			namerep = true;
		}
	}
	return namerep;
	}

public static boolean esAfin(int name1, int  name2, MatchFinderLogic matriz) {
	boolean afin=false;
	int count = 0;
	//int indexPersona1= searchPersonas(name1, matriz);
	//int indexPersona2= searchPersonas(name2, matriz);
	ArrayList<Integer>afinIndexHobbies= new ArrayList<Integer>();
	int matrizLength = matriz.getMatriz()[name1].length;
		for (int j = 0; j < matrizLength; j++) {
			if (matriz.getMatriz()[name1][j] == matriz.getMatriz()[name2][j]) {
				count++;
				afinIndexHobbies.add(j);
			}
		}
		if (count >= 3) {
			for(int index: afinIndexHobbies) {
				 afin=true;
			}
		} else {
			 afin=false;
		}
		return afin;

}

public Integer searchPersonas(String name, MatchFinderLogic personas) {
	boolean out=true;
	int lengthPersonas=personas.getPersonas().length;
	for(int i =0; i<lengthPersonas&&out;i++) {
		if(name.equalsIgnoreCase(personas.getPersonas()[i])) {
			out=false;
			return i;
		}	
	}
	return null;
}


}
