package testGradel1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*; 

public class CalculadoraTest {

	@Test
	public void sumaTest() {
		
		Calculadora calculo = new Calculadora();
		
		assertEquals(2, calculo.suma(1,1));
	}
	
}
