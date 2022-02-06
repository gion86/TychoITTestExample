package com.tycho.test.rcp.core;

import org.eclipse.ui.IStartup;

public class Startup implements IStartup {

	@Override
	public void earlyStartup() {
		System.err.println("STARTUP!");
	}
}
