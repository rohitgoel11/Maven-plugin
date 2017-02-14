package com.wellington.web.controller;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestApplicationTest {
	
	@SuppressWarnings("deprecation")
	@Test
	public void addTest(){
		Application app= new Application();
		double d= app.add(2.0, 2);
		assertEquals(4.0, d, 0.0);
	}

}
