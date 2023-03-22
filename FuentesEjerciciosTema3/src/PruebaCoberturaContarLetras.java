import static org.junit.Assert.*;

import org.junit.Test;

public class PruebaCoberturaContarLetras {

	static ContarLetras cL= new ContarLetras();
	
	@Test
	public void testCobertura() {
		
		assertEquals(1, cL.contarLetras("ab", 'a'));
		
	}

	@Test
	public void testCoberturaError() {
		
		assertEquals(2, cL.contarLetras("ab", 'a'));
		
	}
	
	
}
