package pivotal;

import java.lang.reflect.Array;
import java.util.HashSet;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

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
			for(int i = 0; i<=lastIndex; i++){
				if(dataStore[i] == item){
					return;
				}
			}
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
	// todo : till datastore.length or lastindex
	public Object contains(int item) {
		for(int i=0; i<dataStore.length; i++){
			if(dataStore[i] == item){
				return true;
			}
		}
		return false;
	}

	public Object delete(int item) {
		// move the item to the last and reduce the lastindex
		// if I find the item,
		int i;
		for( i=0; i<dataStore.length; i++){
			if(dataStore[i] == item){
				break;
			}
		}
		if(i<dataStore.length){
			lastIndex--;
			int n = dataStore.length -1;
			for(int j = 0; j< n; j++){
				dataStore[j] = dataStore[j+1];
			}
			return true;
		}
		
		return false;
	}

};