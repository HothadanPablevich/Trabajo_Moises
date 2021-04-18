package trabajoentornos;

public class Matriz {
	
	private boolean [][] matriz= new boolean[10][7];
	private String [] personas= new String[10];
	private String [] hobbies= new String[10];
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
	public void setMatriz() {}
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
	

}
