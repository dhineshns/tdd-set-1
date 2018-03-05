package pivotal.rerevised;

public class MySet {

	int[] dataStore;
	int lastIndex;

	public MySet(int[] is) {
		dataStore = is;
		lastIndex = dataStore.length-1;
	}
	
	public MySet(){
		dataStore = new int[10];
		lastIndex = -1;
	}

	public boolean isExists(int item) {
		for(int i=0; i<lastIndex+1; i++){
			if(dataStore[i]==item){
				return true;
			}
		}
		return false;
	}

	public boolean insert(int item) {
		if(lastIndex <= dataStore.length/2){
			for(int i=0; i<lastIndex+1; i++){
				if(dataStore[i] == item){
					return false;
				}
			}
			lastIndex++;
			dataStore[lastIndex] = item;
			return true;
		}else{
			int[] tempStore = new int[dataStore.length*2];
			for(int i=0; i<lastIndex+1; i++){
				tempStore[i] = dataStore[i];
			}
			dataStore = tempStore;
			insert(item);
		}
		return false;
	}

	public int size() {
		return lastIndex+1;
	}

}
