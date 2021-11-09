package com.library.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.library.views.View;

public class Controller {
	
	private static Logger log = LogManager.getLogger(Controller.class);
	
	public static void init () {
		log.trace("Started Init method");
		//welcome method
		View.displayWelcome();
		
		//make sure log in
		boolean isLoggedIn = View.displayLogin();
		
//		while(isLoggedIn) {
//			log.trace("Started top menu");
//			View.displayStudentRecords();
//			int choice = View.displayTopMenu();
//			switch(choice) {
			//choose user
//			case 1:
//				//Delete record
//				//update record
//			case 2:
//				break;
//				//quit	
//			case 3:
//				isLoggedIn = false;
//				break;
//				System.out.println("Bad input");
//			}
//			log.debug("is user still logged in: " + isLoggedIn);
//			log.trace("Exit top menu loop");
//			
//		}
		
	}
}
