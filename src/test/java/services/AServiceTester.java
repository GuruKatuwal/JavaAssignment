package services;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.library.models.Book;
import com.library.services.AService;

public class AServiceTester {
	private static AService aService = new AService();
	
	@BeforeClass
	public static void setUpBeforeClass() {
		System.out.println("Runs once before alls test.");
	}
	
	@Before
	public void setUpBeforeEachTest() {
		System.out.println("Runs before each test.");
	}
	
	@After
	public void tearDownAfterEachTest() {
		System.out.println("Runs after each test.");
	}
	
	@AfterClass
	public static void TearDownAfterClass() {
		System.out.println("Runs once after alls test.");
	}
	
	
	@Test
	public void getBookFromArraySuccess() {
		// create any dummy data needed
		int index = 4;
		Book[] books = new Book[5];
		
		// call the method I am trying to test
		Book book = aService.getBookFromArray(index, books);
		
		// make an assertion
		assertNull(book);
	}
	
	@Test (expected = ArrayIndexOutOfBoundsException.class) 
	public void getStudentFromArrayThrowsExecption() {
		// create any dummy data needed
		int index = 6;
		Book[] books = new Book[5];
		
		// call the method I am trying to test
		Book book = aService.getBookFromArray(index, books);
		
	}
}
