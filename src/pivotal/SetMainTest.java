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
	
	// Req 2 : Insert multi elements and look at size
	@Test
	public void testSetInsertMultiElements(){
		SetMain setMain = new SetMain();
		for(int i=0; i < 10; i++){
			setMain.insert(i);
		}
		assertEquals(10, setMain.size());
	}
	
	// Req 3 : Insert when more extrememly large elements
	@Test
	public void TestSetInsetExtremelyLarge(){
		int extremelyLargeInt = 100000;
		SetMain setMain = new SetMain(extremelyLargeInt);
		for(int i = 0; i< extremelyLargeInt; i++){
			setMain.insert(i);
		}
		assertEquals(extremelyLargeInt, setMain.size());
				
	}
}
