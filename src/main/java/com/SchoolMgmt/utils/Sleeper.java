package com.SchoolMgmt.utils;


public class Sleeper {

	public static void sleep () {

		try {
			Thread.sleep (2000);
		}
		catch (final InterruptedException e) {
			e.printStackTrace ();
		}
	}

	private Sleeper () {
	}

}
	

