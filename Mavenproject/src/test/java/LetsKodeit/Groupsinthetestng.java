package LetsKodeit;

import org.testng.annotations.Test;

public class Groupsinthetestng {


	
	@Test(groups="Smol")
	public void qw() {
		System.out.println("This is an first working");
	}
	
	@Test(groups="Smol")
	public void qwe() {
		System.out.println("This is an second working");
	}
	
	@Test(groups="Smol")
	public void qa() {
		System.out.println("This is an third working");
	}

}
