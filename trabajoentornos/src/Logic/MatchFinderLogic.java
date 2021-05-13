package Logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Esta clase define una matriz que determina si a una persona le gusta o no un hobby y resuelve si una persona dada es afin con otra
 * @author Babel
 * @version 1.2
 */

public class MatchFinderLogic {
	public static Scanner tec = new Scanner(System.in);

//////Campos de la clase///////

	private boolean[][] matriz = new boolean[10][7];
	private String[] personas = new String[10];
	private String[] hobbies = { "Viajar", "Cine", "Leer", "Videojuegos", "Conducir", "Animales", "Fiestas" };
	private int personasLength= this.personas.length;
	
//////Constructores///////

	/**
	 * Constructor vacío que llama al método de rellenar la matriz
	 */
	
	public MatchFinderLogic() {
		//fillPersonasArray();
		//fillMatrixBoolTec();
		//fillMatrixBoolRandom();

	}
	
	/**
	 * Constructor con un String de personas ya dado y llama al metodo de rellenar la matriz
	 * @param names Este parámetro define los nombres de las personas que van a estar en la matriz
	 */
	
	public MatchFinderLogic ( String [] names) {
		this.setPersonas(names);
		fillMatrixBoolTec();
	}

//////Getters y Setters///////
	
	 /**
     * Metodo que regresa la matriz
     * @return matriz 
     */
	
	public boolean[][] getMatriz() {
		return matriz;
	}
	
	/**
	 * Establece la matriz
	 * @param matriz matriz que se va a establecer
	 */

	public void setMatriz(boolean[][] matriz) {
		this.matriz = matriz;
	}
	
	/**
	 * Establece la matriz
	 * @param persona persona 
	 * @param hobby hobby 
	 * @param taste opinion de si le gusta o no el hobby dado
	 */

	public void setMatriz(int persona, int hobby, boolean taste) {
		this.matriz[persona][hobby] = taste;
	}

	 /**
     * Devuelve el nombre de las personas
     * @return personas nombre de las personas
     */
	
	public String[] getPersonas() {
		return personas;
	}
	
	/**
	 * Establece las personas
	 * @param name nombre de la persona 
	 * @param num posición donde va a ir en el array de las personas
	 */

	private void setPersonas(String name, int num) {
		this.personas[num] = name;
	}
	
	/**
	 * Establece las personas
	 * @param personas nombres de las personas 
	 */

	public void setPersonas(String[] personas) {
		this.personas = personas.clone();
	}


	/**
	 * Establece los hobbies
	 * @param name nombre del hobby
	 * @param num posición donde va a ir en el array de hobbies
	 */
	
	private void setHobbies(String name, int num) {
		this.hobbies[num] = name;
	}
	
	/**
	 * Establece los hobbies
	 * @param name nombres de los hobbies
	 */
	
	public void setHobbies(String[] name) {
		this.hobbies = name.clone();
	}
	
	 /**
     * Devuelve una lista de hobbies
     * @return personas nombre de las personas
     */

	public String[] getHobbies() {
		return hobbies;
	}

//////To String///////
	
	public String toString() {
		return "   personas=" + Arrays.toString(personas) + ", hobbies=" + Arrays.toString(hobbies) + "]";
	}

//////Methods//////
	
	/**
	 * Método para rellenar la matriz de forma aleatoria
	 */

	private void fillMatrixBoolRandom() {
		int matrixLength = this.matriz.length;
		int matrixColLength = this.matriz[1].length;
		for (int i = 0; i < matrixLength; i++) {
			for (int j = 0; j < matrixColLength; j++) {
				double rand = Math.random() * 11;
				boolean random;
				if (rand <= 5) {
					random = true;
				} else {
					random = false;
				}
				this.matriz[i][j] = random;
			}
		}

	}

	/**
	 * Método para rellenar la matriz por teclado
	 */
	
	private void fillMatrixBoolTec() {
		int matrixLength = this.matriz.length;
		int matrixColLength = this.matriz[0].length;
		String opinion;
		// booleano para controlar que solo escriba lo que se pide
		boolean control = false;
		for (int i = 0; i < matrixLength; i++) {
			System.out.println(this.personas[i]);
			for (int j = 0; j < matrixColLength; j++) {
				// do-while para entrar en bucle si el usuario no escribe correctamente
				do {
					control = false;
					System.out.println(" likes " + this.hobbies[j] + " ?, yes (y) or no (n)");
					opinion = tec.nextLine();
					control = controlOpinion(opinion, i ,j);

				} while (control);
			}

		}


	}
	
	/**
	 * Método para rellenar el array de personas por teclado
	 */

	private void fillPersonasArray() {
		int arrayLength = this.personas.length;
		String name;
		// booleano para controlar que solo escriba strings
		boolean control = false;
		// booleano para controlar que no se repitan los nombres
		boolean namerep = false;

		for (int i = 0; i < arrayLength; i++) {
			// do-while para entrar en bucle si el usuario no escribe correctamente
			do {
				System.out.println("Give me " + (arrayLength - i) + " people");
				name = tec.nextLine();

				this.setPersonas(name, i);
				control = false;
				namerep = false;
				// if para asegurar que si escribe numeros o no escribe nada, se entre en el bucle hasta que introduzca lo que se requiere

				if (isNumeric(name) || name.isBlank()) {
					System.out.println("Write a correct name");
					control = true;
				}
				// for que recorre el bucle otra vez, necesario para poder comparar luego los  nombres con el if
				namerep = Functions.controlNoRepeatStringInArray( arrayLength, i , this.personas);
				
			} while (control || namerep);
		}

	}
	
	/**
	 * Método para rellenar el array de hobbies por teclado
	 */

	private void fillHobbiesArray() {
		int arrayLength = this.hobbies.length;
		String name;
		// booleano para controlar que solo escriba strings
		boolean control = false;
		// booleano para controlar que no se repitan los nombres
		boolean namerep = false;

		for (int i = 0; i < arrayLength; i++) {
			// do-while para entrar en bucle si el usuario no escribe correctamente
			do {
				System.out.println("Give me " + (arrayLength - i) + " hobbies");
				name = tec.nextLine();

				this.setHobbies(name, i);
				control = false;
				namerep = false;
// if para asegurar que si escribe numeros o no escribe nada, se entre en el bucle hasta que introduzca lo que se requiere
				if (isNumeric(name) || name.isBlank()) {
					System.out.println("Write a correct hobbie");
					control = true;
				}
				// for que recorre el bucle otra vez, necesario para poder comparar que el nombre no se repite
				namerep = Functions.controlNoRepeatStringInArray( arrayLength, i , this.hobbies);
				
			} while (control || namerep);
		}
	}

	/**
	 * Método para mostrar la matriz
	 */
	
	public void muestraMatrix() {
		int i, j;
		for (i = 0; i < matriz.length; i++) {
			for (j = 0; j < matriz[i].length; j++)
				System.out.print(matriz[i][j] + " ");
			System.out.print("\n");
		}
		System.out.println("");
	}

	
	/**
	 *  Método para saber si un String contiene numeros o no
	 *  @param s cadena para saber si contiene numeros o no
	 * @return <ul>
     *  <li>true: Si contiene numeros</li>
     *  <li>false: Si no contiene numeros</li>
     *  </ul>
	 */
	
	public boolean isNumeric(String s) {
		return s != null && s.matches("[-+]?\\d*\\.?\\d+");
	}
	
	/**
	 *  Método para saber si dos personas son afines
	 *  @param name1 nombre de la primera persona a comparar
	 *  @param name2 nombre de la segunda persona a comparar
	 * @return <ul>
     *  <li>true: Si son afines</li>
     *  <li>false: Si no son afines</li>
     *  </ul>
	 */

	public boolean esAfin(String name1, String  name2) {
		boolean afin=false;
		int count = 0;
		int indexPersona1= this.searchPersonas(name1);
		int indexPersona2= this.searchPersonas(name2);
		ArrayList<Integer>afinIndexHobbies= new ArrayList<Integer>();
		int matrizLength = this.matriz[indexPersona1].length;
			for (int j = 0; j < matrizLength; j++) {
				if (this.matriz[indexPersona1][j] == this.matriz[indexPersona2][j]) {
					count++;
					afinIndexHobbies.add(j);
				}
			}
			if (count >= 3) {
				System.out.println(this.personas[indexPersona1]+" es afin con "+this.personas[indexPersona2] +" y concuerdan en ");
				for(int index: afinIndexHobbies) {
					System.out.print(" | " + this.hobbies[index]+ " | ");
					 afin=true;
				}
			} else {
				System.out.println(this.personas[indexPersona1]+" no es afin con "+this.personas[indexPersona2]);
				 afin=false;
			}
			return afin;

	}
	
	/**
	 *  Método que comprueba si los paramentros de entrada en las opiniones está bien
	 *  @param opinion escribir "yes" o "no" dependiendo si le gusta o no
	 *  @param i personas
	 *  @param j hobbies
	 * @return <ul>
     *  <li>true: Si la opinion se escribe como se debe, es decir:"yes","no","y" o "n"</li>
     *  <li>false: Si se escribe correctamente</li>
     *  </ul>
	 */
	
	public boolean controlOpinion(String opinion, int i, int j) {
		boolean control = false;
		// if para que solo pueda poner yes, y, no, n, si pone otra cosa entrará en
		// bucle
		if (!(opinion.equalsIgnoreCase("yes") || opinion.equalsIgnoreCase("y") || opinion.equalsIgnoreCase("no")
				|| opinion.equalsIgnoreCase("n"))) {
			System.out.println("Write yes (y) or no (n)");
			control = true;
		}
		else if (opinion.equalsIgnoreCase("yes") || opinion.equalsIgnoreCase("y")) {
			this.setMatriz(i, j, true);
			control = false;

		} else if (opinion.equalsIgnoreCase("no") || opinion.equalsIgnoreCase("n")) {
			this.setMatriz(i, j, false);
			control = false;

		}
		return control;
		
		
	}
	
	/**
	 * Método que comprueba si el nombre que se intoduce se repite en el array o no
	 * @param arrayLength longitud de array
	 * @param actualperson indice de la persona 
	 * @param things array de personas
	 * @return <ul>
     *  <li>true: Si el nombre esta repetido</li>
     *  <li>false: Si el nombre no esta repetido</li>
     *  </ul>
	 */

	
	/**
	 * Método para buscar personas
	 * @param name nombre de la persona a buscar
	 *  @return <ul>
     *  <li>i: índice del mismo nombre que estamos buscando</li>
     *  <li>null: Si el nombre no esta en el array de personas</li>
     *  </ul>
	 */
	
	public Integer searchPersonas(String name) {
		boolean out=true;
		for(int i =0; i<this.personasLength&&out;i++) {
			if(name.equalsIgnoreCase(this.personas[i])) {
				out=false;
				return i;
			}	
		}
		return null;
	}
}

