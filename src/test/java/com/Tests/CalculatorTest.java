package com.Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.App.Calculator;

public class CalculatorTest {

	@Test
	public void testAdd() {
		int a = 20;
		int b = 30;
		int exp = 50;
		
		int act = Calculator.add(a, b);
		assertEquals(exp, act);
	}
	
	@Test
	public void testSub() {
		int exp = 20;
		int act  = Calculator.sub(50, 30);
		assertEquals(exp, act);
	}
	
	@Test
	public void testMul() {
		int exp = 150;
		int act  = Calculator.mul(5, 30);
		assertEquals(exp, act);
	}
	
	@Test
	public void testDiv() {
		int exp = 1;
		int act  = Calculator.div(20, 20);
		assertEquals(exp, act);
	}




}
