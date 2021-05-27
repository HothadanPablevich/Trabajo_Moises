package Logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Esta clase define una matriz que determina si a una persona le gusta o no un
 * hobby y resuelve si una persona dada es afin con otra
 * 
 * @author Pablo y Alessandro
 * @version 1.2
 */

public class MatchFinderLogic {




//////Campos de la clase///////
	
	/**
	 * Numero total de personas
	 */

	
	private final int NUM_PERSONAS=10;
	/**
	 * Numero total de hobbies
	 */
	private final int NUM_HOBBIES=7;
	
	/**
	 * Almacena las aficiones de todas las personas
	 */

	
	private boolean[][] matriz = new boolean[NUM_PERSONAS][NUM_HOBBIES];

	/**
	 * Almacena el nombre de las personas
	 */
	
	private String[] personas = new String[NUM_PERSONAS];
	
	/**
	 * Almacena el nombre de los hobbies
	 */

	private String[] hobbies = { "Viajar", "Cine", "Leer", "Videojuegos", "Conducir", "Animales", "Fiestas" };

//////Constructores///////

	/**
	 * Constructor vacío
	 */

	public MatchFinderLogic() {
	}

//////Getters y Setters///////

	/**
	 * Metodo que regresa la matriz
	 * 
	 * @return matriz
	 */

	public boolean[][] getMatriz() {
		return matriz;
	}

	/**
	 * Establece la matriz
	 * 
	 * @param matriz matriz que se va a establecer
	 */

	public void setMatriz(boolean[][] matriz) {
		this.matriz = matriz;
	}

	/**
	 * Devuelve el nombre de las personas
	 * 
	 * @return personas nombre de las personas
	 */

	public String[] getPersonas() {
		return personas;
	}

	/**
	 * Establece las personas
	 * 
	 * @param personas nombres de las personas
	 */

	public void setPersonas(String[] personas) {
		this.personas = personas.clone();
	}

	/**
	 * Establece los hobbies
	 * 
	 * @param name nombres de los hobbies
	 */

	public void setHobbies(String[] name) {
		this.hobbies = name.clone();
	}

	/**
	 * Devuelve una lista de hobbies
	 * 
	 * @return personas nombre de las personas
	 */

	public String[] getHobbies() {
		return hobbies;
	}

//////To String///////

	public String toString() {
		return "   personas=" + Arrays.toString(personas) + ", hobbies=" + Arrays.toString(hobbies) + "]";
	}
}
