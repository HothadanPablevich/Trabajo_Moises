package trabajoentornos;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MatrizTestJunit {

	private static String [] p= {"a","b","c","d","e","f","g","h","i","j"};
	private static Matriz m1;
	private static String letra, numero;
	 
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		m1=new Matriz(p);
		letra="A";
		numero="1";
		
		
	}


	@Test
	void testIsNumericTrue() {
		assertTrue(m1.isNumeric(numero));
		
	}
	
	@Test
	void testIsNumericFalse() {
		assertFalse(m1.isNumeric(letra));
		
	}
	

	@Test
	void testEsAfinTrue() {
		assertTrue(m1.esAfin("a", "b"));

	}
	
	@Test
	void testEsAfinFalse() {
		assertFalse(m1.esAfin("c", "d"));

	}

	@Test
	void testControlOpinionTrue() {
		assertTrue(m1.controlOpinion("fffff", 0, 0));

	}
	
	@Test
	void testControlOpinionFalse() {
		assertFalse(m1.controlOpinion("yes", 0, 0));

	}


	@Test
	void testControlNoRepeatStringInArrayFalse() {
		assertFalse(m1.controlNoRepeatStringInArray(10, 4, p));
		
	
	}

	@Test
	void testSearchPersonas() {
		
		assertEquals(0, m1.searchPersonas("a"));
		
	}

}
