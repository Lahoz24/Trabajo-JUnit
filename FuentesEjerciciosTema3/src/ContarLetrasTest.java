import static org.junit.Assert.*;

import org.junit.Test;

public class ContarLetrasTest {

	@Test
	public void test() {
		ContarLetras cL = new ContarLetras();
		int resultado= cL.contarLetras("ab", 'a');
		cL.contarLetras("ab", 'a');
		assertEquals(1, resultado, 0);
	}

	@Test
	public void testError() {
		ContarLetras cL = new ContarLetras();
		int resultado= cL.contarLetras("ab", 'a');
		cL.contarLetras("ab", 'a');
		assertEquals(2, resultado, 0);
	}
}
