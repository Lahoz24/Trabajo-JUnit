import static org.junit.Assert.*;

import org.junit.Test;

public class PruebasCoberturaCalculadora {
	
	Calculadora c = new Calculadora();

	
	
	@Test
	public void testSuma() {
		assertEquals(4, c.suma(2, 2), 0);

	}
	@Test
	public void testResta() {
		assertEquals(0, c.resta(2, 2), 0);
	}
	@Test
	public void testMultiplicacion() {
		assertEquals(8, c.multiplicacion(4, 2), 0);
	}
	@Test
	public void testDivision() {
		assertEquals(10, c.division(20, 2), 0);
	}
	@Test
	public void testRaizCuadrada() {
		assertEquals(4, c.raiz_cuadrada(16), 0);
	}
	
	
	
	/*
	 * Prueba de errores 
	
	 */
	
	
	@Test
	public void testErrorSuma() {
		assertEquals(5, c.suma(2,2), 0);
	}
	@Test
	public void testErrorResta() {
		assertEquals(6, c.resta(2, 2), 0);
	}
	@Test
	public void testErrorMultiplicacion() {
		assertEquals(9, c.multiplicacion(4, 2), 0);
	}
	@Test
	public void testErrorDivision() {
		assertEquals(15, c.division(20, 2), 0);
	}
	
	@Test
	public void testErrorRaizCuadrada() {
		assertEquals(5, c.raiz_cuadrada(16), 0);

	}
	
}