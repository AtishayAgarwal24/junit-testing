package jUnitTestPackage;

import static org.junit.Assert.*;

public class testAddStrings {
	
	@test
	public void test() {
		jUnitFunction junitstring = new jUnitFunction();
		String result = junitstring.addStrings("capstone","project");
		assertEquals("capstoneproject",result);
	}

}
