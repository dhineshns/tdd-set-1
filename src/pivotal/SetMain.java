package pivotal;

import java.util.HashSet;

public class SetMain {
	int[] dataStore;
	int lastIndex = -1;
	public SetMain(int extremelyLargeInt) {
		dataStore = new int[extremelyLargeInt];
	}

	public SetMain() {
		dataStore = new int[10];
	}

	public void insert(int i) {
		lastIndex++;
		dataStore[lastIndex] = i;
	}

	public Object size() {
		return lastIndex+1;
	}
	
};