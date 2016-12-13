package edu.shanda.testcourse.demo;

import static org.junit.Assert.*;

import org.junit.Test;



public class StackTest {

	@Test
	public void ShouldPushStringThenPop() {
		
		InputStack actual = new InputStack();
		
//		assert
//      push		
    	assertEquals("c" , actual.push("c"));
		assertEquals("ch" , actual.push("h"));
		assertEquals("cha" , actual.push("a"));
     	assertEquals("char" , actual.push("r"));
		
//      pop
		
		assertEquals('r', actual.pop());
		assertEquals('a', actual.pop());
		assertEquals('h', actual.pop());
        assertEquals('c', actual.pop());
	
	}
	

}
