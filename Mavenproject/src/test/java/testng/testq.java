package testng;



import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testq {
	
	
	/*
	 * Testng annotions for the following
	 * the following STCM THEN REVERSE WITH AFTER
	 * In this before suite willl execute only once after that before class and before test will be executed this is testng
	 * this following works as testng this is an antares.
	 */

	@Test
	public void jad() {

		System.out.println("The following is an test");

	}

	@BeforeTest
	public void first() {

		System.out.println("This is an test");
	}

	@BeforeMethod
	public void second() {

		System.out.println("This is an eb fore method");

	}

	@Test
	public void jads() {

		System.out.println("The following is an test 2");

	}

	@BeforeClass
	public void shammi() {

		System.out.println("This is an before class");

	}

}
