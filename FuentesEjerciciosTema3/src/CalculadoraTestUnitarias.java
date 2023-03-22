import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTestUnitarias {

	@Test
	
	public void testSuma() {
		Calculadora calc = new Calculadora();
		float resultado = calc.suma(8, 3);
		assertEquals(11, resultado, 0);
		
	}
	
	@Test
	public void testResta() {
		Calculadora calc = new Calculadora();
		float resultado = calc.resta(8, 3);
		assertEquals(5, resultado, 0);
	}
	
	@Test
	public void testMultiplicacion() {
		Calculadora calc = new Calculadora();
		float resultado = calc.multiplicacion(8, 3);
		assertEquals(24, resultado, 0);
	}
	
	@Test
	public void testDivision() {
		Calculadora calc = new Calculadora();
		float resultado = calc.division(8, 2);
		assertEquals(4, resultado, 0);
	}
	
	@Test
	public void testRaizCuadrada() {
		Calculadora calc = new Calculadora();
		float resultado = calc.raiz_cuadrada(25);
		assertEquals(5, resultado, 0);
	}
	
	
	/*
	 * test errores
	 */
	

	@Test
	
	public void testSumaError() {
		Calculadora calc = new Calculadora();
		float resultado = calc.suma(8, 3);
		assertEquals(14, resultado, 0);
		
	}
	
	@Test
	public void testRestaError() {
		Calculadora calc = new Calculadora();
		float resultado = calc.resta(8, 3);
		assertEquals(9, resultado, 0);
	}
	
	@Test
	public void testMultiplicacionError() {
		Calculadora calc = new Calculadora();
		float resultado = calc.multiplicacion(8, 3);
		assertEquals(54, resultado, 0);
	}
	
	@Test
	public void testDivisionError() {
		Calculadora calc = new Calculadora();
		float resultado = calc.division(8, 2);
		assertEquals(8, resultado, 0);
	}
	
	@Test
	public void testRaizCuadradaError() {
		Calculadora calc = new Calculadora();
		float resultado = calc.raiz_cuadrada(25);
		assertEquals(7, resultado, 0);
	}
}
