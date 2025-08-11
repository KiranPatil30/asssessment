package test.java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.Java.Calculator;

public class CalculatorTest {
	Calculator cal = new Calculator();
	
	@Test
	public void testAdd() {
		assertEquals(14,cal.addition(10, 4));
	}
	
	@Test
	public void testSub() {
		assertEquals(25,cal.subtraction(50, 25));
	}
	
	@Test
	public void testMul() {
		assertEquals(100,cal.multiplication(10, 10));
	}
	
	@Test
	public void testDiv() {
		assertEquals(5,cal.division(25, 5));
	}

}
