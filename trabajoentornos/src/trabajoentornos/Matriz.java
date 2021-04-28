package trabajoentornos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	public static Scanner tec = new Scanner(System.in);

	private boolean[][] matriz = new boolean[10][7];
	private String[] personas = new String[10];
	private String[] hobbies = { "AAAA", "BBBB", "CCCC", "DDDD", "EEEE", "FFFF", "GGGG" };
	private int personasLength= this.personas.length;
	public Matriz() {
		//fillPersonasArray();
		//fillMatrixBoolTec();
		fillMatrixBoolRandom();

	}
	public Matriz ( String [] names) {
		this.setPersonas(names);
	}

//////Setters///
	///// Matriz//////
	public boolean[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(boolean[][] matriz) {
		this.matriz = matriz;
	}

	public void setMatriz(int person, int hobbie, boolean taste) {
		this.matriz[person][hobbie] = taste;
	}

	///// Personas//////
	public String[] getPersonas() {
		return personas;
	}

	private void setPersonas(String name, int num) {
		this.personas[num] = name;
	}

	public void setPersonas(String[] personas) {
		this.personas = personas.clone();
	}

	///// Hobbies//////
	private void setHobbies(String name, int num) {
		this.hobbies[num] = name;
	}
	public void setHobbies(String[] name) {
		this.hobbies = name.clone();
	}

	public String getHobbies() {
		String result="";
		for(String hobbi: this.hobbies) {
			result+=" | "+hobbi+" | "; 
		}
		return result;
	}

//////////////ToString///////
	public String toString() {
		return "   personas=" + Arrays.toString(personas) + ", hobbies=" + Arrays.toString(hobbies) + "]";
	}

//////Methods///
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

		tec.nextLine();

	}

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
				namerep = controlNoRepeatStringInArray( arrayLength, i , this.personas);
				
			} while (control || namerep);
		}

	}

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
				namerep = controlNoRepeatStringInArray( arrayLength, i , this.hobbies);
				
			} while (control || namerep);
		}
	}

	public void muestraMatrix() {
		int i, j;
		for (i = 0; i < matriz.length; i++) {
			for (j = 0; j < matriz[i].length; j++)
				System.out.print(matriz[i][j] + " ");
			System.out.print("\n");
		}
		System.out.println("");
	}

	// metodo para saber si un String contiene numeros o no
	public boolean isNumeric(String s) {
		return s != null && s.matches("[-+]?\\d*\\.?\\d+");
	}

	// metodo para saber si dos personas son afines
	public void esAfin(String name1, String  name2) {
		int count = 0;
		boolean afin = false;
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
				afin = true;
				System.out.println(this.personas[indexPersona1]+" es afin con "+this.personas[indexPersona2] +" y concuerdan en ");
				for(int index: afinIndexHobbies) {
					System.out.print(" | " + this.hobbies[index]+ " | ");
				}
			} else {
				afin = false;
				System.out.println(this.personas[indexPersona1]+" no es afin con "+this.personas[indexPersona2]);
			}

	}
	////Metodo que comprueba si los paramentros de entrada en las opiniones está bien
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
	////Metodo que comprueba si el nombre que se intoduce se repite en el array o no
	public boolean controlNoRepeatStringInArray(int arrayLength , int actualperson, String[]things) {
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

