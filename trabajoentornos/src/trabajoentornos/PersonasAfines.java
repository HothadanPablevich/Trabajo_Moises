package trabajoentornos;

public class PersonasAfines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean[][] mat = { { false, true, false, false, true, true }, { false, true, false, true, true, false, true },
				{ true, false, true, false, false, true, true }, { true, false, true, false, false, true, true },
				{ true, false, true, false, false, true, true }, { true, false, true, false, false, true, true },
				{ true, false, true, false, false, true, true }, { true, false, true, false, false, true, true },
				{ false, true, false, true, true, false, true }, { false, true, false, true, true, false, true } };

		int cont1 = 0;
		Matriz m1 = new Matriz(mat);
		
		System.out.println(esAfin(mat,5,4));
		
		

	}

	public static boolean esAfin(boolean[][] b, int n1, int n2) {
		int count = 0;
		boolean afin = false;
		
		
		for (int i = 0; i <1; i++) {
			for (int j = 0; j < b[i].length; j++) {
				
				if (b[n1][j] == b[n2][j]) {
					count++;
					if (count >= 3) {
						afin = true;
						
					} else {
						afin = false;
					}
				}
				

			}
		}
		
		return afin;
	}

}
