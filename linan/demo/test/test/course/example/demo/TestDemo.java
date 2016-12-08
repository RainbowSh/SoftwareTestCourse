/**
 * MigrateTool
 * mtn.zzxysh.migrate.dao
 * Create time: 2013
 * Author: aoyi
 */
package test.course.example.demo;

import static org.junit.Assert.*;

//import static org.hamcrest.core.Is.*;
//import static org.hamcrest.core.IsNot.*;
//import static org.hamcrest.core.IsInstanceOf.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Rainbow
 *
 */
public class TestDemo {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/*
	 * 1st exapmle
	 */
	@Test
	public void aSimpleTestCase() {
		String s1 = "Hello";	

		assertNotNull(s1);
		
//		assertNotEquals("abc", s1);		
//		assertEquals("Hello", s1);
		
//		assertTrue(s1.getClass() == String.class);		
//		assertFalse(s1.isEmpty());
		
//		assertThat(s1, is("Hello"));
//		assertThat(s1, is(not("abc")));
//		assertThat(s1, instanceOf(String.class));
	}	
}
