package com.tycho.test.rcp.product.tests;

import org.junit.Test;

/**
 * This test is an integration test: must be named with "*IT.java" pattern to be
 * executed by Tycho in the integration test phase. No need to have a product
 * built.
 * <p>
 * This test is not executed as of Tycho v2.6.0 because of this bug
 * https://github.com/eclipse/tycho/issues/643
 *
 * @author Gionata Boccalini
 */
public class ProductUtilsIT {

	@Test
	public void testProductUtilsIT() {
		System.err.println("Product IT test run!");
	}

}