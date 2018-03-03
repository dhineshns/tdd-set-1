package pivotal;

import static org.junit.Assert.*;

import org.junit.Test;

public class SetMainTest {
	// Req 1 : Insert 1 element and see the size of the set
	@Test
	public void testSetInsert1Element(){
		SetMain setMain = new SetMain();
		setMain.insert(1);
		assertEquals(1, setMain.size());
	}
}
