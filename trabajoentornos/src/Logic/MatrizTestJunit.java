package Logic;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Logic.Functions;

class MatrizTestJunit {

	private static String [] p= {"a","b","c"};
	private static MatchFinderLogic m1= new MatchFinderLogic();
	private static boolean [][] matrizBool= {{true,true,true,true,true,false,false},{true,true,true,true,true,false,false}
	,{false,false,false,false,false,false,false}};
	private static Functions f1;
	 
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		
		
		m1.setPersonas(p);
		m1.setMatriz(matrizBool);
		
	}
	
	@Test
	void testEsAfinTrue() {
		assertTrue(Functions.esAfin(0,1,m1));

	}
	
	@Test
	void testEsAfinFalse() {
		assertFalse(Functions.esAfin(0,2,m1));

	}
	
}
