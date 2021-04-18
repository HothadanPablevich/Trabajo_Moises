package trabajoentornos;

import java.util.Arrays;
import java.util.Scanner;
public class Matriz {
public static Scanner tec = new Scanner(System.in);

	private boolean [][] matriz= new boolean[10][7];
	private String [] personas= new String[10];
	private final String [] hobbies= {"AAAA","BBBB","CCCC","DDDD","EEEE","FFFF","GGGG"};
	public Matriz() {
		fillPersonasArray();
		//fillMatrixBoolTec();
		fillMatrixBoolRandom();
		
	}
//////Setters///
		/////Matriz//////
	public boolean[][] getMatriz() {
		return matriz;
	}
	public void setMatriz(boolean[][] matriz) {
		this.matriz = matriz;
	}
	public void setMatriz(int person, int hobbie, boolean taste) {
		this.matriz[person][hobbie] = taste;
	}
		/////Personas//////
	public String[] getPersonas() {
		return personas;
	}
	private void setPersonas(String name, int num) {
	 this.personas[num]= name;
	}
	public void setPersonas(String[] personas) {
		this.personas = personas;
	}
		/////Hobbies//////
	private void setHobbies(String name, int num) {
		 this.hobbies[num]= name;
		}
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		//this.hobbies = hobbies;
	}
//////////////ToString///////
	public String toString() {
		return "   personas=" + Arrays.toString(personas) + ", hobbies="
				+ Arrays.toString(hobbies) + "]";
	}	
//////Methods///
	private void fillMatrixBoolRandom() {
		int matrixLength= this.matriz.length;
		int matrixColLength= this.matriz[1].length;
		for(int i=0;i<matrixLength;i++) {
			for(int j=0;j<matrixColLength;j++) {
				int rand=(int)Math.random()*2;
				boolean random;
				if(rand==1) {
					random=true;
				}
				else {
					random=false;
				}
				this.matriz[i][j]=random;
			}
		}
		
	}
	private void fillMatrixBoolTec() {
		int matrixLength=this.matriz.length;
		int matrixColLength=this.matriz[1].length;
		String opinion;
		for (int i = 0; i <matrixLength ; i++) {
			System.out.println(this.personas[i]);
			for (int j = 0; j <matrixColLength; j++) {
				System.out.println(" likes " + this.hobbies[j] +" ?");
				opinion=tec.nextLine();
				if(opinion.equalsIgnoreCase("yes")||opinion.equalsIgnoreCase("y")) {
					this.setMatriz(i, j, true);	
				}
				else {
					this.setMatriz(i, j, false);
				}

			}
		}
		tec.nextLine();

	}
	private void fillPersonasArray() {
		int arrayLength = this.personas.length;
		String name;
		for(int i=0; i<arrayLength; i++) {
			System.out.println("Give me " +(arrayLength-i)+" people");
			name= tec.nextLine();
			this.setPersonas(name, i);
		}
	}
	private void fillHobbiesArray() {
		int arrayLength = this.hobbies.length;
		String name;
		for(int i=0; i<arrayLength; i++) {
			System.out.println("Give me " +(arrayLength-i)+" hobbies");
			name= tec.nextLine();
			this.setHobbies(name, i);
		}
	}
	
	public void muestraMatrix() 
	{
	    int i,j;
	    for (i = 0; i < matriz.length;i ++) 
	    {
	        for (j = 0; j < matriz[i].length; j++) 
	            System.out.print(matriz[i][j]+" ");
	        System.out.print("\n");
	    }
	    System.out.println("");
	}
	
}



