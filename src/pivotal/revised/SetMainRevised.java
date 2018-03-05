package pivotal.revised;

public class SetMainRevised {

	int[] dataStore = new int[10]; // default size
	int lastIndex = -1;
	public Object size() {
		return lastIndex+1;
	}

	public int insert(int item) {
		lastIndex++;
		dataStore[lastIndex] = item;
		return item;
	}

}
