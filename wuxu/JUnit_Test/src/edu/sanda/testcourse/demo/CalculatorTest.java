package edu.sanda.testcourse.demo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	private static Calculator calculator = new Calculator();

	@Before
	public void setUp() throws Exception {
		calculator.clear();
	}

	@Test
	public void testAdd() {
		calculator.add(2);
		calculator.add(3);
		assertEquals(5,calculator.getResult());
	}
	@Test
	public void testSubstract() {
		calculator.add(10);
		calculator.substract(3);
		assertEquals(7,calculator.getResult());
	}
	@Test
	public void testMultiply() {
		calculator.add(1);
		calculator.multiply(3);
		assertEquals(3,calculator.getResult());
	}
	@Test
	public void testDivide() {
		calculator.add(9);
		calculator.divide(3);
		assertEquals(3,calculator.getResult());
	}


}
