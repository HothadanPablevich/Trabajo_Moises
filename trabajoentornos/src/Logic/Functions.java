package Logic;

import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 * Esta clase contienen los metodos que usa la interfaz gráfica de nuestra
 * aplicacion
 * 
 * @author Pablo y Alessandro
 * @version 1.2
 */

public class Functions {

	/**
	 * Método que comprueba si el nombre que se intoduce se repite en el array o no
	 * 
	 * @param actualperson indice de la persona
	 * @param compare      array de personas
	 * @return
	 *         <ul>
	 *         <li>true: Si el nombre esta repetido</li>
	 *         <li>false: Si el nombre no esta repetido</li>
	 *         </ul>
	 */

	public static boolean controlNoRepeatStringInArray(int actualperson, String[] compare) {
		boolean namerep = false;
		int arrayLength = compare.length;
		for (int i = 0; i < arrayLength; i++) {
			// if para comparar un nombre con otro siempre y cuando i no sea igual a j para
			// evitar errores
			if (compare[actualperson].equals(compare[i]) && actualperson != i && !compare[actualperson].isEmpty()) {
				namerep = true;
			}
		}
		
		return namerep;
	}

	/**
	 * Método para saber si dos personas son afines
	 * 
	 * @param name1  nombre de la primera persona a comparar
	 * @param name2  nombre de la segunda persona a comparar
	 * @param matriz objeto donde esta guardado los gustos
	 * @return
	 *         <ul>
	 *         <li>true: Si son afines</li>
	 *         <li>false: Si no son afines</li>
	 *         </ul>
	 */

	public static boolean esAfin(int name1, int name2, MatchFinderLogic matriz) {
		boolean afin = false;
		int count = 0;
		int matrizLength = matriz.getMatriz()[name1].length;
		for (int j = 0; j < matrizLength; j++) {
			if (matriz.getMatriz()[name1][j] == matriz.getMatriz()[name2][j]&&matriz.getMatriz()[name1][j]==true) {
				count++;
			}
		}
		if (count >= 3) {
				afin = true;
		} else {
			afin = false;
		}
		return afin;

	}
	/**
	 * Método para los hobbies favorables que coinciden
	 * 
	 * @param name1  nombre de la primera persona a comparar
	 * @param name2  nombre de la segunda persona a comparar
	 * @param matriz objeto donde esta guardado los gustos
	 * @return
	 *         <ul>
	 *         <li>ArrayList con los hobbies favorables</li>
	 *         </ul>
	 */
	public static ArrayList<String> esAfinConNombres(int name1, int name2, MatchFinderLogic matriz) {
		ArrayList<String> afinHobbies= new ArrayList<String>();
		int matrizLength = matriz.getMatriz()[name1].length;
		String[] hobbies= matriz.getHobbies();
		for (int j = 0; j < matrizLength; j++) {
			if (matriz.getMatriz()[name1][j] == matriz.getMatriz()[name2][j]&&matriz.getMatriz()[name1][j]==true) {
				afinHobbies.add(hobbies[j]);
			}
		}
		return afinHobbies;

	}
	/**
	 * Método para los hobbies no favorables que coinciden
	 * 
	 * @param name1  nombre de la primera persona a comparar
	 * @param name2  nombre de la segunda persona a comparar
	 * @param matriz objeto donde esta guardado los gustos
	 * @return
	 *         <ul>
	 *         <li>ArrayList con los hobbies no favorables</li>
	 *         </ul>
	 */
	public static ArrayList<String> noEsAfinConNombres(int name1, int name2, MatchFinderLogic matriz) {
		ArrayList<String> noafinHobbies= new ArrayList<String>();
		String[] hobbies= matriz.getHobbies();
		int matrizLength = matriz.getMatriz()[name1].length;
		for (int j = 0; j < matrizLength; j++) {
			if (matriz.getMatriz()[name1][j] == matriz.getMatriz()[name2][j]&&matriz.getMatriz()[name1][j]==false) {
				noafinHobbies.add(hobbies[j]);
			}
			
		}
		return noafinHobbies;

	}

}
