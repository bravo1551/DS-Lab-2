import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class powerOfTwoTest {

	@Test
	void test() {
		PowerOfTwo test = new PowerOfTwo();
		boolean output = test.isPowerOfTwo(8);
		assertEquals(false, output);
		//fail("Not yet implemented");
	}

}
