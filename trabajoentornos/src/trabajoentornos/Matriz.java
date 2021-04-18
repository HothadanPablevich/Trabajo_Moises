package trabajoentornos;

import java.util.Scanner;
public class Matriz {
public static Scanner tec = new Scanner(System.in);

	private boolean [][] matriz= new boolean[10][7];
	private String [] personas= new String[10];
	private final String [] hobbies= {"AAAA","BBBB","CCCC","DDDD","EEEE","FFFF","GGGG"};
	public Matriz() {
		
	}
	///Setters///
		/////Matriz//////
	public boolean[][] getMatriz() {
		return matriz;
	}
	public void setMatriz(boolean[][] matriz) {
		this.matriz = matriz;
	}
	public void setMatriz() {
		fillMatrixTec();
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
		this.hobbies = hobbies;
	}
//////Methods/////
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
	private void fillMatrixTec() {
		int matrixLength=this.matriz.length;
		int matrixColLength=this.matriz[1].length;
		String opinion;
		for (int i = 0; i <matrixLength ; i++) {
			System.out.println(this.personas[i]);
			for (int j = 0; j <matrixColLength; j++) {
				System.out.println(" likes " + this.hobbies[j] +" ?");
				opinion=tec.nextLine();
				if(opinion.equalsIgnoreCase("yes")||opinion.equalsIgnoreCase("y")) {
					this.matriz[i][j] = true;	
				}
				else {
					this.matriz[i][j] = false;
				}

			}
		}
		tec.nextLine();

	}
}



