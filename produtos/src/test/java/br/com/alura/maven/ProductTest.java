package br.com.alura.maven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProductTest {

	@Test
	public void verifyPriceWithTax() {
		Product productOne = new Product("Nintendo Switch", 2999.0);
		assertEquals(3298.9, productOne.getPriceWithTax(), 0.00001);
	}

}
