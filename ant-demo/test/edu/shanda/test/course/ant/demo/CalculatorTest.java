package edu.shanda.test.course.ant.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		Calculator calculator = new Calculator();
		int expected = 5;
		int actual = calculator.add(2, 3);
		
		assertEquals(expected, actual);
	}

}
