package pivotal;

import java.util.HashSet;

public class SetMain {
	int[] dataStore = new int[10];
	int lastIndex = -1;
	public void insert(int i) {
		lastIndex++;
		dataStore[lastIndex] = i;
	}

	public Object size() {
		return lastIndex+1;
	}
	
};