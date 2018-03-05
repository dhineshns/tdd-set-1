package pivotal.rerevised;

import static org.junit.Assert.*;

import org.junit.Test;

public class MySetTest {

	@Test
	public void testMySetGetEmptySet() {
		MySet mySet = new MySet();
		assertEquals(false, mySet.get(1));
	}

}
