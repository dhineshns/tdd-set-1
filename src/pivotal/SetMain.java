package pivotal;

import java.lang.reflect.Array;
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

	public void insert(int item) {
		if(lastIndex<=dataStore.length/2){
			lastIndex++;
			dataStore[lastIndex] = item;
		}else{
			int[] tempDataStore = new int[dataStore.length*2];
			for(int i=0; i<dataStore.length; i++){
				tempDataStore[i] = dataStore[i];
			}
			dataStore = tempDataStore;
			insert(item);
		}
	}

	public Object size() {
		return lastIndex+1;
	}

	public Object contains(int item) {
		for(int i=0; i<dataStore.length; i++){
			if(dataStore[i] == item){
				return true;
			}
		}
		return false;
	}

};