package com.library.views;

import java.util.ArrayList;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;




public class View {
	private static final Scanner scanner = new Scanner(System.in);
	private static Logger log = LogManager.getLogger(View.class);
	
	public static void displayWelcome() {
		System.out.println("--------------------------------------------------------");
		System.out.println("Welcome to the Library  Management System Project");
		System.out.println("--------------------------------------------------------");
	}
	
	public static boolean displayLogin() {
		System.out.println("User Name: ");
		String userName = scanner.nextLine();
		System.out.println("password");
		scanner.nextLine();
		System.out.println("Welcome, " + userName + "\n");
		return true;
	}
//	public static void displayBookRecords() {
//		System.out.printf("\n==================== Current Students  =====================\n");
//		ArrayList<Book> books = BookDAOImpl.getAllBooks();
//		for (Book book : books) {
//			System.out.println(book);
//		}
//		
//		
//		displayDoingWellCount();
//		System.out.printf("============================================================\n");
//	}
//	
//	public static void displayDoingWellCount() {
//		int count = studentService.getDoingWellCount();
//		System.out.printf("%nCount of students doing well: %d%n", count);
//	}
//	
	public static int displayTopMenu() {
		System.out.printf("\n"
				+ "1) Choose student by first and last name \n"
				+ "2) Add a student\n"
				+ "3) Quit\n");
		return Integer.parseInt(scanner.nextLine());
	}
	
	public static void displayGoodbye() {
		System.out.printf("\n Logging out and exiting system. \n"
				+ "===============================================\n\n");
	}

}
