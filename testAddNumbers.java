package jUnitTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddTest {

	@Test
	void test() {
		junittest1Test obj1= new junittest1Test();
		int result = obj1.add(10, 20);
		assertEquals(30,result);
	}

}
