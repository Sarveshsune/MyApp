package com.Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.App.Converter;

public class ConverterTest {

	@Test	
	public void testkmToMile() {
		int length = 100;
		double exp = 62.1;
		
		double act = Converter.kmToMile(length);
		assertEquals(exp, act,0.01);
	}
	
	@Test
	public void testCelToFar() {
		int temp = 50;
		int exp = 122;
		
		int act = Converter.cTof(temp);
		assertEquals(exp, act);
	}

}
