package com.iwcn.master.services;

import org.junit.Test;

import com.iwcn.master.SpringServerRest;

public class MainTest {

	@Test
	public void testSpringServerRest() {
		String[] stringPrueba = {"PruebaOK"};
		SpringServerRest.main(stringPrueba);
	}

}
