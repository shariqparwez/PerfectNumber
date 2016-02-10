package com.training.domains;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PerfectNumberTestCase {

	PerfectNumber perfectNumber = null;
	@Before
	public void setUp() throws Exception {
		//perfectNumber = new PerfectNumber(23);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPositive() throws Exception {
		perfectNumber = new PerfectNumber(23);
		assertTrue(perfectNumber.getNumber()>0);
	}
	
	@Test (timeout=100)
	public void testResultNegative() throws Exception{
		perfectNumber = new PerfectNumber(36);
		assertFalse(perfectNumber.checkPerfectNumber()); 
	}
	
	@Test (timeout=100)
	public void testResultPositive() throws Exception{
		perfectNumber = new PerfectNumber(28);
		assertTrue(perfectNumber.checkPerfectNumber()); 
	}
	
	@Test
	public void testPrintResultArgumentMin() throws Exception{
		perfectNumber = new PerfectNumber(1,100);
		assertTrue(perfectNumber.getMin()>0);
	}
	
	@Test
	public void testPrintResultArgumentMax() throws Exception{
		perfectNumber = new PerfectNumber(1,100);
		assertTrue(perfectNumber.getMax()>0);
	}
	
	@Test
	public void testPrintResult() throws Exception{
		perfectNumber = new PerfectNumber(100,1);
		perfectNumber.printPerfectNumbers();
	}
	
	

}
