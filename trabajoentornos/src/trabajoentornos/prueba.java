package trabajoentornos;

import java.util.Scanner;

public class prueba {
	public static Scanner tec = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Matriz a = new Matriz();
		System.out.println(a);
		a.muestraMatrix();

		System.out.println(a.esAfin(0, 1));

	}

}
