package hcmiu.scse.wad;

public class Counter {
	int count = 0;

	public Counter() {

	}

	// this method to get value
	public int getCount() {
		count++;
		return this.count;
	}

	// this method reset count value
	public void setCount(int counter) {
		this.count = counter;
	}
}