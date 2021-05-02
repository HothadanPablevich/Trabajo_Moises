package trabajoentornos;
import java.util.Scanner;
public class prueba {
	public static Scanner tec = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean control = false;

		Matriz a = new Matriz();
		System.out.println(a);
		a.muestraMatrix();

		System.out.println("Comprueba si dos personas son afines\n");

		do {
			control=false;
			try {
				System.out.println("Nombre Persona 1:");
				String pers1 = tec.nextLine();
				System.out.println("Nombre Persona 2:");
				String pers2 = tec.nextLine();

				a.esAfin(pers1, pers2);

			} catch (NullPointerException nombre_incorrecto) {
				System.out.println("Uno o ambos nombres no han sido encontrados, porfavor" +
									" escribe nombres válidos\n");
				control = true;
			}
		} while (control);
		
		System.out.println(a);
	}

}
