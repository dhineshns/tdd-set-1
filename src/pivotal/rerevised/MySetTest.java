package pivotal.rerevised;

import static org.junit.Assert.*;

import org.junit.Test;

public class MySetTest {

	@Test
	public void testMySetIsExistsEmptySet() {
		MySet mySet = new MySet();
		assertEquals(false, mySet.isExists(1));
	}
	
	@Test
	public void testMySetIsExistsNonEmptySet(){
		MySet mySet = new MySet(new int[]{1});
		assertEquals(true, mySet.isExists(1));
		assertEquals(false, mySet.isExists(2));
	}
	@Test
	public void testMySetInsert1Element(){
		MySet mySet = new MySet();
		assertEquals(true, mySet.insert(1));
		assertEquals(true, mySet.isExists(1));
		assertEquals(false, mySet.isExists(2));
	}
	@Test
	public void testMySetInsertDuplicates(){
		MySet mySet = new MySet();
		mySet.insert(1);
		mySet.insert(1);
		assertEquals(true, mySet.isExists(1));
		assertEquals(1, mySet.size());
	}
	@Test
	public void testMySetInsertMoreThanDefaultSize(){
		MySet mySet = new MySet();
		for(int i=0; i<11; i++){
			mySet.insert(i);
		}
		assertEquals(11, mySet.size());
	}

}
