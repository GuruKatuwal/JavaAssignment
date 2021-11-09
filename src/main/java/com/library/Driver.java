package com.library;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.library.controllers.Controller;


public class Driver {
	
	private static final Logger LOG = LogManager.getLogger(Driver.class);
	
	public static void main(String[] args) {
		LOG.trace("Started main method");
		// call first controller
		Controller.init();
		LOG.trace("Ended main method");
	}
}