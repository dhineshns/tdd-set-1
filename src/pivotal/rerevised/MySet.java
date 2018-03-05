package pivotal.rerevised;

public class MySet {

	int[] dataStore;
	int lastIndex;

	public MySet(int[] is) {
		dataStore = new int[10];
		lastIndex = -1;
		for(int i=0; i<is.length; i++){
			insert(is[i]);
		}
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

	public boolean delete(int item) {
		int i;
		for(i=0; i<lastIndex+1; i++){
			if(dataStore[i] == item){
				break;
			}
		}
		if(i<lastIndex+1){
			for(int j=i; j<lastIndex; j++){
				dataStore[j] = dataStore[j+1];
			}
		}
		lastIndex--;
		return false;
	}

}
