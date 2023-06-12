package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ass1 {
	
	
	
	@Test
	public void ass() {
		String target="Hello";
		String target2="Hellos";
	Assert.assertNotEquals(target, target2);

	Assert.assertFalse(target.equals(target2), "Failed");
	
	}

}
