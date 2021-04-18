package trabajoentornos;

import java.util.Scanner;

public class Matriz {
	public static Scanner tec = new Scanner(System.in);
	private boolean matriz[][];

	public Matriz(boolean matriz[][]) {
		this.matriz = matriz;
	}

	public void fillMatrixTec() {
		int matrixLength=this.matriz.length;
		int matrixColLength=this.matriz[1].length;
		
		for (int i = 0; i <matrixLength ; i++) {
			for (int j = 0; j <matrixColLength; j++) {
				System.out.println("Write the elements [" + i + "," + j + "]");
				this.matriz[i][j] = tec.nextBoolean();

			}
		}
		tec.nextLine();

	}
}



