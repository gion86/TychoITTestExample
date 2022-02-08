package com.tycho.test.rcp.core.test;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import org.junit.Test;

/**
 * This test is an integration test: must be named with a "*Test.java" suffix to
 * be executed by Tycho in the Unit test phase, after the product has been
 * created.
 * <p>
 * I haven't found a way to execute "*IT.java" test in the integration test
 * phase.
 *
 * @author Gionata Boccalini
 */
public class CoreUtilsITTest {

	@Test
	public void testCoreUtilsIT() throws NoSuchAlgorithmException, IOException {
		System.err.println("Product IT test run!");
	}

}