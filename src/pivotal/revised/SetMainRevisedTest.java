package pivotal.revised;

import static org.junit.Assert.*;

import org.junit.Test;

import pivotal.SetMain;

public class SetMainRevisedTest {

	// set insert tests
	@Test
	public void testSetInsertNoInsert(){
		SetMainRevised setMainRevised = new SetMainRevised();
		assertEquals(0, setMainRevised.size());
	}

}
