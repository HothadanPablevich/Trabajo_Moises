package trabajoentornos;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	public static Scanner tec = new Scanner(System.in);

	private boolean[][] matriz = new boolean[10][7];
	private String[] personas = new String[10];
	private final String[] hobbies = { "AAAA", "BBBB", "CCCC", "DDDD", "EEEE", "FFFF", "GGGG" };

	public Matriz() {
		fillPersonasArray();
		//fillMatrixBoolTec();
		fillMatrixBoolRandom();

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
		this.personas = personas;
	}

	///// Hobbies//////
	private void setHobbies(String name, int num) {
		this.hobbies[num] = name;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		// this.hobbies = hobbies;
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
				int rand = (int) Math.random() * 2;
				boolean random;
				if (rand == 1) {
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
		int matrixColLength = this.matriz[1].length;
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
					if (opinion.equalsIgnoreCase("yes") || opinion.equalsIgnoreCase("y")) {
						this.setMatriz(i, j, true);
						control = false;

					} else if (opinion.equalsIgnoreCase("no") || opinion.equalsIgnoreCase("n")) {
						this.setMatriz(i, j, false);
						control = false;

					}
					// if para que solo pueda poner yes, y, no, n, si pone otra cosa entrará en
					// bucle
					if (!(opinion.equalsIgnoreCase("yes") || opinion.equalsIgnoreCase("y")
							|| opinion.equalsIgnoreCase("no") || opinion.equalsIgnoreCase("n"))) {
						System.out.println("Write yes (y) or no (n)");
						control = true;
					}

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
				// if para asegurar que si escribe numeros o no escribe nada, se entre en el
				// bucle hasta que
				// introduzca lo que se requiere

				if (isNumeric(name) || name.isBlank()) {
					System.out.println("Write a correct name");
					control = true;
				}
				// for que recorre el bucle otra vez, necesario para poder comparar luego los
				// nombres con el
				// if
				for (int j = 0; j < arrayLength; j++) {
					// if para comparar un nombre con otro siempre y cuando i no sea igual a j para
					// evitar errores
					if (this.personas[i].equals(this.personas[j]) && i != j) {
						System.out.println("Write a non-repeated name");
						namerep = true;
					}
				}
			} while (control || namerep);
		}

	}

	private void fillHobbiesArray() {
		int arrayLength = this.hobbies.length;
		String name;
		for (int i = 0; i < arrayLength; i++) {
			System.out.println("Give me " + (arrayLength - i) + " hobbies");
			name = tec.nextLine();
			this.setHobbies(name, i);
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
	public boolean esAfin(int n1, int n2) {
		int count = 0;
		boolean afin = false;

		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < this.matriz[i].length; j++) {

				if (this.matriz[n1][j] == this.matriz[n2][j]) {
					count++;
				}
			}
			if (count >= 3) {
				afin = true;
				System.out.println(this.personas[n1]+" es afin con "+this.personas[n2]);

			} else {
				afin = false;
				System.out.println(this.personas[n1]+" no es afin con "+this.personas[n2]);
			}
		}

		return afin;
	}

}
