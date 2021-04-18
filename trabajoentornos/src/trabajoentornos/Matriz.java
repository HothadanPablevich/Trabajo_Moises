package trabajoentornos;

import java.util.Scanner;

public class Matriz {
	public static Scanner tec = new Scanner(System.in);

	private boolean matriz[][];
	
	public Matriz(boolean matriz[][]) {
		this.matriz=matriz;
	}
	
	
public static void fillArrayKeyboard(int [][]m) {
		
		
		for (int i = 0 ; i < m.length ; i++ ) {
			
	  		    for (int j = 0 ; j < m[i].length ; j++ )
	  		    {
	  		    	System.out.println("Write the element [" +i+ "," +j+ "]");
	  	  			m[i][j]=tec.nextInt();
		
	  		    }
		}
	tec.nextLine();

	}
	

}
